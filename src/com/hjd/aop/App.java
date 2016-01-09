package com.hjd.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ���ڲ����Լ�ʵ�ֵ�aop
 * @author huangjundong
 *
 */
public class App {

	@Test
	public void test_aop(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/hjd/aop/applicationContext.xml");
		IUserDao userDao = (IUserDao) ac.getBean("userDao_proxy");
		userDao.save();
	}
}
