package com.abstracts.factory.action;

public class CreatorCFactory  extends AbstractFactory{

	@Override
	public AbstractProductA createProductA() {

		return new ProductA2();
	}

	@Override
	public AbstractProductB createProductB() {

		return new ProductB2();
	}

	
}
