package com.hjd.aop1;

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
	public void test_aop() throws Throwable{
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/hjd/aop1/applicationContext.xml");
		IUserDao userDao = (IUserDao) ac.getBean("userDao");
		System.out.println(userDao.getClass());
		userDao.save();
	}
	
	@Test
	public void test_aop1(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/hjd/aop1/applicationContext.xml");
		OrderDao userDao = (OrderDao) ac.getBean("orderDao");
		System.out.println(userDao.getClass());
		userDao.save();
	}
	
}
