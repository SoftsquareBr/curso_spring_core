package br.com.softsquare.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.softsquare.core.CustomerBo;

@Configuration

public class CustomerConfig {

	@Bean(name="customer")
	public CustomerBo customerBo(){
		
		return new CustomerBo();
		
	}
}
