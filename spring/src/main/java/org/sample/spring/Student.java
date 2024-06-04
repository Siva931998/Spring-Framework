package org.sample.spring;

import java.util.Map;

public class Student {
	
	private int rollnumber;
	private String name;
	private Map<String,String> Statusandlanguage;
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, String> getStatusandlanguage() {
		return Statusandlanguage;
	}
	public void setStatusandlanguage(Map<String, String> statusandlanguage) {
		Statusandlanguage = statusandlanguage;
	}
	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", name=" + name + ", Statusandlanguage=" + Statusandlanguage
				+ "]";
	}

}
