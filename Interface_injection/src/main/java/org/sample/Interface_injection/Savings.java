package org.sample.Interface_injection;

import org.springframework.stereotype.Component;

@Component
public class Savings implements Account{

	public void withdraw() {
		System.out.println("withdraw the Saving amount");
	}

	public void debit() {
		System.out.println("debit the saving amount");
	}

}
