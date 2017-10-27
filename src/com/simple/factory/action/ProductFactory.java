package com.simple.factory.action;

public class ProductFactory extends AbstractFactory {

	@Override
	public <T extends AbstractProduct> T createProduct(Class c) {

		AbstractProduct ap;
		try{
			
			ap = (AbstractProduct) Class.forName(c.getName()).newInstance();
			
			return (T) ap;
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}

		return null;
		
	}

}
