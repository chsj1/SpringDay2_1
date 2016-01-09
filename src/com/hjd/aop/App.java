package com.hjd.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 用于测试自己实现的aop
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
