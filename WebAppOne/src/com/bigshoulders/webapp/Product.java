package com.bigshoulders.webapp;

import java.io.Serializable;

public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1404647838564684560L;
    private String name;
    private String description;
    private String price;
    private String imageName;
    public Product(){
    	//default no arg constructor
    }
    public Product(String n, String d, String p, String iN){
    	name=n;
    	description=d;
    	price=p;
    	imageName=iN;
    }
    // getters/setters
    public String getName(){
    	return name;
    }
    public void setName(String n){
    	name=n;
    	
    }
    public String getDescription(){
    	return description;
    }
    public void setDescription(String d){
    	description=d;
    }
    public String getPrice(){
    	return price;
    }
    public void setPrice(String p){
    	price=p;
    }
    public String getImageName(){
    	return imageName;
    }
    public void setImageName(String n){
    	imageName=n;
    }
}
