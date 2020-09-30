package com.gxc.spring.demo.beanFactoryPostProcessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author GongXincheng
 * @date 2020/8/24 16:09
 */
@Configuration
@ComponentScan(basePackages = "com.gxc.spring.demo.beanFactoryPostProcessor")
public class BeanFactoryPostProcessorDemo {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanFactoryPostProcessorDemo.class);
		System.out.println(context.getBean(GxcBean.class));
		System.out.println(context.getBean(GxcBean.class));

	}

}
