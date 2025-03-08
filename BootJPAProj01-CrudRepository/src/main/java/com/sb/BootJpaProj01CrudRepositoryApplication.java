package com.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.sb.entity.Doctor;

@SpringBootApplication
public class BootJpaProj01CrudRepositoryApplication {

	public static void main(String[] args) {
		//get ioc container
		ApplicationContext ctx=SpringApplication.run(BootJpaProj01CrudRepositoryApplication.class, args);
//	
	}

}
