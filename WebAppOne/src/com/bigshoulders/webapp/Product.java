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
    char size;
    public Product(){
    	//default no arg constructor
    }
    public Product(String n, String d, String p, String iN,char s){
    	name=n;
    	description=d;
    	price=p;
    	imageName=iN;
    	size=s;
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
    public void setSize(char s){
    	size=s;
    }
    public char getSize(){
    	return size;
    }
}
