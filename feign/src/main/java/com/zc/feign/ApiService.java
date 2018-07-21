package com.zc.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient( value = "eureka-client1",fallback = ApiServiceError.class)
public interface ApiService {
	@RequestMapping( value = "/index", method = RequestMethod.GET)
	String index();
}
