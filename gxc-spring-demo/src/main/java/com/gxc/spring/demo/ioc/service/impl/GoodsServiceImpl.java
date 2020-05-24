package com.gxc.spring.demo.ioc.service.impl;

import com.gxc.spring.demo.ioc.manger.UserManager;
import com.gxc.spring.demo.ioc.service.GoodsService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 *
 * @author GongXincheng
 * @date 2020/5/19 15:43
 */
@Service
public class GoodsServiceImpl implements GoodsService, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean {

	// 1
	public GoodsServiceImpl() {
		System.out.println("|- GoodsServiceImpl 被初始化...\n");
	}

	private UserManager userManager;

	// 2
	@Autowired
	public void setUserManager(UserManager userManager) {
		System.out.println("|-  GoodsServiceImpl 注入 UserManager ...");
		this.userManager = userManager;
	}

	// 3
	@Override
	public void setBeanName(String name) {
		System.out.println("|- BeanNameAware's");
	}

	// 4
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("|- BeanFactoryAware's setBeanFactory");
	}

	// 5
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("|- ApplicationContextAware's setApplicationContext");
	}

	// 6 -> BeanPostProcessor:before

	// 7
	@PostConstruct
	public void postConstruct() {
		System.out.println("|- GoodsServiceImpl's PostConstruct");
	}

	// 8
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("|- InitializingBean's afterPropertiesSet");
	}

	// 9
	public void initMethod() {
		System.out.println("|- GoodsServiceImpl's initMethod");
	}

	// 10 -> BeanPostProcessor:after

	@Override
	public String getGoods(String message) {
		return userManager.getUserManager(message);
	}
}
