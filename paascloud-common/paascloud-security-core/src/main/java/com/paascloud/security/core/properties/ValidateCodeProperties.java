package com.paascloud.security.core.properties;

import lombok.Data;

/**
 * description: 验证码配置<br>
 * version: 1.0 <br>
 * date: 2019/2/14 10:24 <br>
 * author: vnaLc <br>
 */
@Data
public class ValidateCodeProperties {

	/**
	 * 图片验证码配置
	 */
	private ImageCodeProperties image = new ImageCodeProperties();

}
