package org.sample.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudtent {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("org/sample/spring/Config.xml");

		Student std = (Student) context.getBean("hey");

		System.out.println(std);
	}

}
