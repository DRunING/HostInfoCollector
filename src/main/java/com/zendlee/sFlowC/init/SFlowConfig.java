package com.zendlee.sFlowC.init;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author zenli
 * 帮助sflow server获取application.properties中配置的类
 */
@Component
@ConfigurationProperties(prefix = "sflowconfig")
public class SFlowConfig {
    private int SFlowReceivePort;

    //线程池信息的四个属性
    private int corePoolSize;
    private int maxPoolSize;
    private int queueCapacity;
    private int keepAliveSeconds;


    public int getSFlowReceivePort() {
        return SFlowReceivePort;
    }

    public void setSFlowReceivePort(int SFlowReceivePort) {
        this.SFlowReceivePort = SFlowReceivePort;
    }

    public int getCorePoolSize() {
        return corePoolSize;
    }

    public void setCorePoolSize(int corePoolSize) {
        this.corePoolSize = corePoolSize;
    }

    public int getMaxPoolSize() {
        return maxPoolSize;
    }

    public void setMaxPoolSize(int maxPoolSize) {
        this.maxPoolSize = maxPoolSize;
    }

    public int getQueueCapacity() {
        return queueCapacity;
    }

    public void setQueueCapacity(int queueCapacity) {
        this.queueCapacity = queueCapacity;
    }

    public int getKeepAliveSeconds() {
        return keepAliveSeconds;
    }

    public void setKeepAliveSeconds(int keepAliveSeconds) {
        this.keepAliveSeconds = keepAliveSeconds;
    }
}
