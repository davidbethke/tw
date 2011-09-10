package com.bigshoulders.webapp;

public class MainSell {
	private String mainSell="Im a new MainSell";
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
