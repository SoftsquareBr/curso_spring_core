package br.com.softsquare.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.softsquare.core.SchedulerBo;
@Configuration
public class SchedulerConfig {
	
	@Bean(name="scheduler")
	public SchedulerBo schedulerBo(){
		return new SchedulerBo();
	}
	
	

}
