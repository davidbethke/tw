package com.bigshoulders.webapp;

import java.io.Serializable;

public class Title implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2595051343357290747L;
	private String title="Austin Texas";
	public Title(){
		
	}
	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title=title;
	}
}
