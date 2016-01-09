package com.hjd.staticAnddynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 演示动态代理的使用
 * @author huangjundong
 *
 */
public class ProxyFactory {
	private Object target;
	
	public ProxyFactory(Object target) {
		this.target = target;
	}
	
	public Object getProxyInstance(){
		/*
		 * (目标对象的类型,目标对象的接口类型,事件处理器)
		 */
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				Object resultValue = method.invoke(target, args);
				return resultValue;
			}
		});
	}
}
