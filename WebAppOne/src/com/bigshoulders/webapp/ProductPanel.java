package com.bigshoulders.webapp;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.markup.html.image.Image;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.repeater.RepeatingView;

import com.google.appengine.tools.info.RemoteVersionFactory;

public class ProductPanel extends Panel {
/**
	 * 
	 */
	private static final long serialVersionUID = 1108951389979185127L;
	private Product mainSell;
	/*
	PropertyModel<String> nameModel;
	PropertyModel<String> descriptionModel;
	PropertyModel<String> priceModel;
	*/
public ProductPanel(Product p,String id){
	super(id);
	mainSell= p;
	//initPropModels();
	initLabels();
	add (new Image("image",mainSell.getImageName()));
	
}

private void initLabels(){
	List<String> items = new ArrayList<String>();
	items.add(mainSell.getName());
	items.add(mainSell.getDescription());
	items.add(mainSell.getPrice());
	RepeatingView rv = new RepeatingView("item");
	int i=0;
	for(String item : items){
		rv.add(new Label("item"+i, item));
		i++;
	}
	add(rv);
	/*
	add(new Label("mainSell",mainSellModel));
	add(new Label("sizeSmall",smallSizeModel));
	add(new Label("sizeLarge",largeSizeModel));
	add(new Label("offer",offerModel));
	*/
}
}
