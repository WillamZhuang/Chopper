package com.dushsoft.study.cloud;

/**
 * Created by zcd on 2018/4/10.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
