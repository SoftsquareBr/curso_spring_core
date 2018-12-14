package br.com.softsquare.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import br.com.softsquare.config.AppConfig;





public class App {
	
	
	
	
	public static void main(String [] args){
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		CustomerBo customer =  (CustomerBo) context.getBean("customer");
		customer.printMsg("Hello 1 : ");
		
		SchedulerBo scheduler =  (SchedulerBo) context.getBean("scheduler");
		scheduler.printMsg("Hello 2 : ");
		
	}
	

}
