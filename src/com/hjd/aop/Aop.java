package com.hjd.aop;

import org.springframework.stereotype.Component;

@Component
public class Aop {
	public void begin(){
		System.out.println("------>��������");
	}
	
	public void end(){
		System.out.println("------>��������");
	}
}
