package com.hjd.aop1_pointcut;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 用注解实现aop
 * @author huangjundong
 *
 */
public class App {

	
	
	@Test
	public void test_aop1(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/hjd/aop1_xml/applicationContext.xml");
		OrderDao orderDao = (OrderDao) ac.getBean("orderDao");
		System.out.println(orderDao.getClass());
		orderDao.save();
	}
	
	@Test
	public void test_aop(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/hjd/aop1_xml/applicationContext.xml");
		Aop orderDao = (Aop) ac.getBean("aop");
		System.out.println(orderDao.getClass());
	}
	
}
