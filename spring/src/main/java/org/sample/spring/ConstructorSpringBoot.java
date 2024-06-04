package org.sample.spring;

public class ConstructorSpringBoot {
	
	private String name;
	private int age;
	public ConstructorSpringBoot(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	@Override
	public String toString() {
		return "ConstructorSpringBoot [name=" + name + ", age=" + age + "]";
	}
	

}
