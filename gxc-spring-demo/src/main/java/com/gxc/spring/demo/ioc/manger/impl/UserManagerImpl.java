package com.gxc.spring.demo.ioc.manger.impl;

import com.gxc.spring.demo.ioc.manger.UserManager;
import org.springframework.stereotype.Component;

/**
 * @author GongXincheng
 * @date 2020/5/19 15:44
 */
public class UserManagerImpl implements UserManager {

	@Override
	public String getUserManager(String message) {
		return message;
	}

}
