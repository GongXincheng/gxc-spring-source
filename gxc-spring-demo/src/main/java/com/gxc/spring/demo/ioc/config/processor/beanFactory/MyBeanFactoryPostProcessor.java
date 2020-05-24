package com.gxc.spring.demo.ioc.config.processor.beanFactory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * 实现 BeanFactoryPostProcessor 接口
 *
 * @author GongXincheng
 * @date 2020/5/19 17:28
 */
@Order
@Configuration
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	public MyBeanFactoryPostProcessor() {
		System.out.println("|- MyBeanFactoryPostProcessor 被初始化");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition bd = beanFactory.getBeanDefinition("goodsServiceImpl");

		String propertyValuesString = bd.getPropertyValues().toString();
		System.out.println("bd.getPropertyValues() -> " + propertyValuesString);
		bd.setInitMethodName("initMethod");
		System.out.println("|- MyBeanFactoryPostProcessor -> " + beanFactory.getClass().getSimpleName() + " 完成... \n");
	}
}
