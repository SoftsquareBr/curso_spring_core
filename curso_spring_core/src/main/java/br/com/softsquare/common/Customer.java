package br.com.softsquare.common;

public class Customer {
	
	private String name;
	private String address;
	private int age;
	
	public Customer(String name, String address, int age) {
	
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	
	public Customer(String name,int age ,String address ) {

		this.name = name;
		this.address = address;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", age="
				+ age + "]";
	}
	
	
	

	
	
	

}
