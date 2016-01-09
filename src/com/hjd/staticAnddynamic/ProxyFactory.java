package com.hjd.staticAnddynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ��ʾ��̬�����ʹ��
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
		 * (Ŀ����������,Ŀ�����Ľӿ�����,�¼�������)
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
