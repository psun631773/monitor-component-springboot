package com.salmon.esb.monitor.shutdown;
import org.slf4j.LoggerFactory;
import org.springframework.boot.actuate.endpoint.web.annotation.EndpointWebExtension;
import org.springframework.boot.actuate.endpoint.web.annotation.WebEndpoint;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PostMapping;


@Configuration
@EndpointWebExtension(endpoint = CustomShutdownEndpoint.ShutdownEndpoint.class)
public class CustomShutdownEndpoint {
    private static final org.slf4j.Logger log = LoggerFactory.getLogger(CustomShutdownEndpoint.class);

    @WebEndpoint(id = "shutdown")
    public class ShutdownEndpoint {

        @PostMapping
        public void shutdown() {
            log.info("Shutting down this springboot application");
            System.exit(0); // 这里使用 System.exit(0) 来关闭应用，可以根据实际需求选择合适的关闭方式

        }
    }
}
