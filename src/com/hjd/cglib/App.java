package com.hjd.cglib;

import org.junit.Test;

public class App {
	
	@Test
	public void test_cglib(){
		//����Ŀ�����
		UserDao userDao = new UserDao();
		//��������������
		//�������xxx$����cglib����,�������$proxy���Ƕ�̬����
		UserDao proxy = (UserDao) new ProxyFactory(userDao).getProxyInstance();
		proxy.save();
	}
	
}
