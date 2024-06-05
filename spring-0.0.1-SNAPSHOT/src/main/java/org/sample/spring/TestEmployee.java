package org.sample.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("org/sample/spring/config.xml");
		
		Employee emp = (Employee)context.getBean("employee");
		
		System.out.println(emp);
		
		
	}

}
