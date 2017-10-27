package com.abstracts.factory.action;

public class CreatorAFactory  extends AbstractFactory{

	@Override
	public AbstractProductA createProductA() {

		return new ProductA();
	}

	@Override
	public AbstractProductB createProductB() {

		return new ProductB();
	}

	
}
