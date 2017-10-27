package com.observer.action;

public class Adult extends Person {

	@Override
	public void action(){
		super.action();
		System.out.println("叫了一声");
	}
}
