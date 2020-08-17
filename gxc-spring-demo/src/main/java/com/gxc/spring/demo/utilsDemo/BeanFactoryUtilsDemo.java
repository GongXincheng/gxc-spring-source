package com.gxc.spring.demo.utilsDemo;

import org.springframework.beans.factory.BeanFactoryUtils;

/**
 * @author GongXincheng
 * @date 2020/8/13 14:14
 */
public class BeanFactoryUtilsDemo {

	public static void main(String[] args) {
		System.out.println(BeanFactoryUtils.transformedBeanName("name"));    // name
		System.out.println(BeanFactoryUtils.transformedBeanName("&name")); // name
		System.out.println(BeanFactoryUtils.transformedBeanName("&&name"));// name
	}

}
