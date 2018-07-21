package com.zc.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * controller
 *
 * @author zc
 * @create 2018-07-21 15:00
 **/
@RestController
public class ApiController {

	@Autowired
	private  ApiService apiService;

	@RequestMapping("index")
	public String index() {
		return apiService.index();
	}
}
