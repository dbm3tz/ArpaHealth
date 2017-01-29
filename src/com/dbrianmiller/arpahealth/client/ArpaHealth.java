package com.dbrianmiller.arpahealth.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 * 
 * @author Brian
 *
 */
public class ArpaHealth implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		RootPanel rootPanel = RootPanel.get();
		Label label = new Label("Generic Label");
		rootPanel.add(label);
	}
}