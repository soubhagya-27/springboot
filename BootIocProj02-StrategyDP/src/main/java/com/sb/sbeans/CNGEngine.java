package com.sb.sbeans;

import org.springframework.stereotype.Component;

@Component("CEngine")
public class CNGEngine implements IEngine {

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("CNGEngine.startEngine");
	}

	@Override
	public void stopEngine() {
		// TODO Auto-generated method stub
		System.out.println("CNGEngine.stopEngine");
	}

}
