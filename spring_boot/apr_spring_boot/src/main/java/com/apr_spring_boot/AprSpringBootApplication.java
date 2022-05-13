package com.apr_spring_boot;

import org.infinispan.configuration.cache.CacheMode;
import org.infinispan.configuration.cache.Configuration;
import org.infinispan.configuration.cache.ConfigurationBuilder;
import org.infinispan.spring.starter.embedded.InfinispanCacheConfigurer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableCaching
@EnableScheduling
public class AprSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AprSpringBootApplication.class, args);
	}

	@Bean
	public InfinispanCacheConfigurer cacheConfigurer() {
		return manager -> {
			final Configuration ispnConfig = new ConfigurationBuilder().clustering().cacheMode(CacheMode.LOCAL).build();
			manager.defineConfiguration("local-cache", ispnConfig);
		};
	}

}