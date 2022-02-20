package com.learn.propertiesymlclass.properties;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;



@ConfigurationProperties(prefix = "telemetry.cache.ehcache", ignoreUnknownFields = false)
@Data
public class EhCacheProperties {

    private Integer timeToLiveSeconds;
    private Integer maxEntries;


}