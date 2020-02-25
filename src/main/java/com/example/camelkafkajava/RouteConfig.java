package com.example.camelkafkajava;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class RouteConfig extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:/Users/adamgiemza/camel_test")
                .to("kafka:files");
    }
}
