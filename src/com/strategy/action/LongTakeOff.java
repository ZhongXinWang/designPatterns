package com.strategy.action;

public class LongTakeOff implements TakeOffBehavior {

	@Override
	public void takeOff() {

		System.out.println("垂直起飞");
	}

	
	
}
