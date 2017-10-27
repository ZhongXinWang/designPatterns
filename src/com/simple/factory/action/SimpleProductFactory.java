package com.simple.factory.action;

public class SimpleProductFactory {

	public static <T extends AbstractProduct> T createProduct(Class c){
	 	AbstractProduct ap = null;
		try {
			ap = (AbstractProduct) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return (T) ap;
		
	}
	
}
