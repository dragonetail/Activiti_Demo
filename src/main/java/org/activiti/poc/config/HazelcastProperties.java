package org.activiti.poc.config;

import lombok.Getter;
import org.activiti.poc.common.HazelcastServerProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@ConfigurationProperties(prefix = "hazelcast", ignoreUnknownFields = false)
@Component
public class HazelcastProperties {

    private final HazelcastServerProperties pocServer01 =
            new HazelcastServerProperties("pocHazelcastCache01", 55100);

}