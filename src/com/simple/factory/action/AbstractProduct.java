package com.simple.factory.action;

public abstract class AbstractProduct {

	public String productName;
	public String category;
	
	public void print(){
		
		System.out.println(productName+":"+category);
		
	}

}
