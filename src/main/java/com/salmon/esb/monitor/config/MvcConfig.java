package com.salmon.esb.monitor.config;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@Component
public class MvcConfig {
    @Resource
    private ApplicationContext applicationContext;

    @PostConstruct
    public static void init(){

    }
}
