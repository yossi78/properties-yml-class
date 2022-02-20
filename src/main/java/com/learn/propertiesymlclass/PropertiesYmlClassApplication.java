package com.learn.propertiesymlclass;

import com.learn.propertiesymlclass.properties.EhCacheProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({EhCacheProperties.class})
public class PropertiesYmlClassApplication {

	public static void main(String[] args) {
		SpringApplication.run(PropertiesYmlClassApplication.class, args);
	}

}
