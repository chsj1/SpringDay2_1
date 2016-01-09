package com.hjd.aop1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect //指定当前类为切面类(很多重复代码形成的类,就叫做切面类)
public class Aop {
	
	
	//将重复的切面表达式提取出来
	@Pointcut("execution(* com.hjd.aop1.UserDao.*(..))")
	public void pointCut(){
		
	}
	
	/*
	 * Before:在调用目标方法之前调用
	 * execution(* ):固定写法
	 * UserDao.*:作用于UserDao这个类中的所有方法
	 * *.*:作用于所有类的所有方法
	 * ..:可变参数.当没有参数的时候可以不写.
	 */
	@Before("execution(* com.hjd.aop1.UserDao.*(..))")
	public void begin(){
		System.out.println("面向切面------>开启事务");
	}
	
	//最终通知(无论是否出现异常,都会执行)
	//这里使用到了切面表达式
	@After("pointCut()")
	public void end(){
		System.out.println("面向切面------>结束事务");
	}
	
	//调用后通知(如果出现异常,不执行)
	@AfterReturning("execution(* com.hjd.aop1.*.*(..))")
	public void afterReturning(){
		System.out.println("------>afterReturning");
	}
	
	//异常后通知
	@AfterThrowing("execution(* com.hjd.aop1.*.*(..))")
	public void afterThrowing(){
		System.out.println("------->afterThrowing");
	}
	
	@Around("execution(* com.hjd.aop1.*.*(..))")
	public void arround(ProceedingJoinPoint pjp) throws Throwable{
		//在before之前执行
		System.out.println("----->环绕前");
		//执行目标方法
		pjp.proceed();
		//在目标方法之后执行
		System.out.println("----->环绕后");
	}
}
