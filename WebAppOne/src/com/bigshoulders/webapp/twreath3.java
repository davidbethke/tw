package com.bigshoulders.webapp;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.Component;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.image.Image;
import org.apache.wicket.markup.repeater.RepeatingView;
import org.apache.wicket.model.PropertyModel;

public class twreath3 extends WebPage {
	private Title title= new Title();
	private TitleTag titleTag= new TitleTag();
	
	//private LeftSideBar leftSideBar= new LeftSideBar();
	//private RightSideBar rightSideBar= new RightSideBar();
	//private MainImg mainImg= new MainImg();
	//private MainSell mainSell= new MainSell();
	PropertyModel<String> titleModel ;
	PropertyModel<String> titleTagModel;
	//PropertyModel<String> le// try mainSellOffer embed
	
	//PropertyModel<String> rightSideBarModel;
	
	//PropertyModel<String> mainImgModel;
	/*
	PropertyModel<String> mainSellModel;
	PropertyModel<String> smallSizeModel;
	PropertyModel<String> largeSizeModel;
	PropertyModel<String> offerModel;
	*/
	public twreath3(){
		initPropModels();
		// add labels
		initLabels();
		// try mainSellOffer embed
		List<String> offerItems = new ArrayList<String>();
		offerItems.add("Handmade in Texas");
		offerItems.add("Unique Gift");
		offerItems.add("We Don't Do Round!");
		RepeatingView rv = new RepeatingView("mainSellOffer");
		int i=0;
		for(String item : offerItems){
			rv.add(new Label("item"+i, item));
			i++;
		}
		add(rv);
		
		add (new Image("mediumImage","SilverWrthM.jpg"));
		add (new Image("smallImage1","texWBLightsS.gif"));
		add (new Image("smallImage2","TexRedHood1S.gif"));
		add (new Image("smallImage3","tinysilverRv3S.gif"));
	}
	private void initPropModels(){
		this.titleModel = new PropertyModel<String>(title, "title");
		this.titleTagModel = new PropertyModel<String>(titleTag, "titleTag");
		//this.leftSideBarModel = new PropertyModel<String>(leftSideBar, "leftSideBar");
		//this.rightSideBarModel = new PropertyModel<String>(rightSideBar, "rightSideBar");
		//this.mainImgModel = new PropertyModel<String>(mainImg, "mainImg");
		/*
		this.smallSizeModel = new PropertyModel<String>(mainSell.getSizeSmall(), "sizeSmall");
		this.largeSizeModel = new PropertyModel<String>(mainSell.getSizeLarge(), "sizeLarge");
		this.offerModel = new PropertyModel<String>(mainSell.getOffer(), "offer");
		this.mainSellModel = new PropertyModel<String>(mainSell, "mainSell");
		*/
	}
	private void initLabels(){
		add(new Label("title",titleModel));
		add(new Label("titleTag",titleTagModel));
		//add(new Label("leftSideBar",leftSideBarModel));
		//add(new Label("rightSideBar",rightSideBarModel));
		//add(new Label("mainImg",mainImgModel));
		add(new MainSellPanel("mainSell"));
		
		//add(new MainImgPanel("mainImg"));
		/*
		add(new Label("mainSell",mainSellModel));
		add(new Label("sizeSmall",smallSizeModel));
		add(new Label("sizeLarge",largeSizeModel));
		add(new Label("offer",offerModel));
		*/


	}
}
