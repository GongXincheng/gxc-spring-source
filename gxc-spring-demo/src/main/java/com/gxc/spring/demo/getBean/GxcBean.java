package com.gxc.spring.demo.getBean;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author GongXincheng
 * @date 2020/8/17 09:39
 */
@Lazy
@Component
public class GxcBean {

	public void speak(String msg) {
		System.out.println(msg);
	}

}
