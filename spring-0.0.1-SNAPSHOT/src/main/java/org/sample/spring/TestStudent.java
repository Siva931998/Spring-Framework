package org.sample.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("org/sample/spring/config.xml");
	Student std = (Student)context.getBean("hello");
	System.out.println(std);
	}

}
