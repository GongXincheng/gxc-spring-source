package com.gxc.spring.demo.beanPostProcessor;

import com.gxc.spring.demo.beanPostProcessor.bean.World;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author GongXincheng
 * @date 2020/8/13 10:45
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Before -> beanName：" + beanName + "\t bean：" + bean);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("After -> beanName：" + beanName + "\t bean：" + bean);

		if (bean instanceof World) {
			return Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(), new InvocationHandler() {
				@Override
				public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
					System.out.print("增强 -> ");
					return method.invoke(bean, args);
				}
			});
//			Enhancer enhancer = new Enhancer();
//			enhancer.setSuperclass(World.class);
//			enhancer.setCallback((MethodInterceptor) (o, method, objects, methodProxy) -> {
//				System.out.println("增强->");
//				return method.invoke(bean, objects);
//			});
//			return enhancer.create();
		}
		return bean;
	}
}
