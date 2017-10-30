package com.strategy.action.test;

import org.junit.Test;

import com.strategy.action.AirCraft;
import com.strategy.action.Helicpter;
import com.strategy.action.SubFly;
import com.strategy.action.SuperFly;
import com.strategy.action.VerticalTakeOff;

public class TestStrategy {

	@Test
	public void testStrategy(){
		
//		//要求直升飞机垂直起飞，亚音速飞行
//		错误的
//	   Helicpter he = new Helicpter();
//	   he.setTakeOff(new VerticalTakeOff());
//	   he.setFly(new SubFly());
//	   he.start();
//	   
//	 //要求客机垂直起飞，超速音速飞行
//	   
//	   AirPlane a = new AirPlane();
//	   a.setTakeOff(new VerticalTakeOff());
//	   a.setFly(new SuperFly());
//	   a.start();
		
	   //要求直升飞机垂直起飞， 先亚音速飞行再超速飞行
		AirCraft he = new Helicpter("直升飞机");
		he.setTakeOff(new VerticalTakeOff());
		//垂直起飞
		he.takeOff();
	    he.setFly(new SubFly());
	    //先亚音速飞行
	    he.fly();
	    //超速飞行
	    he.setFly(new SuperFly());
	    he.fly(); 
	   
	}
}
