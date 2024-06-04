package org.sample.spring;

import java.util.Set;

public class Employee {
	
	private int id;
	private String name;
	private Set<Long> phonenumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Long> getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(Set<Long> phonenumber) {
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phonenumber=" + phonenumber + "]";
	}
	public void run() {
		System.out.println("id=" + id + ", name=" + name + ", phonenumber=" + phonenumber);
	}
}
