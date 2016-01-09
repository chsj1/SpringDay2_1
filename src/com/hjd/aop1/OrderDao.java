package com.hjd.aop1;

import org.springframework.stereotype.Component;


@Component
public class OrderDao {

	public void save() {
		System.out.println("orderDao的----->保存对象");
	}

}
