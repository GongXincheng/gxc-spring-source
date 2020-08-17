package com.gxc.spring.demo.getBean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author GongXincheng
 * @date 2020/8/17 09:41
 */
@Component
public class GxcFactoryBean implements FactoryBean<GxcBean> {

	@Override
	public GxcBean getObject() throws Exception {
		return new GxcBean();
	}

	@Override
	public Class<?> getObjectType() {
		return GxcBean.class;
	}
}
