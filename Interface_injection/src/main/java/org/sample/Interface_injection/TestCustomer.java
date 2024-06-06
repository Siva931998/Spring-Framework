package org.sample.Interface_injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomer {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("org/sample/Interface_injection/Config.xml");
		Customer cus = (Customer)context.getBean("customer");
		
		System.out.println(cus);
		Account account = cus.getAccount();
		
		account.withdraw();
		account.debit();

	}

}
