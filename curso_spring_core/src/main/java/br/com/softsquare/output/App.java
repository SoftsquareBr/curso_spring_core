package br.com.softsquare.output;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	
	
	public static void main(String [] args){
	/**	
		OutPutHelper output = new OutPutHelper();
		output.generateOutput();
		
	}*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Common.xml");
		
		OutputHelper output = (OutputHelper) context.getBean("OutputHelper");
		output.generateOutput();

	}

}
