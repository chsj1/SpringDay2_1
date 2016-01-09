package com.hjd.staticAnddynamic;

import org.junit.Test;

public class App {
	
	/*
	 * ��ʾ��̬�����ʹ��
	 */
	@Test
	public void test_jingtaidaili(){
		IUserDao userDao = new UserDao();
		UserDaoProxy proxy = new UserDaoProxy(userDao);
		proxy.save();
	}
	
	@Test
	public void test_dynamicdaili(){
		IUserDao target = new UserDao();
		IUserDao proxy =  (IUserDao) new ProxyFactory(target).getProxyInstance();
		proxy.save();
		
	}
}
