package org.sample.spring;

import java.util.Set;

public class ConstructorSpringBoot {
	
	private String name;
	private int age;
	private Set<Long> phonenumber;
	
	public ConstructorSpringBoot(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public ConstructorSpringBoot(String name, int age, Set<Long> phonenumber) {
		super();
		this.name = name;
		this.age = age;
		this.phonenumber = phonenumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Set<Long> getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(Set<Long> phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	@Override
	public String toString() {
		return "ConstructorSpringBoot [name=" + name + ", age=" + age + ", phonenumber=" + phonenumber + "]";
	}
	

}
