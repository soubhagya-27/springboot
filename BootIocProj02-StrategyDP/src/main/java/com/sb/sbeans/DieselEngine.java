package com.sb.sbeans;

import org.springframework.stereotype.Component;

@Component("DEngine")
public class DieselEngine implements IEngine {

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("DieselEngine.startEngine");
	}

	@Override
	public void stopEngine() {
		// TODO Auto-generated method stub
		System.out.println("DieselEngine.stopEngine");
	}

}
