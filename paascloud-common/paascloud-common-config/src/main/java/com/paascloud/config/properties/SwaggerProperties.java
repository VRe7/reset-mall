package com.paascloud.config.properties;

import lombok.Data;

/**
 * description: swagger配置参数<br>
 * version: 1.0 <br>
 * date: 2019/2/14 13:55 <br>
 * author: vnaLc <br>
 */
@Data
public class SwaggerProperties {

	private String title;

	private String description;

	private String version;

	private String license;

	private String licenseUrl;

	private String contactName;

	private String contactUrl;

	private String contactEmail;
}
