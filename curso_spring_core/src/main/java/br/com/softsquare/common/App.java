package br.com.softsquare.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static void main(String[] args) {
		/**
		 * OutPutHelper output = new OutPutHelper(); output.generateOutput();
		 * 
		 * }
		 */
		

		  ApplicationContext context = new ClassPathXmlApplicationContext(new String []{"Customer.xml"});
		  
		  Customer customer = (Customer)
		  context.getBean("CustomerBean"); 
		   System.out.println(customer);
		
	}

}
