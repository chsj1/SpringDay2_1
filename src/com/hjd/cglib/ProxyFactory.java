package com.hjd.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * cglib�������ʾ
 * @author huangjundong
 *
 */
public class ProxyFactory implements MethodInterceptor{
	Object target;
	
	public ProxyFactory(Object target) {
		this.target = target;
	}
	
	public Object getProxyInstance(){
		//����������
		Enhancer en = new Enhancer();
		//���ø���
		en.setSuperclass(target.getClass());
		//���ûص�����
		en.setCallback(this);
		//��������
		return en.create();
	}
	
	//�ڵ���target�ķ�����ʱ������
	@Override
	public Object intercept(Object obj, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		System.out.println("------->��������");
		
		Object resultValue = method.invoke(obj, args);
		
		System.out.println("------->��������");
		return resultValue;
	}
	
}
