package com.hjd.aop;

import org.springframework.stereotype.Component;

@Component
public class Aop {
	public void begin(){
		System.out.println("------>开启事务");
	}
	
	public void end(){
		System.out.println("------>结束事务");
	}
}
