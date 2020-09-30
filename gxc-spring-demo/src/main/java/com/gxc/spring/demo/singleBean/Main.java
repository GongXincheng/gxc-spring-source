package com.gxc.spring.demo.singleBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author GongXincheng
 * @date 2020/9/11 09:49
 */
public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(GxcConfiguration.class);
		applicationContext.refresh();

		GxcBean bean = applicationContext.getBean(GxcBean.class);
		bean.test("hello world");
	}

}
