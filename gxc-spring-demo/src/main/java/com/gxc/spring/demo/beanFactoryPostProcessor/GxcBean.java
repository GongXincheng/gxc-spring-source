package com.gxc.spring.demo.beanFactoryPostProcessor;

import org.springframework.stereotype.Component;

/**
 * @author GongXincheng
 * @date 2020/8/24 16:13
 */
@Component
public class GxcBean {

	public String hello(String message) {
		return message;
	}

}
