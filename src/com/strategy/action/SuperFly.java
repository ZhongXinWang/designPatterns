package com.strategy.action;

public class SuperFly implements FlyBehavior {

	@Override
	public void fly() {

		System.out.println("超速飞行");
	}

	
}
