package com.zendlee.sFlowC.repository;

import com.zendlee.sFlowC.repository.sample.Sample;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Arrays;

/**
 * @author zenli
 */
public class SFlowHead implements Serializable{
//    @Id
//    private String id;

    private int version; //sFlow版本号
    private int ipVersion; //ip协议版本
    private byte[] ipAddress;  //采样交换机的设备ip ? todo ip类型
    private int subAgentId;  //子设备id
    private int sequenceNumber;  //sFlow报文序列号
    private int upTime;     //自启动经过的毫秒数
    private int numSamples;  //包含的记录数目
    private Sample[] samples; //记录的内容


//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }

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

    public byte[] getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(byte[] ipAddress) {
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
        this.samples = new Sample[numSamples];
    }

    public Sample[] getSamples() {
        return samples;
    }

    public void setSamples(Sample sample, int i ){
        samples[i] = sample;
    }

    @Override
    public String toString() {
        return "SFlowHead{" +
                "version=" + version +
                ", ipVersion=" + ipVersion +
                ", ipAddress=" + Arrays.toString(ipAddress) +
                ", subAgentId=" + subAgentId +
                ", sequenceNumber=" + sequenceNumber +
                ", upTime=" + upTime +
                ", numSamples=" + numSamples +
                ", samples=" + Arrays.toString(samples) +
                '}';
    }
}
