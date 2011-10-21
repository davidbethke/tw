package com.bigshoulders.webapp;

import java.io.Serializable;

public class MainImg implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3095996251027619000L;
	private String mainImg = "Im a main image";
	public MainImg(){
		// do nothing
	}
	public String getMainImg(){
		return mainImg;
	}
	public void setMainImg(String s){
		this.mainImg=s;
	}

}
