package com.hjd.staticAnddynamic;

public class UserDaoProxy implements IUserDao {
	IUserDao userDao;
	
	public UserDaoProxy(IUserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public void save() {
		System.out.println("---->��������");
		userDao.save();
		System.out.println("---->�ر�����");
	}

}
