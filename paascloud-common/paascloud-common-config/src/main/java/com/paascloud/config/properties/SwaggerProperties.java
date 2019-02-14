package com.paascloud.config.properties;

import lombok.Data;

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
