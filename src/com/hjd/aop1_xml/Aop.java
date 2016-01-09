package com.hjd.aop1_xml;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

public class Aop {
	
	
	
	
	public void begin(){
		System.out.println("begin面向切面------>开启事务");
	}
	
	//最终通知(无论是否出现异常,都会执行)
	//这里使用到了切面表达式
	public void end(){
		System.out.println("end面向切面------>结束事务");
	}
	
	//调用后通知(如果出现异常,不执行)
	public void afterReturning(){
		System.out.println("------>afterReturning");
	}
	
	//异常后通知
	public void afterThrowing(){
		System.out.println("------->afterThrowing");
	}
	
	public void arround(ProceedingJoinPoint pjp) throws Throwable{
		//在before之前执行
		System.out.println("----->环绕前");
		//执行目标方法
		pjp.proceed();
		//在目标方法之后执行
		System.out.println("----->环绕后");
	}
}
