package com.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.sb.sbeans.Vehicle;

@SpringBootApplication
@ImportResource("com/sb/cfgs/applicationContext.xml")
public class BootIocProj02DependencyInjectionApplication {

	public static void main(String[] args) {
		//get Access to IOC container
		ApplicationContext ctx=SpringApplication.run(BootIocProj02DependencyInjectionApplication.class, args);
		//get target spring bean class obj ref
		Vehicle vehicle=ctx.getBean("vehicle",Vehicle.class);
		// invoke the business method
		vehicle.journey("Hyderabad","Vizag");
		//close IOC container
		((ConfigurableApplicationContext)ctx).close();
	}
}
