package com.abstracts.factory.action;

public class CreatorBFactory  extends AbstractFactory{

	@Override
	public AbstractProductA createProductA() {

		return new ProductA1();
	}

	@Override
	public AbstractProductB createProductB() {

		return new ProductB1();
	}

	
}
