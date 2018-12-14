package br.com.softsquare.appconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.softsquare.hello.HelloWord;
import br.com.softsquare.hello.imp.HelloWordIdImpl;


@Configuration
public class AppConfig {
	@Bean(name="helloBean")
	public HelloWord helloword(){
		
		return new HelloWordIdImpl();
	}

}
