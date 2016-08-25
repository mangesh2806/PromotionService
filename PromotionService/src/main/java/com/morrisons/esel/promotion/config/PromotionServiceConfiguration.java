package com.morrisons.esel.promotion.config;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.dropwizard.Configuration;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;



public class PromotionServiceConfiguration extends Configuration {

	@NotEmpty
	private String version;

	@JsonProperty
	public String getVersion() {
		return version;
	}

	@JsonProperty
	public void setVersion(String version) {
		this.version = version;
	}

	@JsonProperty("swagger")
	public SwaggerBundleConfiguration swaggerBundleConfiguration;

	public SwaggerBundleConfiguration getSwaggerBundleConfiguration() {
		return swaggerBundleConfiguration;
	}

	public void setSwaggerBundleConfiguration(SwaggerBundleConfiguration swaggerBundleConfiguration) {
		this.swaggerBundleConfiguration = swaggerBundleConfiguration;
	}

}