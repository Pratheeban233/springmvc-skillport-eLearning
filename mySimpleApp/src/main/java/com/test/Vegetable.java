package com.test;

public class Vegetable {
	
	private String myName;	

	

	public String getMyName() {
		return myName;
	}



	public void setMyName(String myName) {
		this.myName = myName;
	}



	public String talkaboutyourself() {
		String speech= "i'm from plant that is eatable";
		
		if(myName!=null&&myName!="")
		speech=speech+"..and My name is..."+myName;
		return speech;
	}
}