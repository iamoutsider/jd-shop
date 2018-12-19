package com.example.jdproducerjudiciary;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.example.jdproducerjudiciary.dao")
//@EnableSwagger2
public class JdProducerJudiciaryApplication {

    public static void main(String[] args) {
        SpringApplication.run(JdProducerJudiciaryApplication.class, args);
    }

}

