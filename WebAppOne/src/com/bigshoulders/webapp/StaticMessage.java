package com.bigshoulders.webapp;

public class StaticMessage {
	private String message="Dave's static message";
	public StaticMessage(){
		// do nothing;
	}
	public String getStaticMessage(){
		return message;
	}
	public void setStaticMessage(String message){
		this.message=message;
	}

}
