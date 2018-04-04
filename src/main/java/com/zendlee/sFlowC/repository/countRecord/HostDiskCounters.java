package com.zendlee.sFlowC.repository.countRecord;

/**
 * @author zenli
 */
public class HostDiskCounters {
    private long Total;
    private long Free;
    private float MaxUsedPercent;
    private int Reads;
    private long BytesRead;
    private int ReadTime;
    private int Writes;
    private long BytesWritten;
    private int WriteTime;

    public long getTotal() {
        return Total;
    }

    public void setTotal(long total) {
        Total = total;
    }

    public long getFree() {
        return Free;
    }

    public void setFree(long free) {
        Free = free;
    }

    public float getMaxUsedPercent() {
        return MaxUsedPercent;
    }

    public void setMaxUsedPercent(float maxUsedPercent) {
        MaxUsedPercent = maxUsedPercent;
    }

    public int getReads() {
        return Reads;
    }

    public void setReads(int reads) {
        Reads = reads;
    }

    public long getBytesRead() {
        return BytesRead;
    }

    public void setBytesRead(long bytesRead) {
        BytesRead = bytesRead;
    }

    public int getReadTime() {
        return ReadTime;
    }

    public void setReadTime(int readTime) {
        ReadTime = readTime;
    }

    public int getWrites() {
        return Writes;
    }

    public void setWrites(int writes) {
        Writes = writes;
    }

    public long getBytesWritten() {
        return BytesWritten;
    }

    public void setBytesWritten(long bytesWritten) {
        BytesWritten = bytesWritten;
    }

    public int getWriteTime() {
        return WriteTime;
    }

    public void setWriteTime(int writeTime) {
        WriteTime = writeTime;
    }

    @Override
    public String toString() {
        return "HostDiskCounters{" +
                "Total=" + Total +
                ", Free=" + Free +
                ", MaxUsedPercent=" + MaxUsedPercent +
                ", Reads=" + Reads +
                ", BytesRead=" + BytesRead +
                ", ReadTime=" + ReadTime +
                ", Writes=" + Writes +
                ", BytesWritten=" + BytesWritten +
                ", WriteTime=" + WriteTime +
                '}';
    }
}
