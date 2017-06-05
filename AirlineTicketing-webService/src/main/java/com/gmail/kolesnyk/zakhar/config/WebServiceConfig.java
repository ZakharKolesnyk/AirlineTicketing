package com.gmail.kolesnyk.zakhar.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.gmail.kolesnyk.zakhar")
@PropertySource("classpath:/application.properties")
public class WebServiceConfig {
}
