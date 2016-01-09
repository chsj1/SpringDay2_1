package com.hjd.jdbc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 用于演示spring与jdbc的整合
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
