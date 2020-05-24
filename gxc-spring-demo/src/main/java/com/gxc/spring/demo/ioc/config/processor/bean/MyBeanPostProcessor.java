package com.gxc.spring.demo.ioc.config.processor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * BeanPostProcessor 接口实现
 *
 * @author GongXincheng
 * @date 2020/5/20 09:33
 */
@Order(value = Ordered.HIGHEST_PRECEDENCE)
@Configuration
public class MyBeanPostProcessor implements BeanPostProcessor {

	public MyBeanPostProcessor() {
		System.out.println("|- MyBeanPostProcessor 被初始化 ...\n");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("|- MyBeanPostProcessor's postProcessBeforeInitialization -> " + beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("|- MyBeanPostProcessor's postProcessAfterInitialization -> " + beanName + "\n");
		return bean;
	}
}
