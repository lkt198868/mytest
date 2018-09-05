package com.lkt.mytest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class MytestApplication {

    public static final Logger logger=LoggerFactory.getLogger(MytestApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(MytestApplication.class, args);
        logger.info("==============TestApplication====Start============");
    }
}
