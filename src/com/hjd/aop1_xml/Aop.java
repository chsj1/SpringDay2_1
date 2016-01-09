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
		System.out.println("begin��������------>��������");
	}
	
	//����֪ͨ(�����Ƿ�����쳣,����ִ��)
	//����ʹ�õ���������ʽ
	public void end(){
		System.out.println("end��������------>��������");
	}
	
	//���ú�֪ͨ(��������쳣,��ִ��)
	public void afterReturning(){
		System.out.println("------>afterReturning");
	}
	
	//�쳣��֪ͨ
	public void afterThrowing(){
		System.out.println("------->afterThrowing");
	}
	
	public void arround(ProceedingJoinPoint pjp) throws Throwable{
		//��before֮ǰִ��
		System.out.println("----->����ǰ");
		//ִ��Ŀ�귽��
		pjp.proceed();
		//��Ŀ�귽��֮��ִ��
		System.out.println("----->���ƺ�");
	}
}
