package com.observer.action;

public class Dog implements Observers {

	@Override
	public void action() {

		System.out.println("猫叫了，狗也跟着叫了。。。");
	}

}
