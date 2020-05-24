package com.gxc.spring.demo.ioc;

import com.gxc.spring.demo.ioc.config.GxcConfiguration;
import com.gxc.spring.demo.ioc.config.GxcConfiguration2;
import com.gxc.spring.demo.ioc.config.processor.bean.MyBeanPostProcessor;
import com.gxc.spring.demo.ioc.config.processor.beanFactory.MyBeanFactoryPostProcessor;
import com.gxc.spring.demo.ioc.service.GoodsService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author GongXincheng
 * @date 2020-04-27 16:35
 */
public class AnnotationMain {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				GxcConfiguration.class,
				MyBeanFactoryPostProcessor.class,
				MyBeanPostProcessor.class,
				GxcConfiguration2.class
		);

		GoodsService goodsService = context.getBean(GoodsService.class);
		String result = goodsService.getGoods("Hello Spring ->" + goodsService);
		System.out.println(result);

		context.close();
	}
}
