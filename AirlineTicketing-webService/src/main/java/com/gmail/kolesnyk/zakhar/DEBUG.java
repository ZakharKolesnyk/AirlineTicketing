package com.gmail.kolesnyk.zakhar;


import com.gmail.kolesnyk.zakhar.config.WebServiceConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DEBUG {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(WebServiceConfig.class);
    }
}
