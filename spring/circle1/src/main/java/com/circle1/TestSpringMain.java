package com.circle1;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringMain {

	
	   public static void main(String[] args) {
	      
		  ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

//	      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
//
//	      System.out.println("Msg from spring: " + obj.getMsg());
	      
	      
	      
	      

	      circle c = (circle) context.getBean("circle");

	      System.out.println( c.name+"\n"+c.radius);
	      
	      
	      
	   }
	}