package com.zendlee.sFlowC.repository.countRecord;

/**
 * @author zenli
 * host network counters record
 */
public class HostNetCounters {
   private long BytesIn;
   private int PacketsIn;
   private int ErrorsIn;
   private int  DropsIn;

   private long  BytesOut;
   private int PacketsOut;
   private int ErrorsOut;
   private int DropsOut;

    public long getBytesIn() {
        return BytesIn;
    }

    public void setBytesIn(long bytesIn) {
        BytesIn = bytesIn;
    }

    public int getPacketsIn() {
        return PacketsIn;
    }

    public void setPacketsIn(int packetsIn) {
        PacketsIn = packetsIn;
    }

    public int getErrorsIn() {
        return ErrorsIn;
    }

    public void setErrorsIn(int errorsIn) {
        ErrorsIn = errorsIn;
    }

    public int getDropsIn() {
        return DropsIn;
    }

    public void setDropsIn(int dropsIn) {
        DropsIn = dropsIn;
    }

    public long getBytesOut() {
        return BytesOut;
    }

    public void setBytesOut(long bytesOut) {
        BytesOut = bytesOut;
    }

    public int getPacketsOut() {
        return PacketsOut;
    }

    public void setPacketsOut(int packetsOut) {
        PacketsOut = packetsOut;
    }

    public int getErrorsOut() {
        return ErrorsOut;
    }

    public void setErrorsOut(int errorsOut) {
        ErrorsOut = errorsOut;
    }

    public int getDropsOut() {
        return DropsOut;
    }

    public void setDropsOut(int dropsOut) {
        DropsOut = dropsOut;
    }

    @Override
    public String toString() {
        return "HostNetCounters{" +
                "BytesIn=" + BytesIn +
                ", PacketsIn=" + PacketsIn +
                ", ErrorsIn=" + ErrorsIn +
                ", DropsIn=" + DropsIn +
                ", BytesOut=" + BytesOut +
                ", PacketsOut=" + PacketsOut +
                ", ErrorsOut=" + ErrorsOut +
                ", DropsOut=" + DropsOut +
                '}';
    }
}
