package com.bigshoulders.webapp;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.image.Image;
import org.apache.wicket.markup.repeater.RepeatingView;
import org.apache.wicket.model.PropertyModel;

public class pictures extends WebPage {
	private Title title= new Title();
	private TitleTag titleTag= new TitleTag();
	PropertyModel<String> titleModel ;
	PropertyModel<String> titleTagModel;
	public pictures(){
		// do nothing constructor
		this.titleModel = new PropertyModel<String>(title, "title");
		this.titleTagModel = new PropertyModel<String>(titleTag, "titleTag");
		add(new Label("title",titleModel));
		add(new Label("titleTag",titleTagModel));
		List<String> offerItems = new ArrayList<String>();
		offerItems.add("SilverWrth.jpg");
		offerItems.add("tinselWreath.jpg");
		offerItems.add("WoodWrthWLights.jpg");
		offerItems.add("GreenWrth WLights.jpg");
		offerItems.add("RedWrth.jpg");
		offerItems.add("tinytexWBslvrM.gif");
		offerItems.add("TexRedHood1M.gif");
		offerItems.add("treeWBM.gif");
		offerItems.add("texWBLightsM.gif");
		offerItems.add("texhood1M.gif");



		RepeatingView rv = new RepeatingView("image");
		int i=0;
		for(String item : offerItems){
			rv.add(new Image("item"+i, item));
			i++;
		}
		add(rv);
	}
}
