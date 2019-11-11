package hu.blackbelt.judo.meta.jql.ide.sirius.internal;

import org.eclipse.eef.EEFControlDescription;
import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.eef.EEFCustomWidgetStyle;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager;
import org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManagerProvider;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

public class JqlSiriusEefLifecycleManagerProvider implements IEEFLifecycleManagerProvider {

	private static final String SUPPORTED_ID = "jqlExpression";

	@Override
	public boolean canHandle(EEFControlDescription controlDescription) {
		return SUPPORTED_ID.equals(controlDescription.getIdentifier());
	}

	@Override
	public IEEFLifecycleManager getLifecycleManager(EEFControlDescription controlDescription,
			IVariableManager variableManager, IInterpreter interpreter, EditingContextAdapter editingContextAdapter) {
		EEFCustomWidgetDescription description = (EEFCustomWidgetDescription) controlDescription;
		return new JqlSiriusEefLifecycleManager(description, variableManager, interpreter, editingContextAdapter);
	}

}
