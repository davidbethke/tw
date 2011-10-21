package com.bigshoulders.webapp;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.image.Image;
import org.apache.wicket.markup.repeater.RepeatingView;
import org.apache.wicket.model.PropertyModel;

public class ProductPage extends WebPage {
	private Title title= new Title();
	private TitleTag titleTag= new TitleTag();
	PropertyModel<String> titleModel ;
	PropertyModel<String> titleTagModel;
	Product product;
	List<Product> products;
	public ProductPage(){
		// do nothing constructor
		product= new Product("Tiny Tex","beautifull you should buy it","$99.99","SilverWrthM.jpg");
		products = new ArrayList<Product>();
		//add (new ProductPanel(product, "product"));
		initProductList();
		this.titleModel = new PropertyModel<String>(title, "title");
		this.titleTagModel = new PropertyModel<String>(titleTag, "titleTag");
		add(new Label("title",titleModel));
		add(new Label("titleTag",titleTagModel));
		
	}
	void initProductList(){
		products.add(product);
		products.add(new Product("Tiny Tex","beautifull you should buy it","$99.99","RedWrthM.jpg"));
		products.add(new Product("Lil Tex","Great Wreath","$49.99","WoodWrth WLightsM.jpg"));
		products.add(new Product("Tex","Lighted Wreath","$79.99","GreenWrth WLightsM.jpg"));
		RepeatingView rv = new RepeatingView("product");
		int i=0;
		for(Product itemProduct : products){
			rv.add(new ProductPanel(itemProduct, "product"+i));
			i++;
		}
		add(rv);
	}
}
