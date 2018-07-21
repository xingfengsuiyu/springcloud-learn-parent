package com.zc.eurekaclient1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zc
 * @create 2018-07-18 17:58
 **/
@RestController
public class HelloController {

	@Value("${server.port}")
	private int port;

	@RequestMapping("index")
	public String index() {
		return "Hello World" + port;
	}
}
