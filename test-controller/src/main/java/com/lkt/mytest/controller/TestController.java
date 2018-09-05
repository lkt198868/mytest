package com.lkt.mytest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    public static Logger    logger=LoggerFactory.getLogger(TestController.class);
    @RequestMapping("/hello")
    public  String   hello () {
        logger.info("info{}",1);
        logger.debug("debug{}",2);
        logger.warn("warn{}",3);
        logger.error("error{}",4);
        return "hello";
    }

}
