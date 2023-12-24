package org.springframework.debug.MyTest2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest2 {
	public static void main(String[] args) {
		System.out.println("-------------into start");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person bean = context.getBean(Person.class);
		System.out.println(bean);
	}
}
