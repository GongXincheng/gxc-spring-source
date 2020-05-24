package com.gxc.spring.demo.ioc.config;

import com.gxc.spring.demo.ioc.condition.MyCondition;
import com.gxc.spring.demo.ioc.manger.UserManager;
import com.gxc.spring.demo.ioc.manger.impl.UserManagerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * @author GongXincheng
 * @date 2020-04-27 16:36
 */
@Order
@Configuration
public class GxcConfiguration2 {

	public GxcConfiguration2() {
		System.out.println("|- GxcConfiguration2 被初始化");
	}

}
