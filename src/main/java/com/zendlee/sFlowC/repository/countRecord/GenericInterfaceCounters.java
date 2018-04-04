package com.zendlee.sFlowC.repository.countRecord;

/**
 * @author zenli
 * GenericInterfaceCounters is a generic switch counters record
 */
public class GenericInterfaceCounters extends CountRecord{
    private int Index;
    private int Type;
    private long Speed;
    private int Direcion;
    private int Status;
    private long Inoctets;
    private int InunicastPackets;
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

    public GenericInterfaceCounters(){

    }

    public GenericInterfaceCounters(int index, int type, long speed, int direcion, int status, long inoctets, int inunicastpackets, int inMulticastPackets, int inBroadcastPackets, int inDiscards, int inErrors, int inUnknownProtocols, long outOctets, int outUnicastPackets, int outMulticastPackets, int outBroadcastPackets, int outDiscards, int outErrors, int promiscuousMode) {
        Index = index;
        Type = type;
        Speed = speed;
        Direcion = direcion;
        Status = status;
        Inoctets = inoctets;
        InunicastPackets = inunicastpackets;
        InMulticastPackets = inMulticastPackets;
        InBroadcastPackets = inBroadcastPackets;
        InDiscards = inDiscards;
        InErrors = inErrors;
        InUnknownProtocols = inUnknownProtocols;
        OutOctets = outOctets;
        OutUnicastPackets = outUnicastPackets;
        OutMulticastPackets = outMulticastPackets;
        OutBroadcastPackets = outBroadcastPackets;
        OutDiscards = outDiscards;
        OutErrors = outErrors;
        PromiscuousMode = promiscuousMode;
    }

    public int getIndex() {
        return Index;
    }

    public void setIndex(int index) {
        Index = index;
    }

    public int getType() {
        return Type;
    }

    public void setType(int type) {
        Type = type;
    }

    public long getSpeed() {
        return Speed;
    }

    public void setSpeed(long speed) {
        Speed = speed;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public long getInoctets() {
        return Inoctets;
    }

    public void setInoctets(long inoctets) {
        Inoctets = inoctets;
    }

    public int getInunicastpackets() {
        return InunicastPackets;
    }

    public void setInunicastpackets(int inunicastpackets) {
        InunicastPackets = inunicastpackets;
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
                "Index=" + Index +
                ", Type=" + Type +
                ", Speed=" + Speed +
                ", Direcion=" + Direcion +
                ", Status=" + Status +
                ", Inoctets=" + Inoctets +
                ", InunicastPackets=" + InunicastPackets +
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
