package com.gxc.spring.demo.utilsDemo;

import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author GongXincheng
 * @date 2020/8/21 13:24
 */
public class ReflectionUtilsDemo {

	public static void main(String[] args) throws Exception {
		BeanFactoryUtilsDemo demo = new BeanFactoryUtilsDemo();

		Method main = BeanFactoryUtilsDemo.class.getDeclaredMethod("hello");
		System.out.println(ReflectionUtils.invokeMethod(main, demo));

		// 获取构造方法
		Constructor<BeanFactoryUtilsDemo> constructor = ReflectionUtils.accessibleConstructor(BeanFactoryUtilsDemo.class);
		BeanFactoryUtilsDemo bean = constructor.newInstance();
		System.out.println(bean);


	}

}
