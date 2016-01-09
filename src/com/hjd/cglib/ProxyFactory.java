package com.hjd.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * cglib代理的演示
 * @author huangjundong
 *
 */
public class ProxyFactory implements MethodInterceptor{
	Object target;
	
	public ProxyFactory(Object target) {
		this.target = target;
	}
	
	public Object getProxyInstance(){
		//创建工具类
		Enhancer en = new Enhancer();
		//设置父类
		en.setSuperclass(target.getClass());
		//设置回调函数
		en.setCallback(this);
		//创建子类
		return en.create();
	}
	
	//在调用target的方法的时候会调用
	@Override
	public Object intercept(Object obj, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		System.out.println("------->开启事务");
		
		Object resultValue = method.invoke(obj, args);
		
		System.out.println("------->结束事务");
		return resultValue;
	}
	
}
