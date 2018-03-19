package com.zendlee.sFlowC.init;

import com.zendlee.sFlowC.handler.SFlowServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @author zenli
 * 启动事件以及加载相应服务
 */
public class StartUpEvent implements ApplicationListener<ContextRefreshedEvent> {
    private static final Logger log = LoggerFactory.getLogger(StartUpEvent.class);

    private static ApplicationContext context;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("event start");
        context = contextRefreshedEvent.getApplicationContext();
        //获取config bean
        SFlowConfig sFlowConfig = (SFlowConfig) context.getBean(SFlowConfig.class);
        //获取server bean
        SFlowServer sFlowServer = (SFlowServer) context.getBean(SFlowServer.class);
        sFlowServer.run(sFlowConfig.getSFlowReceivePort());
    }
}
