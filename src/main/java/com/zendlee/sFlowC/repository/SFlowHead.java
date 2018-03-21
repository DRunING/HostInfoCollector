package com.zendlee.sFlowC.repository;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author zenli
 */
public class SFlowHead implements Serializable{
    @Id
    private String id;

    private int version; //sFlow版本号
    private int ipVersion; //ip协议版本
    private int ipAddress;  //采样交换机的设备ip ? todo ip类型
    private int subAgentId;  //子设备id
    private int sequenceNumber;  //sFlow报文序列号
    private int upTime;     //自启动经过的毫秒数
    private int numSamples;  //包含的记录数目

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(int ipVersion) {
        this.ipVersion = ipVersion;
    }

    public int getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(int ipAddress) {
        this.ipAddress = ipAddress;
    }

    public int getSubAgentId() {
        return subAgentId;
    }

    public void setSubAgentId(int subAgentId) {
        this.subAgentId = subAgentId;
    }

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(int sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public int getUpTime() {
        return upTime;
    }

    public void setUpTime(int upTime) {
        this.upTime = upTime;
    }

    public int getNumSamples() {
        return numSamples;
    }

    public void setNumSamples(int numSamples) {
        this.numSamples = numSamples;
    }
}
