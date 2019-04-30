package com.list;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import containment.*;
public class DrawingApp {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("list.xml");
		
		PointTriangle1 triangle = (PointTriangle1)context.getBean("PointTriangle1");
		
		triangle.draw();

	}
}