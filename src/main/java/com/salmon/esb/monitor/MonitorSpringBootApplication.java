package com.salmon.esb.monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//监控服务端注解
@SpringBootApplication
@EnableAdminServer
public class MonitorSpringBootApplication {

    public static void main(String[] args) {
        // 启动应用程序，并将自定义参数传递给 SpringApplication.run
        SpringApplication.run(MonitorSpringBootApplication.class, args);
    }
}
