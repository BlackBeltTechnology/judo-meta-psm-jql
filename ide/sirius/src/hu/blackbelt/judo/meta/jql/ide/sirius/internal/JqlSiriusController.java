package hu.blackbelt.judo.meta.jql.ide.sirius.internal;

import java.util.function.Consumer;

import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.AbstractEEFCustomWidgetController;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

public class JqlSiriusController extends AbstractEEFCustomWidgetController {

	private static final String VALUE_EXPRESSION = "aql:self.expression";
	private EEFCustomWidgetDescription description;
	private Consumer<Object> newValueConsumer;

	public JqlSiriusController(EEFCustomWidgetDescription description, IVariableManager variableManager,
			IInterpreter interpreter, EditingContextAdapter editingContextAdapter) {
		super(description, variableManager, interpreter, editingContextAdapter);
		this.description = description;
	}

	@Override
	protected EEFCustomWidgetDescription getDescription() {
		return description;
	}

	@Override
	public void refresh() {
		super.refresh();
		newEval().call(VALUE_EXPRESSION, newValueConsumer);
	}

		public void onNewValue(Consumer<Object> newValueConsumer) {
		this.newValueConsumer = newValueConsumer;
	}

	public void removeValueConsumer() {
		this.newValueConsumer = null;
	}

}
