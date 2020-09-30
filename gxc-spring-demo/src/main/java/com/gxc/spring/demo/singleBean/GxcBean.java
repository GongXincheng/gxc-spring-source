package com.gxc.spring.demo.singleBean;

import org.springframework.stereotype.Component;

/**
 * @author GongXincheng
 * @date 2020/9/11 09:49
 */
@Component
public class GxcBean {

	public GxcBean() {
	}

	public void test(String message) {
		System.out.println(message);
	}

}
