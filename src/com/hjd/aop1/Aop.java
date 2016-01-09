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
@Aspect //ָ����ǰ��Ϊ������(�ܶ��ظ������γɵ���,�ͽ���������)
public class Aop {
	
	
	//���ظ���������ʽ��ȡ����
	@Pointcut("execution(* com.hjd.aop1.UserDao.*(..))")
	public void pointCut(){
		
	}
	
	/*
	 * Before:�ڵ���Ŀ�귽��֮ǰ����
	 * execution(* ):�̶�д��
	 * UserDao.*:������UserDao������е����з���
	 * *.*:����������������з���
	 * ..:�ɱ����.��û�в�����ʱ����Բ�д.
	 */
	@Before("execution(* com.hjd.aop1.UserDao.*(..))")
	public void begin(){
		System.out.println("��������------>��������");
	}
	
	//����֪ͨ(�����Ƿ�����쳣,����ִ��)
	//����ʹ�õ���������ʽ
	@After("pointCut()")
	public void end(){
		System.out.println("��������------>��������");
	}
	
	//���ú�֪ͨ(��������쳣,��ִ��)
	@AfterReturning("execution(* com.hjd.aop1.*.*(..))")
	public void afterReturning(){
		System.out.println("------>afterReturning");
	}
	
	//�쳣��֪ͨ
	@AfterThrowing("execution(* com.hjd.aop1.*.*(..))")
	public void afterThrowing(){
		System.out.println("------->afterThrowing");
	}
	
	@Around("execution(* com.hjd.aop1.*.*(..))")
	public void arround(ProceedingJoinPoint pjp) throws Throwable{
		//��before֮ǰִ��
		System.out.println("----->����ǰ");
		//ִ��Ŀ�귽��
		pjp.proceed();
		//��Ŀ�귽��֮��ִ��
		System.out.println("----->���ƺ�");
	}
}
