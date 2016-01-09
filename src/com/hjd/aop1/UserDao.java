package com.hjd.aop1;

import org.springframework.stereotype.Component;


@Component
public class UserDao implements IUserDao {

	@Override
	public void save() throws Throwable{
		System.out.println("----->保存对象");
		
		//架上这个主要是为了演示afterThrowing的使用
//		throw new Exception("出现异常了");
	}

}
