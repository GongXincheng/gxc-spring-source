package com.gxc.spring.demo.factoryBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author GongXincheng
 * @date 2020/8/13 10:26
 */
public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyFactoryBean.class);
		System.out.println(applicationContext.getBean("myFactoryBean"));
		System.out.println(applicationContext.getBean("&myFactoryBean"));



	}

}
