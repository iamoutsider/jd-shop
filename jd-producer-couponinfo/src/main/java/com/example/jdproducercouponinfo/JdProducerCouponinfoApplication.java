package com.example.jdproducercouponinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * @author RanHaoHao
 */
@EnableEurekaClient
@SpringBootApplication
public class JdProducerCouponinfoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JdProducerCouponinfoApplication.class, args);
    }

}

