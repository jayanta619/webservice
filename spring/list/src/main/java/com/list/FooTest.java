package com.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import containment.*;
public class FooTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("scope.xml");

		Foo f1 = (Foo) context.getBean("foo");
		Foo f2 = (Foo) context.getBean("foo");
//System.out.println(f1.getMsg());

	}
}
