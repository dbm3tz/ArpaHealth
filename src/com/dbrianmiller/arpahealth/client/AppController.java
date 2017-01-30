package com.dbrianmiller.arpahealth.client;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.dbrianmiller.arpahealth.client.presenter.LoginPagePresenter;
import com.dbrianmiller.arpahealth.client.presenter.Presenter;
import com.dbrianmiller.arpahealth.client.view.LoginPageView;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.HasWidgets;

public class AppController implements ValueChangeHandler<String> {

	private Logger LOG = Logger.getLogger(AppController.class.toString());
	private HasWidgets container;
	EventBus eventBus;

	public AppController(EventBus eventBus) {
		this.eventBus = eventBus;
		LOG.setLevel(Level.INFO);
		LOG.config("Constructing AppController");
		bind();
	}

	public void go(final HasWidgets container) {
		this.container = container;
		String token = History.getToken();
		if ("".equals(token)) {
			History.newItem("login");
		} else {
			History.fireCurrentHistoryState();
		}
	}

	@Override
	public void onValueChange(ValueChangeEvent<String> event) {
		String token = event.getValue();
		if (token != null) {
			Presenter presenter = null;
			if ("login".equals(token)) {
				presenter = new LoginPagePresenter(eventBus, new LoginPageView());
			}
			if (presenter != null) {
				presenter.go(container);
			}
		}
	}

	private void bind() {
		History.addValueChangeHandler(this);
	}

}
