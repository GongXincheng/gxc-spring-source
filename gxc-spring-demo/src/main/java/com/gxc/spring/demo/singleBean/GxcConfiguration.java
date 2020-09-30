package com.gxc.spring.demo.singleBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author GongXincheng
 * @date 2020/9/11 09:49
 */
@Configuration
public class GxcConfiguration {

	@Bean
	public GxcBean gxcBean() {
		return new GxcBean();
	}

}
