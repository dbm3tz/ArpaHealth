package com.dbrianmiller.arpahealth.client.presenter;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;

public class LoginPagePresenter implements Presenter {

	public interface Display {
		Widget asWidget();
	}

	private Logger LOG = Logger.getLogger(LoginPagePresenter.class.toString());
	private Display display;

	public LoginPagePresenter(EventBus eventBus, Display display) {
		LOG.setLevel(Level.INFO);
		this.display = display;
		bind();
		LOG.config("Constructing LoginPagePresenter");
	}

	@Override
	public void go(HasWidgets hasWidgets) {
		hasWidgets.clear();
		hasWidgets.add(display.asWidget());
	}

	/**
	 * Add handlers to display widgets and process actions
	 */
	private void bind() {

	}

}
