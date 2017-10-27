package com.abstracts.factory.action.test;

import org.junit.Test;

import com.abstracts.factory.action.AbstractFactory;
import com.abstracts.factory.action.AbstractProductA;
import com.abstracts.factory.action.AbstractProductB;
import com.abstracts.factory.action.CreatorAFactory;
import com.abstracts.factory.action.CreatorBFactory;



public class FactoryTest {

	@Test
	public void testFactory(){
		
		//
		AbstractFactory af = new CreatorAFactory();
		//
		AbstractFactory af1 = new CreatorBFactory();
		
		//获取产品A
		AbstractProductA  a = af.createProductA();
		a.show();
	    	AbstractProductA a1 = af1.createProductA();
	    	a1.show();
	    	//获取产品B
	    	AbstractProductB  b = af.createProductB();
	    	b.show();
	    	AbstractProductB b1 = af1.createProductB();
	    	b1.show();
	}

}
