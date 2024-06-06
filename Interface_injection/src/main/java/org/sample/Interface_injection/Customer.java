package org.sample.Interface_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	@Value("111")
	private int custmerid;
	@Value("Rohitsiva")
	private String custmername;
	@Autowired
	@Qualifier("Savings")
	private Account account;
	public int getCustmerid() {
		return custmerid;
	}
	public void setCustmerid(int custmerid) {
		this.custmerid = custmerid;
	}
	public String getCustmername() {
		return custmername;
	}
	public void setCustmername(String custmername) {
		this.custmername = custmername;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "Customer [custmerid=" + custmerid + ", custmername=" + custmername + ", account=" + account + "]";
	}
	
	

}
