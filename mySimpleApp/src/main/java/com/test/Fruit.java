package com.test;

import java.util.List;
import java.util.Map;

public class Fruit {

	private String Name;	
	private String dept;
	
	private List<String> myFruitList;
	private Map<String,String> myFruitMap;
	
	public List<String> getMyFruitList() {
		return myFruitList;
	}

	public void setMyFruitList(List<String> myFruitList) {
		this.myFruitList = myFruitList;
	}

	public Map<String, String> getMyFruitMap() {
		return myFruitMap;
	}

	public void setMyFruitMap(Map<String, String> myFruitMap) {
		this.myFruitMap = myFruitMap;
	}

	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	public Fruit() {}//no argument constructor
	
	public Fruit(String pName, String pdept)
	{
		setName(pName);
		setDept(pdept);
	}
	public String talkaboutyourself()
	{
		String speech= "i'm from tree with seeds";
		if(Name!=null&&Name!="")
		{
			speech=speech+"..and My Name is...."+Name+"...dept is..."+dept;
			
		}
		
		if(myFruitList!=null&&myFruitList.size()>0)
		{
			speech+="\n List:";
			for(int i=0;i<myFruitList.size();i++)
			{
				speech+=" Name:"+myFruitList.get(i);
			}
		}
		if(myFruitMap!=null&&myFruitMap.size()>0)
		{
			speech+="\n Map:";
			for(Map.Entry<String, String>fruitName: myFruitMap.entrySet())
			{
				speech+=fruitName.getKey()+"==>"+fruitName.getValue()+"  ";
			}
		}
		return speech;
	}
}
