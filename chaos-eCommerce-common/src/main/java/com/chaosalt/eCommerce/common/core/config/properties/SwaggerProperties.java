package com.chaosalt.eCommerce.common.core.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "swagger")
public class SwaggerProperties {
	private String title;
	private String description;
	private String version;
}
