package org.sample.firstprogram;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("org/sample/firstprogram/config.xml");
		
		Student std = (Student)context.getBean("welcome");
		System.out.println(std);
		std.display();
		
		if(context!=null) {
			context.close();
		}
	}

}
