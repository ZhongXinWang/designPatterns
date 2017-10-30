package com.strategy.action;

public class AirCraft {

	private FlyBehavior fly;
	private TakeOffBehavior takeOff;
	private String flyName;
	public AirCraft(String flyName){
		
		this.flyName = flyName;
		System.out.println(this.flyName+":");
	}
	public void fly(){
		
		fly.fly();
	}
	
	public void takeOff(){
		
		takeOff.takeOff();
		
	}

	public void setFly(FlyBehavior fly) {
		this.fly = fly;
	}
	public void setTakeOff(TakeOffBehavior takeOff) {
		this.takeOff = takeOff;
	}
	
}
