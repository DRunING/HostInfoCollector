package com.zendlee.sFlowC.repository.countRecord;

/**
 * @author zenli
 * GenericInterfaceCounters is a generic switch counters record
 */
public class GenericInterfaceCounters {
    private int index;
    private int type;
    private long speed;
    private int status;
    private long inoctets;
    private int inunicastpackets;
    private int InMulticastPackets;
    private int InBroadcastPackets;
    private int InDiscards;
    private int InErrors;
    private int InUnknownProtocols;
    private long OutOctets;
    private int OutUnicastPackets;
    private int OutMulticastPackets;
    private int OutBroadcastPackets;
    private int OutDiscards;
    private int OutErrors;
    private int PromiscuousMode;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public long getSpeed() {
        return speed;
    }

    public void setSpeed(long speed) {
        this.speed = speed;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getInoctets() {
        return inoctets;
    }

    public void setInoctets(long inoctets) {
        this.inoctets = inoctets;
    }

    public int getInunicastpackets() {
        return inunicastpackets;
    }

    public void setInunicastpackets(int inunicastpackets) {
        this.inunicastpackets = inunicastpackets;
    }

    public int getInMulticastPackets() {
        return InMulticastPackets;
    }

    public void setInMulticastPackets(int inMulticastPackets) {
        InMulticastPackets = inMulticastPackets;
    }

    public int getInBroadcastPackets() {
        return InBroadcastPackets;
    }

    public void setInBroadcastPackets(int inBroadcastPackets) {
        InBroadcastPackets = inBroadcastPackets;
    }

    public int getInDiscards() {
        return InDiscards;
    }

    public void setInDiscards(int inDiscards) {
        InDiscards = inDiscards;
    }

    public int getInErrors() {
        return InErrors;
    }

    public void setInErrors(int inErrors) {
        InErrors = inErrors;
    }

    public int getInUnknownProtocols() {
        return InUnknownProtocols;
    }

    public void setInUnknownProtocols(int inUnknownProtocols) {
        InUnknownProtocols = inUnknownProtocols;
    }

    public long getOutOctets() {
        return OutOctets;
    }

    public void setOutOctets(long outOctets) {
        OutOctets = outOctets;
    }

    public int getOutUnicastPackets() {
        return OutUnicastPackets;
    }

    public void setOutUnicastPackets(int outUnicastPackets) {
        OutUnicastPackets = outUnicastPackets;
    }

    public int getOutMulticastPackets() {
        return OutMulticastPackets;
    }

    public void setOutMulticastPackets(int outMulticastPackets) {
        OutMulticastPackets = outMulticastPackets;
    }

    public int getOutBroadcastPackets() {
        return OutBroadcastPackets;
    }

    public void setOutBroadcastPackets(int outBroadcastPackets) {
        OutBroadcastPackets = outBroadcastPackets;
    }

    public int getOutDiscards() {
        return OutDiscards;
    }

    public void setOutDiscards(int outDiscards) {
        OutDiscards = outDiscards;
    }

    public int getOutErrors() {
        return OutErrors;
    }

    public void setOutErrors(int outErrors) {
        OutErrors = outErrors;
    }

    public int getPromiscuousMode() {
        return PromiscuousMode;
    }

    public void setPromiscuousMode(int promiscuousMode) {
        PromiscuousMode = promiscuousMode;
    }

    @Override
    public String toString() {
        return "GenericInterfaceCounters{" +
                "index=" + index +
                ", type=" + type +
                ", speed=" + speed +
                ", status=" + status +
                ", inoctets=" + inoctets +
                ", inunicastpackets=" + inunicastpackets +
                ", InMulticastPackets=" + InMulticastPackets +
                ", InBroadcastPackets=" + InBroadcastPackets +
                ", InDiscards=" + InDiscards +
                ", InErrors=" + InErrors +
                ", InUnknownProtocols=" + InUnknownProtocols +
                ", OutOctets=" + OutOctets +
                ", OutUnicastPackets=" + OutUnicastPackets +
                ", OutMulticastPackets=" + OutMulticastPackets +
                ", OutBroadcastPackets=" + OutBroadcastPackets +
                ", OutDiscards=" + OutDiscards +
                ", OutErrors=" + OutErrors +
                ", PromiscuousMode=" + PromiscuousMode +
                '}';
    }
}
