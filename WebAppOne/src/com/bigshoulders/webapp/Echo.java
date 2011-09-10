package com.bigshoulders.webapp;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.PropertyModel;


public class Echo extends WebPage {
	private String dbMessage ="Your message appears here";
	private StaticMessage sMessage= new StaticMessage();
	public Echo(){
		PropertyModel<String> staticModel = new PropertyModel<String>(sMessage, "message");
		PropertyModel<String> model = new PropertyModel<String>(this, "dbMessage");
		add(new Label("staticMsg",staticModel));
		add(new Label("msg", model));
		Form<?> form = new Form("form");
		form.add(new TextField<String>("msgInput", model));
		add(form);
	}
	public String getMessage(){
		return dbMessage;
	}
	public void setMessage(String dbMessage){
		this.dbMessage=dbMessage;
	}
	
}
