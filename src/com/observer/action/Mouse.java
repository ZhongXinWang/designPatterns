package com.observer.action;

public class Mouse implements Observers{

	public void action(){
		
		System.out.println(this.getClass().getName()+"被吓跑了");
	}
	
}
