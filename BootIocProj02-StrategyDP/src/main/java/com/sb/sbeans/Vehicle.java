package com.sb.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;



@Component("vehicle")
public class Vehicle {
	
	@Autowired
	//@Qualifier("DEngine")
	//@Qualifier("CEngine")
	@Qualifier("motor")
	private IEngine engine;

	public void journey(String startPlace,String endPlace) {
		engine.startEngine();
		System.out.println("journey start at::"+startPlace);
		System.out.println("journey is going on!!!!!");
		
		engine.stopEngine();
		System.out.println("journey stopped at::"+endPlace);
	}
}
