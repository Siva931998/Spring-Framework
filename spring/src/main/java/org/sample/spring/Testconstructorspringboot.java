package org.sample.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testconstructorspringboot {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("org/sample/spring/Config.xml");
		
		ConstructorSpringBoot csb = (ConstructorSpringBoot)context.getBean("Dude");
		
		System.out.println(csb);
	
		ConstructorSpringBoot csb1 = (ConstructorSpringBoot)context.getBean("employee");
		
		System.out.println(csb1);
	}

}
