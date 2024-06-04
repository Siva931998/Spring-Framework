package org.sample.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("org/sample/spring/Config.xml");
		Employee emp = (Employee) context.getBean("hi");
		System.out.println(emp);
		emp.run();
	}
}
