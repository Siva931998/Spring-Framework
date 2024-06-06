package org.sample.ref_type;

public class Person {

	private int id;
	private String name;
	private long phnnum;
	private Address address;
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
	public long getPhnnum() {
		return phnnum;
	}
	public void setPhnnum(long phnnum) {
		this.phnnum = phnnum;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", phnnum=" + phnnum + ", address=" + address + "]";
	}
	
	
}
