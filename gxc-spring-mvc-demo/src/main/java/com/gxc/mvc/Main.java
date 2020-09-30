package com.gxc.mvc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author GongXincheng
 * @date 2020/8/20 11:26
 */
@Configuration
public class Main {

	@Bean
	public GxcBean gxcBean() {
		return new GxcBean();
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
		Object gxc = context.getBean("gxcBean");
		System.out.println(gxc);
	}

}
