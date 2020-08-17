package com.gxc.spring.demo.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author GongXincheng
 * @date 2020/8/13 10:45
 */
//@Component
public class MyBeanPostProcessor2 implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Before2 -> beanName：" + beanName + "\t bean：" + bean);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("After2 -> beanName：" + beanName + "\t bean：" + bean);
		return bean;
	}
}
