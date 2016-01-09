package com.hjd.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
	
	public static Object target;
	public static Aop aop;
	
	public static Object getProxyInstance(Object target1,Aop aop1){
		target = target1;
		aop = aop1;
		
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				aop.begin();
				Object resultValue = method.invoke(target, args);
				aop.end();
				
				return resultValue;
			}
		});
	}
}
