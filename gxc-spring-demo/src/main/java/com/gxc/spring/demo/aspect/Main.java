package com.gxc.spring.demo.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author GongXincheng
 * @date 2020/9/1 19:47
 */
@Configuration
@EnableAspectJAutoProxy
public class Main {

	@Bean
	public MyComponent myComponent() {
		return new MyComponent();
	}

	@Bean
	public MyAspect myAspect() {
		return new MyAspect();
	}

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
		MyComponent bean = context.getBean(MyComponent.class);
		System.out.println(bean.div(10, 2));
	}

}
