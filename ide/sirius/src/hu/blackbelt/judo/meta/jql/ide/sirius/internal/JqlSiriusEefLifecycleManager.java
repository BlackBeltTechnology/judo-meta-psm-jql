package hu.blackbelt.judo.meta.jql.ide.sirius.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.logging.Logger;

import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.EefFactory;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import com.google.inject.Injector;

import hu.blackbelt.judo.meta.jql.ide.sirius.runtime.eef.ui.JqlSiriusWidget;
import hu.blackbelt.judo.meta.jql.ui.sirius.JqlSiriusLanguageInjector;
import hu.blackbelt.judo.meta.esm.expression.ExpressionType;
import hu.blackbelt.judo.meta.esm.expression.impl.AttributeSelectorTypeImpl;

public class JqlSiriusEefLifecycleManager extends AbstractEEFWidgetLifecycleManager {

	private final Logger log = Logger.getLogger(JqlSiriusEefLifecycleManager.class.getName());
	private Injector injector;

	private EEFCustomWidgetDescription description;
	private JqlSiriusController controller;
	private JqlSiriusWidget widget;
	private EObject self;
	private Consumer<Object> newValueConsumer;

	public JqlSiriusEefLifecycleManager(EEFCustomWidgetDescription controlDescription, IVariableManager variableManager,
			IInterpreter interpreter, EditingContextAdapter editingContextAdapter) {
		super(variableManager, interpreter, editingContextAdapter);
		this.self = (EObject) variableManager.getVariables().get("self");
		this.description = controlDescription;
		this.injector = new JqlSiriusLanguageInjector().getInjector();
	}

	@Override
	protected IEEFWidgetController getController() {
		return controller;
	}

	@Override
	protected EEFCustomWidgetDescription getWidgetDescription() {
		return description;
	}

	@Override
	protected void createMainControl(Composite parent, IEEFFormContainer formContainer) {
		widget = new JqlSiriusWidget(self, parent, injector);
		controller = new JqlSiriusController(description, variableManager, interpreter, editingContextAdapter);
	}

	@Override
	public void refresh() {
		controller.refresh();
	}

	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();
		newValueConsumer = (newValue) -> {
			widget.setValue((String)newValue);
		};
		controller.onNewValue(newValueConsumer);
	}

	@Override
	public void aboutToBeHidden() {
		if (widget.isDirty()) {
			commit(widget.getText());
		}

		controller.removeValueConsumer();
		newValueConsumer = null;
	
		super.aboutToBeHidden();
	}

	private void commit(String text) {
		editingContextAdapter.performModelChange(() -> {
			String editExpression = "aql:input.emfEditServices(self).setValue(expression, newValue)";
			Map<String, Object> variables = new LinkedHashMap<>();
			variables.putAll(variableManager.getVariables());
			variables.put(EEFExpressionUtils.EEFText.NEW_VALUE, text);
			variables.put("expression", ((EObject)variables.get("self")).eClass().getEStructuralFeature("expression"));
			EvalFactory.of(this.interpreter, variables).call(editExpression);
		});
	}

	@Override
	protected void setEnabled(boolean isEnabled) {
		widget.getControl().setEnabled(isEnabled);
	}

	@Override
	protected Control getValidationControl() {
		return widget.getControl();
	}

}
