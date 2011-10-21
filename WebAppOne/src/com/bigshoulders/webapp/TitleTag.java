package com.bigshoulders.webapp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TitleTag implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = -4508944073888399928L;
private String titleTag="";
private List<String> titleTagList;
public TitleTag(){
	// do nothing
	// filllist
	titleTagList= new ArrayList<String>();
	fillList();
	
}
public String getTitleTag(){
	// try to return a random titleTag from the titleTagList
	return getRandomTag();
}
public void setTitleTag(String titleTag){
	this.titleTag=titleTag;
}
private void fillList(){
	titleTagList.add("The Original Texas Wreath");
	titleTagList.add("As Big as Texas!");
	titleTagList.add("Texas Proud");
	titleTagList.add("Deep in the Heart of Texas");
	titleTagList.add("Y'all come back now!");
	titleTagList.add("Feliz Navidad, Y'all!");
}
private String getRandomTag(){
	return titleTagList.get(0);
}
}
