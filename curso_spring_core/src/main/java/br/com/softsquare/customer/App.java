package br.com.softsquare.customer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String []args ){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Person.xml");
		Customer cust = (Customer) context.getBean("customerBean");
		System.out.println(cust);
		
	}

}
