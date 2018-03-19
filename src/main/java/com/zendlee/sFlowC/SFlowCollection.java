package com.zendlee.sFlowC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author zenli
 */

@SpringBootApplication
@EnableAsync
@EnableScheduling
public class SFlowCollection {
    public static void main(String[] args){
        //spring boot app启动入口
        SpringApplication.run(SFlowCollection.class, args);
    }
}
