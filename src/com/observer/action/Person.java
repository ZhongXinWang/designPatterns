package com.observer.action;

public class Person  implements Observers{

	public void  action(){
		
		System.out.print(this.getClass().getName()+"被吓了一跳");
	}
}
