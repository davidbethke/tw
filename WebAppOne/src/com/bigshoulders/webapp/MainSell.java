package com.bigshoulders.webapp;

import org.apache.wicket.markup.html.list.ListView;

public class MainSell {
	private String mainSell="HandCrafted in Texas";
	private SizeSmall sizeSmall;
	private SizeLarge sizeLarge;
	private Offer offer;
	public MainSell(){
		sizeSmall= new SizeSmall();
		sizeLarge= new SizeLarge();
		offer= new Offer();
	}
	public String getMainSell(){
		return mainSell;
	}
	public void setMainSell(String s){
		this.mainSell=s;
	}
	public SizeSmall getSizeSmall(){
		return sizeSmall;
	}
	public SizeLarge getSizeLarge(){
		return sizeLarge;
	}
	public Offer getOffer(){
		return offer;
	}
	
}
