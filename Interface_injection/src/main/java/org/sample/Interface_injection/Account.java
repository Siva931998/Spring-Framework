package org.sample.Interface_injection;

import org.springframework.stereotype.Component;

@Component
public interface Account {

	public void withdraw();
	public void debit();
}
