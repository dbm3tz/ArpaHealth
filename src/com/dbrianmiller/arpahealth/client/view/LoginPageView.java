package com.dbrianmiller.arpahealth.client.view;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.dbrianmiller.arpahealth.client.presenter.LoginPagePresenter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class LoginPageView extends Composite implements LoginPagePresenter.Display {

	private static LoginPageViewUiBinder uiBinder = GWT.create(LoginPageViewUiBinder.class);
	private Logger LOG = Logger.getLogger(LoginPageView.class.toString());

	interface LoginPageViewUiBinder extends UiBinder<Widget, LoginPageView> {
	}

	public LoginPageView() {
		initWidget(uiBinder.createAndBindUi(this));
		LOG.setLevel(Level.INFO);
	}

}
