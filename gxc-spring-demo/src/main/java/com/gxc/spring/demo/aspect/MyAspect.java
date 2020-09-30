package com.gxc.spring.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author GongXincheng
 * @date 2020/9/1 19:48
 */
@Aspect
public class MyAspect {

	@Pointcut("execution(* com.gxc.spring.demo.aspect.MyComponent..*(..))")
	public void pointCut() {
	}

	@Around("pointCut()")
	public Object afterAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
		try {
			System.out.println("=== before ===");
			return joinPoint.proceed();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			System.out.println("发生异常");
			throw throwable;
		} finally {
			System.out.println("=== after ===");
		}
	}

}
