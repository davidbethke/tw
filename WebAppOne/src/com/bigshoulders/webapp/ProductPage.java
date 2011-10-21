package com.bigshoulders.webapp;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.image.Image;
import org.apache.wicket.model.PropertyModel;

public class ProductPage extends WebPage {
	private Title title= new Title();
	private TitleTag titleTag= new TitleTag();
	PropertyModel<String> titleModel ;
	PropertyModel<String> titleTagModel;
	Product product;
	public ProductPage(){
		// do nothing constructor
		product= new Product("Wreath","beautifull you should buy it","$99.99","SilverWrthM.jpg");
		add (new ProductPanel(product, "product"));
		this.titleModel = new PropertyModel<String>(title, "title");
		this.titleTagModel = new PropertyModel<String>(titleTag, "titleTag");
		add(new Label("title",titleModel));
		add(new Label("titleTag",titleTagModel));
		
	}
}
