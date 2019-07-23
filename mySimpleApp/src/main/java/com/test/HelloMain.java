package com.test;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
	//	Vegetable v=new Vegetable();
		//Fruit f=new Fruit();
		
		ApplicationContext appcontext=new FileSystemXmlApplicationContext("appContext.xml");
		
		Fruit fruit=appcontext.getBean("fruit", Fruit.class);
		Fruit fruitwithname=appcontext.getBean("fruitwithname", Fruit.class);
		
		Vegetable veg=(Vegetable) appcontext.getBean("vegetable");
		Vegetable vegwithname=(Vegetable) appcontext.getBean("vegetablewithname");
		System.out.println(vegwithname.talkaboutyourself());
		
		Fruit myfruit=appcontext.getBean("fruitwithListAndMap", Fruit.class);
		System.out.println(myfruit.talkaboutyourself());
		
		System.out.println(fruitwithname.talkaboutyourself());
		System.out.println(veg.talkaboutyourself());
		System.out.println(fruit.talkaboutyourself());
		
		((FileSystemXmlApplicationContext)appcontext).close();
	}

}