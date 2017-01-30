package com.dbrianmiller.arpahealth.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
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
		EventBus eventBus = new SimpleEventBus();
		AppController appViewer = new AppController(eventBus);
		RootPanel rootPanel = RootPanel.get();
		appViewer.go(rootPanel);
	}
}