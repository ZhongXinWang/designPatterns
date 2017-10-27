package com.simple.factory.action;

public abstract class AbstractFactory {

	public abstract <T extends AbstractProduct> T createProduct(Class c);
}
