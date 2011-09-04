package com.bigshoulders.webapp;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;


public class HomePage extends WebPage {
	public HomePage(){
		add(new Label("message","Hello World Wicket"));
		add(new Label("message2","Dave says this!"));
	}

}
