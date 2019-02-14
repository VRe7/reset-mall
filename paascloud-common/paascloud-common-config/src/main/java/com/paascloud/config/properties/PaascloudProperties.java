package com.paascloud.config.properties;


import com.paascloud.base.constant.GlobalConstant;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;


@Data
@ConfigurationProperties(prefix = GlobalConstant.ROOT_PREFIX)
public class PaascloudProperties {
	private AsyncTaskProperties task = new AsyncTaskProperties();
	private SwaggerProperties swagger = new SwaggerProperties();
	private JobProperties job = new JobProperties();
}
