package com.gxc.spring.demo.beanPostProcessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author GongXincheng
 * @date 2020/8/13 10:46
 */
@Configuration
@ComponentScan(basePackages = {"com.gxc.spring.demo.beanPostProcessor"})
public class MyConfig {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		Object world = context.getBean("world");
		System.out.println(world);

	}

}
