package com.observer.action;

import java.util.ArrayList;
import java.util.List;

//被观察者
public class Cat implements ICat {
	
	private List<Observers> list = new ArrayList<Observers>();
	public void cry(){

		System.out.println("猫大叫了一声");
		notifys();
	}

	@Override
	public void addObserver(Observers o) {

		list.add(o);
		
	}

	@Override
	public void removeObserver(Observers o) {

		if(list.contains(o)){
			
			list.remove(o);
		}
		
	}

	@Override
	public void notifys() {

		for (Observers observers : list) {
			
			observers.action();
			
		}
	}


}
