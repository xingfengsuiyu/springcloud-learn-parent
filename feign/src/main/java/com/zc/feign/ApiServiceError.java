package com.zc.feign;

import org.springframework.stereotype.Component;

/**
 * 熔断器
 *
 * @author zc
 * @create 2018-07-21 14:59
 **/
@Component
public class ApiServiceError implements ApiService {
	@Override
	public String index() {
		return "服务器发生故障";
	}
}
