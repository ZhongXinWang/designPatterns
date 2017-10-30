package com.strategy.action;

public class VerticalTakeOff implements TakeOffBehavior {

	@Override
	public void takeOff() {

		System.out.println("长距离起飞");
	}

	
	
}
