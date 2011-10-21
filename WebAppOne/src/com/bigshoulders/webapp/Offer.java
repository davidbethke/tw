package com.bigshoulders.webapp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.markup.html.basic.Label;


import com.google.apphosting.api.DatastorePb.AddActionsRequest;

public class Offer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2422235484855022764L;
	private String offer="$59.99";
	
	public Offer(){
		// do nothing
		// try list view
		//init list
		
		
		
	}
	public String getOffer(){
		return offer;
	}
	public void setOffer(String s){
		this.offer=s;
	}
}
