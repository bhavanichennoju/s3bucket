package com.fileapis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

@Configuration
public class AwsS3ClientConfig {

	@Bean
	public AmazonS3 s3Client() {
		return AmazonS3ClientBuilder.standard().withRegion(Regions.AP_SOUTH_1).build();
	}
}