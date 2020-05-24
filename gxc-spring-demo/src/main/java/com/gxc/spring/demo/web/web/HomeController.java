package com.gxc.spring.demo.web.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author GongXincheng
 * @date 2020/5/6 13:36
 */
@RestController
public class HomeController {

	@GetMapping("/index")
	public Object index() {
		return "Hello Spring";
	}

}
