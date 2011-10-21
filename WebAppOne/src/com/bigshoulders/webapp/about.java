package com.bigshoulders.webapp;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.image.Image;
import org.apache.wicket.model.PropertyModel;

public class about extends WebPage {
	private Title title= new Title();
	private TitleTag titleTag= new TitleTag();
	PropertyModel<String> titleModel ;
	PropertyModel<String> titleTagModel;
	public about(){
		// do nothing constructor
		this.titleModel = new PropertyModel<String>(title, "title");
		this.titleTagModel = new PropertyModel<String>(titleTag, "titleTag");
		add(new Label("title",titleModel));
		add(new Label("titleTag",titleTagModel));
		add(new Image("image","Beer.gif"));
	}
}
