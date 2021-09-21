package com.nt;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.beans.WishMessageGenerator;

@SpringBootApplication
public class SpringBootProj1DependencyInjectionApplication {

	@Bean("ldt")
	public LocalDateTime createLocalDateTime() {
		LocalDateTime ldt=LocalDateTime.now();
		return ldt;
	}
	public static void main(String[] args) {
		//get IOC Container
		ApplicationContext ctx=SpringApplication.run(SpringBootProj1DependencyInjectionApplication.class, args);
		//get Target Bean Class from IOC Container
		WishMessageGenerator generator=ctx.getBean("wmg", WishMessageGenerator.class);
		//invoke method
		String result=generator.generateWishMessage("Gourav");
		System.out.println(result);
		//close container
		((ConfigurableApplicationContext)ctx).close();
	}

}
