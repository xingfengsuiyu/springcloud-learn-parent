package com.zc.eurekaclient2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zc
 * @create 2018-07-18 17:58
 **/
@RestController
@RefreshScope
public class HelloController {

	@Value("${server.port}")
	private int port;

	@Value("${foo}")
	private int foo;

	@RequestMapping("index")
	public String index() {
		return "Hello World" + port+"\t"+foo;
	}
}
