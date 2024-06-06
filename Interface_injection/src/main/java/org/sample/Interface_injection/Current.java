package org.sample.Interface_injection;

import org.springframework.stereotype.Component;

@Component
public class Current implements Account {

	public void withdraw() {

		System.out.println("withdraw the current amount");
	}

	public void debit() {

		System.out.println("debit the current amount");
	}
	
	

}
