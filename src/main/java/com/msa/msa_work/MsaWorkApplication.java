package com.msa.msa_work;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsaWorkApplication {
    public static void main(String[] args) {
        SpringApplication.run(MsaWorkApplication.class, args);
    }
}
