package com.bigshoulders.webapp;

import java.io.Serializable;

public class Size implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7827168557145121082L;
	private String size="Im a size";
	public Size(){
		// do nothing
	}
	public String getSize(){
		return size;
	}
	public void setSize(String s){
		this.size=s;
	}

}
