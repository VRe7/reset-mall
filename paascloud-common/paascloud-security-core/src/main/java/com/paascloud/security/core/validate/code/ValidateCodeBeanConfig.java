package com.paascloud.security.core.validate.code;

import com.google.code.kaptcha.Producer;
import com.paascloud.security.core.properties.SecurityProperties;
import com.paascloud.security.core.validate.code.sms.DefaultSmsCodeSender;
import com.paascloud.security.core.validate.code.sms.SmsCodeSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.paascloud.security.core.validate.code.image.ImageCodeGenerator;


@Configuration
public class ValidateCodeBeanConfig {

	@Autowired
	private SecurityProperties securityProperties;
	@Autowired
	private Producer captchaProducer;

	/**
	 * 图片验证码图片生成器
	 *
	 * @return validate code generator
	 */
	@Bean
	@ConditionalOnMissingBean(name = "imageValidateCodeGenerator")
	public ValidateCodeGenerator imageValidateCodeGenerator() {
		ImageCodeGenerator codeGenerator = new ImageCodeGenerator();
		codeGenerator.setSecurityProperties(securityProperties);
		codeGenerator.setCaptchaProducer(captchaProducer);
		return codeGenerator;
	}

	/**
	 * 短信验证码发送器
	 *
	 * @return sms code sender
	 */
	@Bean
	@ConditionalOnMissingBean(SmsCodeSender.class)
	public SmsCodeSender smsCodeSender() {
		return new DefaultSmsCodeSender();
	}

}
