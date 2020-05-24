package com.gxc.spring.demo.ioc.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author GongXincheng
 * @date 2020/5/19 14:56
 */
@SuppressWarnings("ALL")
public class MyCondition implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
//		System.out.println(context);
//		System.out.println(metadata);
		return true;
	}
}
