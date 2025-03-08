package com.sb.sbeans;

import org.springframework.stereotype.Component;

@Component("PEngine")
public class PetrolEngine implements IEngine {

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("PetrolEngine.startEngine");
	}

	@Override
	public void stopEngine() {
		// TODO Auto-generated method stub
		System.out.println("PetrolEngine.stopEngine");

	}

}
