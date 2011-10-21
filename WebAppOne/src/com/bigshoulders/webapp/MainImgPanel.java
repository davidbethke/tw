package com.bigshoulders.webapp;

import java.io.Serializable;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.image.Image;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;

public class MainImgPanel extends Panel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1239345445312574743L;
	private MainImg mainImg;
	PropertyModel<String> mainImgModel;
public MainImgPanel(String id){
	super(id);
	mainImg= new MainImg();
	//this.mainImgModel = new PropertyModel<String>(mainImg, "mainImg");
	//add(new Label("mainImg",mainImgModel));
	add(new Image("mainImg", new Model<String>("Beer.gif")));
}
}
