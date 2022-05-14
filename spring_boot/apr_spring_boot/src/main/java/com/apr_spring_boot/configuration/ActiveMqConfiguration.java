package com.apr_spring_boot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;

import javax.jms.ConnectionFactory;

@Configuration
@EnableJms
public class ActiveMqConfiguration {
    @Bean
    public DefaultJmsListenerContainerFactory jsmListenerFactory(ConnectionFactory connecFactory) {
        DefaultJmsListenerContainerFactory factory  = new DefaultJmsListenerContainerFactory();
        factory.setConnectionFactory(connecFactory);
        factory.setConcurrency("5-10");
        return factory;
    }
}
