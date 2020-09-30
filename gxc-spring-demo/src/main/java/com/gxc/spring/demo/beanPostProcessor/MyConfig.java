package com.gxc.spring.demo.beanPostProcessor;

import com.gxc.spring.demo.beanPostProcessor.bean.WordInterface;
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
		WordInterface world = context.getBean(WordInterface.class);
		System.out.println(world.getClass());    // class com.sun.proxy.$Proxy11
		System.out.println(world);    // 增强 -> com.gxc.spring.demo.beanPostProcessor.bean.World@4f51b3e0
		System.out.println(world.hello("hello world")); // 增强 -> hello world

	}

}
