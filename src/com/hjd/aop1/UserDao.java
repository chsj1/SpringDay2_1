package com.hjd.aop1;

import org.springframework.stereotype.Component;


@Component
public class UserDao implements IUserDao {

	@Override
	public void save() throws Throwable{
		System.out.println("----->�������");
		
		//���������Ҫ��Ϊ����ʾafterThrowing��ʹ��
//		throw new Exception("�����쳣��");
	}

}
