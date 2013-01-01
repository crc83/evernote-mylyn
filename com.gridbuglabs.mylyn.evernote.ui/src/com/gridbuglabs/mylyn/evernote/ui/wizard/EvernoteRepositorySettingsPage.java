package com.gridbuglabs.mylyn.evernote.ui.wizard;

import org.eclipse.mylyn.tasks.core.RepositoryTemplate;
import org.eclipse.mylyn.tasks.core.TaskRepository;
import org.eclipse.mylyn.tasks.ui.wizards.AbstractRepositorySettingsPage;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import com.gridbuglabs.mylyn.evernote.core.EvernoteCorePlugin;

public class EvernoteRepositorySettingsPage extends
		AbstractRepositorySettingsPage {

	public EvernoteRepositorySettingsPage(TaskRepository taskRepository) {
		super("Evernote Repository Settings", "Settings for Evernote Repository", taskRepository);
		setNeedsAnonymousLogin(false);
		setNeedsEncoding(false);
		setNeedsTimeZone(false);
		setNeedsAdvanced(false);
		setNeedsProxy(false);
	}

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		addRepositoryTemplatesToServerUrlCombo();
	}

	@Override
	protected void repositoryTemplateSelected(RepositoryTemplate template) {
		repositoryLabelEditor.setStringValue(template.label);
		setUrl(template.repositoryUrl);
		setUserId("user");
		setPassword("pass");
		
		getContainer().updateButtons();
	}
	
	@Override
	public String getConnectorKind() {
		return EvernoteCorePlugin.CONNECTOR_KIND;
	}

	@Override
	protected void createAdditionalControls(Composite parent) {
		// TODO Auto-generated method stub

	}

	@Override
	protected Validator getValidator(TaskRepository repository) {
		// TODO Auto-generated method stub
		return null;
	}

}
