package com.gxc.spring.demo.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author GongXincheng
 * @date 2020/5/6 13:15
 */
@Configuration
@ComponentScan(
		basePackages = {"com.gxc.spring.demo.web"},
		excludeFilters = {
				@ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)
		}
)
public class RootConfig {
}
