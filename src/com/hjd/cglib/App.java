package com.hjd.cglib;

import org.junit.Test;

public class App {
	
	@Test
	public void test_cglib(){
		//创建目标对象
		UserDao userDao = new UserDao();
		//创建代理对象对象
		//如果看到xxx$则是cglib代理,如果看到$proxy则是动态代理
		UserDao proxy = (UserDao) new ProxyFactory(userDao).getProxyInstance();
		proxy.save();
	}
	
}
