package com.gxc.spring.demo.beanPostProcessor.bean;

import org.springframework.stereotype.Component;

/**
 * @author GongXincheng
 * @date 2020/8/13 10:47
 */
@Component
public class World implements WordInterface {

	@Override
	public String hello(String msg) {
		return msg;
	}

}
