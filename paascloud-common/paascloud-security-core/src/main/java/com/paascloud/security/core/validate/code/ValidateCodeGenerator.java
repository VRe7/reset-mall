package com.paascloud.security.core.validate.code;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * description: 校验码生成器<br>
 * version: 1.0 <br>
 * date: 2019/2/14 10:28 <br>
 * author: vnaLc <br>
 */
public interface ValidateCodeGenerator {

	/**
	 * 生成校验码
	 *
	 * @param request the request
	 *
	 * @return validate code
	 */
	ValidateCode generate(ServletWebRequest request);

}
