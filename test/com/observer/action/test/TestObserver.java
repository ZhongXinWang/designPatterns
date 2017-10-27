package com.observer.action.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.observer.action.Adult;
import com.observer.action.Cat;
import com.observer.action.Child;
import com.observer.action.Dog;
import com.observer.action.Mouse;

public class TestObserver {

	private Cat cat;
	@Before
	public void before(){
		
		cat = new Cat();
		
	}
	@Test
	public void test() {

		cat.addObserver(new Child());
		cat.addObserver(new Mouse());
		cat.addObserver(new Adult());
		cat.addObserver(new Dog());
		cat.cry();
		
	}
	
	@After
	public void after(){
		
		cat = null;
	}

}
