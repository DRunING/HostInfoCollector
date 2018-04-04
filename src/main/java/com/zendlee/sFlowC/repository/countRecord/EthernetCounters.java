package com.zendlee.sFlowC.repository.countRecord;

/**
 * @author zenli
 * EthernetCounters is an Ethernet interface counters record.
 */
public class EthernetCounters {
    private int AlignmentErrors;
    private int FCSErrors;
    private int SingleCollisionFrames;
    private int MultipleCollisionFrames;
    private int SQETestErrors;
    private int DeferredTransmissions;
    private int LateCollisions;
    private int ExcessiveCollisions;
    private int InternalMACTransmitErrors;
    private int CarrierSenseErrors;
    private int FrameTooLongs;
    private int InternalMACReceiveErrors;
    private int SymbolErrors;

    public int getAlignmentErrors() {
        return AlignmentErrors;
    }

    public void setAlignmentErrors(int alignmentErrors) {
        AlignmentErrors = alignmentErrors;
    }

    public int getFCSErrors() {
        return FCSErrors;
    }

    public void setFCSErrors(int FCSErrors) {
        this.FCSErrors = FCSErrors;
    }

    public int getSingleCollisionFrames() {
        return SingleCollisionFrames;
    }

    public void setSingleCollisionFrames(int singleCollisionFrames) {
        SingleCollisionFrames = singleCollisionFrames;
    }

    public int getMultipleCollisionFrames() {
        return MultipleCollisionFrames;
    }

    public void setMultipleCollisionFrames(int multipleCollisionFrames) {
        MultipleCollisionFrames = multipleCollisionFrames;
    }

    public int getSQETestErrors() {
        return SQETestErrors;
    }

    public void setSQETestErrors(int SQETestErrors) {
        this.SQETestErrors = SQETestErrors;
    }

    public int getDeferredTransmissions() {
        return DeferredTransmissions;
    }

    public void setDeferredTransmissions(int deferredTransmissions) {
        DeferredTransmissions = deferredTransmissions;
    }

    public int getLateCollisions() {
        return LateCollisions;
    }

    public void setLateCollisions(int lateCollisions) {
        LateCollisions = lateCollisions;
    }

    public int getExcessiveCollisions() {
        return ExcessiveCollisions;
    }

    public void setExcessiveCollisions(int excessiveCollisions) {
        ExcessiveCollisions = excessiveCollisions;
    }

    public int getInternalMACTransmitErrors() {
        return InternalMACTransmitErrors;
    }

    public void setInternalMACTransmitErrors(int internalMACTransmitErrors) {
        InternalMACTransmitErrors = internalMACTransmitErrors;
    }

    public int getCarrierSenseErrors() {
        return CarrierSenseErrors;
    }

    public void setCarrierSenseErrors(int carrierSenseErrors) {
        CarrierSenseErrors = carrierSenseErrors;
    }

    public int getFrameTooLongs() {
        return FrameTooLongs;
    }

    public void setFrameTooLongs(int frameTooLongs) {
        FrameTooLongs = frameTooLongs;
    }

    public int getInternalMACReceiveErrors() {
        return InternalMACReceiveErrors;
    }

    public void setInternalMACReceiveErrors(int internalMACReceiveErrors) {
        InternalMACReceiveErrors = internalMACReceiveErrors;
    }

    public int getSymbolErrors() {
        return SymbolErrors;
    }

    public void setSymbolErrors(int symbolErrors) {
        SymbolErrors = symbolErrors;
    }

    @Override
    public String toString() {
        return "EthernetCounters{" +
                "AlignmentErrors=" + AlignmentErrors +
                ", FCSErrors=" + FCSErrors +
                ", SingleCollisionFrames=" + SingleCollisionFrames +
                ", MultipleCollisionFrames=" + MultipleCollisionFrames +
                ", SQETestErrors=" + SQETestErrors +
                ", DeferredTransmissions=" + DeferredTransmissions +
                ", LateCollisions=" + LateCollisions +
                ", ExcessiveCollisions=" + ExcessiveCollisions +
                ", InternalMACTransmitErrors=" + InternalMACTransmitErrors +
                ", CarrierSenseErrors=" + CarrierSenseErrors +
                ", FrameTooLongs=" + FrameTooLongs +
                ", InternalMACReceiveErrors=" + InternalMACReceiveErrors +
                ", SymbolErrors=" + SymbolErrors +
                '}';
    }
}
