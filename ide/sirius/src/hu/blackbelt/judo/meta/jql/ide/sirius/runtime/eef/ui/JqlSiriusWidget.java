package hu.blackbelt.judo.meta.jql.ide.sirius.runtime.eef.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.IDocumentExtension4;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;

import com.google.inject.Inject;
import com.google.inject.Injector;

public class JqlSiriusWidget {

	@Inject
	private EmbeddedEditorFactory embeddedEditorFactory;

	private Injector injector;
	private int lineCount = 5;

	private EmbeddedEditor editor;
	private EmbeddedEditorModelAccess editorAccess;
	private JqlSiriusEditedResourceProvider editedResourceProvider;
	private EObject self;

	private long modificationStamp = IDocumentExtension4.UNKNOWN_MODIFICATION_STAMP;

	public JqlSiriusWidget(EObject self, Composite parent, Injector injector) {
		this.self = self;
		this.injector = injector;
		injector.injectMembers(this);

		createEditor(parent);
	}

	public void setValue(String newValue) {
		if (newValue != null) {
			this.editorAccess.updateModel(newValue);
			resetDirty();
		}
		
	}

	private void resetDirty() {
		this.modificationStamp = retrieveModificationStamp();
	}

	private long retrieveModificationStamp() {
		return this.editor.getDocument().getModificationStamp();
	}

	public boolean isDirty() {
		return this.modificationStamp != retrieveModificationStamp();
	}

	private void createEditor(Composite parent) {
		editedResourceProvider = new JqlSiriusEditedResourceProvider(self, injector);
		editor = embeddedEditorFactory.newEditor(this.editedResourceProvider).withParent(parent);
		editor.getViewer().setData("self", self);
		StyledText textWidget = editor.getViewer().getTextWidget();
		GridData gridData = new GridData(SWT.FILL, SWT.BEGINNING, true, false);
		gridData.heightHint = lineCount * textWidget.getLineHeight();
		gridData.widthHint = 300;
		gridData.horizontalIndent = 0;
		textWidget.setLayoutData(gridData);
		editorAccess = editor.createPartialEditor(true);
	}

	public Control getControl() {
		return editor != null ? editor.getViewer().getControl() : null;
	}

	public String getText() {
		StyledText textWidget = getTextWidget();
		return textWidget != null ? textWidget.getText() : null;
	}

	public StyledText getTextWidget() {
		return editor != null ? editor.getViewer().getTextWidget() : null;
	}

}
