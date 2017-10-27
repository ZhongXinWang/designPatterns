package com.factory.action.test;

import org.junit.Test;

import com.abstracts.factory.action.CreatorAFactory;
import com.simple.factory.action.AbstractFactory;
import com.simple.factory.action.AbstractProduct;
import com.simple.factory.action.ProductA;
import com.simple.factory.action.ProductB;
import com.simple.factory.action.ProductC;
import com.simple.factory.action.ProductFactory;
import com.simple.factory.action.SimpleProductFactory;

public class FactoryTest {

	@Test
	public void testSimpleFactory(){
		
		//想获取A的对象
		AbstractProduct a = SimpleProductFactory.createProduct(ProductA.class);
		a.print();
		//想获取B的对象
		AbstractProduct b = SimpleProductFactory.createProduct(ProductB.class);
		b.print();
		//想获取C的对象
		
		SimpleProductFactory.createProduct(ProductC.class);
		
	}
	@Test
	public void testFactory(){
		
		AbstractFactory af = new ProductFactory();
		ProductA a = af.createProduct(ProductA.class);
		a.print();
		
	}

}
