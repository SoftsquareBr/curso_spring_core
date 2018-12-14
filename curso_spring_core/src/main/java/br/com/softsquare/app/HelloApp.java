package br.com.softsquare.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import br.com.softsquare.appconfig.AppConfig;
import br.com.softsquare.hello.HelloWord;

public class HelloApp {
	
	
	public static void main(String [] args){
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloWord obj = (HelloWord) context.getBean("helloBean");
		obj.printHelloWord(" - Spring 3.0 java config ");
		
	}
	
	

}



