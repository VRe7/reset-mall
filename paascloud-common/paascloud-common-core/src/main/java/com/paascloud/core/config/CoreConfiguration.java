package com.paascloud.core.config;

import com.paascloud.core.interceptor.SqlLogInterceptor;
import com.paascloud.core.interceptor.TokenInterceptor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * description: 加载LWR规则<br>
 * version: 1.0 <br>
 * date: 2019/2/14 10:10 <br>
 * author: vnaLc <br>
 */
@Configuration
public class CoreConfiguration {
	@LoadBalanced
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	public SqlLogInterceptor sqlLogInterceptor() {
		return new SqlLogInterceptor();
	}


	@Bean
	@ConditionalOnMissingBean(HandlerInterceptor.class)
	@ConditionalOnProperty(prefix = "paascloud.token.interceptor", name = "enable", havingValue = "true")
	public TokenInterceptor tokenInterceptor() {
		return new TokenInterceptor();
	}
}
