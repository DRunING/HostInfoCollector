package com.zendlee.sFlowC.repository.countRecord;

/**
 * @author zenli
 * switch processor counters record
 */
public class ProcessorCounters extends CountRecord{
   private int CPU5s;
   private int CPU1m;
   private int CPU5m;
   private long TotalMemory;
   private long FreeMemory;

    public ProcessorCounters(int CPU5s, int CPU1m, int CPU5m, long totalMemory, long freeMemory) {
        this.CPU5s = CPU5s;
        this.CPU1m = CPU1m;
        this.CPU5m = CPU5m;
        TotalMemory = totalMemory;
        FreeMemory = freeMemory;
    }

    public int getCPU5s() {
        return CPU5s;
    }

    public void setCPU5s(int CPU5s) {
        this.CPU5s = CPU5s;
    }

    public int getCPU1m() {
        return CPU1m;
    }

    public void setCPU1m(int CPU1m) {
        this.CPU1m = CPU1m;
    }

    public int getCPU5m() {
        return CPU5m;
    }

    public void setCPU5m(int CPU5m) {
        this.CPU5m = CPU5m;
    }

    public long getTotalMemory() {
        return TotalMemory;
    }

    public void setTotalMemory(long totalMemory) {
        TotalMemory = totalMemory;
    }

    public long getFreeMemory() {
        return FreeMemory;
    }

    public void setFreeMemory(long freeMemory) {
        FreeMemory = freeMemory;
    }

    @Override
    public String toString() {
        return "ProcessorCounters{" +
                "CPU5s=" + CPU5s +
                ", CPU1m=" + CPU1m +
                ", CPU5m=" + CPU5m +
                ", TotalMemory=" + TotalMemory +
                ", FreeMemory=" + FreeMemory +
                '}';
    }
}
