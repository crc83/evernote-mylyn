package com.gridbuglabs.mylyn.evernote.ui.editor;

import org.eclipse.mylyn.tasks.ui.editors.AbstractTaskEditorPageFactory;
import org.eclipse.mylyn.tasks.ui.editors.TaskEditor;
import org.eclipse.mylyn.tasks.ui.editors.TaskEditorInput;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.forms.editor.IFormPage;

public class EvernoteTaskEditorPageFactory extends
		AbstractTaskEditorPageFactory {

	public EvernoteTaskEditorPageFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canCreatePageFor(TaskEditorInput input) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IFormPage createPage(TaskEditor parentEditor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Image getPageImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPageText() {
		// TODO Auto-generated method stub
		return null;
	}

}
