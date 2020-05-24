package com.gxc.spring.demo.ioc;

import com.gxc.spring.demo.ioc.service.GoodsService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author GongXincheng
 * @date 2020/5/14 16:14
 */
public class XmlMain {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");

		GoodsService goodsService = context.getBean(GoodsService.class);

		String hello = goodsService.getGoods("hello");
		System.out.println(hello);

		context.close();
	}

}
