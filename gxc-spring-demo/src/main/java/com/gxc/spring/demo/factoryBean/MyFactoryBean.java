package com.gxc.spring.demo.factoryBean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Configuration;

/**
 * @author GongXincheng
 * @date 2020/8/13 10:24
 */
@Configuration
public class MyFactoryBean implements FactoryBean<Hello> {

	@Override
	public Hello getObject() throws Exception {
		Hello hello = new Hello();
		hello.setContent("hello world");
		return hello;
	}

	@Override
	public Class<?> getObjectType() {
		return Hello.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
