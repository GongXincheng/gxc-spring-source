package com.gxc.spring.demo.getBean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author GongXincheng
 * @date 2020/8/17 09:39
 */
@Configuration
public class GetBeanDemo {

	@Bean
	public GxcBean gxcBean() {
		return new GxcBean();
	}

	@Bean
	public FactoryBean<GxcBean> gxcFactoryBean() {
		return new GxcFactoryBean();
	}

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GetBeanDemo.class);
		System.out.println(context.getBean("gxcBean"));
		System.out.println(context.getBean("gxcFactoryBean"));
		System.out.println(context.getBean(BeanFactory.FACTORY_BEAN_PREFIX + "gxcFactoryBean"));

	}


}
