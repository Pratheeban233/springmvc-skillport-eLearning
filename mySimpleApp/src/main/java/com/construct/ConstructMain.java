package com.construct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import sun.awt.AppContext;

public class ConstructMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext appcontext=new FileSystemXmlApplicationContext("appcontext.xml");
		
		Meal meal=appcontext.getBean("meal", Meal.class);
		System.out.println(meal.whatInthisMeal());
		
		Meal mealalt=appcontext.getBean("mealAlt", Meal.class);
		System.out.println(meal.whatInthisMeal());		
	}

}
