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
		product= new Product("Tiny Tex","Silver tinsel model. 7\"x7\".The perfect gift. Hang as an ornament on your tree, hang on your rear view mirror, so you can \"see Texas from here\", top off your tree with it.","$14.95","SilverWrthM.jpg",'T');
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
		products.add(new Product("Tiny Tex","Red  tinsel model. 7\"x7\".The perfect gift. Hang as an ornament on your tree, hang on your rear view mirror, so you can \"see Texas from here\", top off your tree with it.","$14.95","RedWrthM.jpg",'T'));
		
		products.add(new Product("Lil Tex","\"We dont do round at texaswreath.com\" Our standard wreath, 16”x16”, with  beautifull pine garland. Features the distinctive shape of the state of Texas. Put it on your front bumper and turn your vehicle into a real \"Texas Truck\"","$39.95","comingsoon.gif",'L'));
		products.add(new Product("Tex","Take our standard \"Lil Tex\" wreath and include premium decorations like our Texas Star and bells and you get a \"Tex\". Don’t stop there, add eco-friendly LED lights, and your wreath will be the shining star of your outdoor display.","$69.95","GreenWrth WLightsM.jpg",'R'));
		RepeatingView rv = new RepeatingView("product");
		int i=0;
		for(Product itemProduct : products){
			rv.add(new ProductPanel(itemProduct, "product"+i));
			i++;
		}
		add(rv);
	}
}
