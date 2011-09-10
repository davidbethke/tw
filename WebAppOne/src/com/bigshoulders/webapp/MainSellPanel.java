package com.bigshoulders.webapp;

import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.markup.html.basic.Label;

public class MainSellPanel extends Panel {
/**
	 * 
	 */
	private static final long serialVersionUID = 1108951389979185127L;
	private MainSell mainSell;
	PropertyModel<String> mainSellModel;
	PropertyModel<String> smallSizeModel;
	PropertyModel<String> largeSizeModel;
	PropertyModel<String> offerModel;
public MainSellPanel(String id){
	super(id);
	mainSell= new MainSell();
	initPropModels();
	initLabels();
}
private void initPropModels(){
	this.smallSizeModel = new PropertyModel<String>(mainSell.getSizeSmall(), "sizeSmall");
	this.largeSizeModel = new PropertyModel<String>(mainSell.getSizeLarge(), "sizeLarge");
	this.offerModel = new PropertyModel<String>(mainSell.getOffer(), "offer");
	this.mainSellModel = new PropertyModel<String>(mainSell, "mainSell");
}
private void initLabels(){
	add(new Label("mainSell",mainSellModel));
	add(new Label("sizeSmall",smallSizeModel));
	add(new Label("sizeLarge",largeSizeModel));
	add(new Label("offer",offerModel));
}
}
