package org.sample.ref_type;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testperson {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("org/sample/ref_type/Config.xml");
		
		Person ps = (Person)context.getBean("person");
		
		System.out.println(ps);
	}

}
