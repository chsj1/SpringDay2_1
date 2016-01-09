package com.hjd.jdbc;

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
	public void test_jdbc(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/hjd/jdbc/applicationContext.xml");
		StudentDao studentDao = (StudentDao) ac.getBean("studentDao");
//		studentDao.save();
//		studentDao.findById(5);
//		studentDao.findAll();
//		studentDao.findAllByHanlde();
		studentDao.findByIdByHanlde(4);
	}
}
