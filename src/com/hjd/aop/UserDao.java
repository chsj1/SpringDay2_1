package com.hjd.aop;

import org.springframework.stereotype.Component;


@Component
public class UserDao implements IUserDao {

	@Override
	public void save() {
		System.out.println("----->╠ё╢Ф╤тоС");
	}

}
