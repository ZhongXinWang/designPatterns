package com.observer.action;

public class Child extends Person {

	@Override
	public void action(){
	
		super.action();
		System.out.println("哭了");
	
	}
}
