package com.paascloud.provider.model.service.hystrix;


import com.paascloud.provider.model.service.UacUserTokenFeignApi;
import com.paascloud.wrapper.Wrapper;
import org.springframework.stereotype.Component;

@Component
public class UacUserTokenFeignApiHystrix implements UacUserTokenFeignApi {

	@Override
	public Wrapper<Integer> updateTokenOffLine() {
		return null;
	}
}
