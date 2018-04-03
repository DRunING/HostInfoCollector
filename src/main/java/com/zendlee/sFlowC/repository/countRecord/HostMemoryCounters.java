package com.zendlee.sFlowC.repository.countRecord;

/**
 * @author zenli
 * host memory counters record
 */
public class HostMemoryCounters {
   private int  Total;
   private int  Free;
   private int Shared;
   private int  Buffers;
   private int  Cached;
   private int  SwapTotal;
   private int  SwapFree;

   private int PageIn;
   private int PageOut;
   private int SwapIn;
   private int SwapOut;

    public int getTotal() {
        return Total;
    }

    public void setTotal(int total) {
        Total = total;
    }

    public int getFree() {
        return Free;
    }

    public void setFree(int free) {
        Free = free;
    }

    public int getShared() {
        return Shared;
    }

    public void setShared(int shared) {
        Shared = shared;
    }

    public int getBuffers() {
        return Buffers;
    }

    public void setBuffers(int buffers) {
        Buffers = buffers;
    }

    public int getCached() {
        return Cached;
    }

    public void setCached(int cached) {
        Cached = cached;
    }

    public int getSwapTotal() {
        return SwapTotal;
    }

    public void setSwapTotal(int swapTotal) {
        SwapTotal = swapTotal;
    }

    public int getSwapFree() {
        return SwapFree;
    }

    public void setSwapFree(int swapFree) {
        SwapFree = swapFree;
    }

    public int getPageIn() {
        return PageIn;
    }

    public void setPageIn(int pageIn) {
        PageIn = pageIn;
    }

    public int getPageOut() {
        return PageOut;
    }

    public void setPageOut(int pageOut) {
        PageOut = pageOut;
    }

    public int getSwapIn() {
        return SwapIn;
    }

    public void setSwapIn(int swapIn) {
        SwapIn = swapIn;
    }

    public int getSwapOut() {
        return SwapOut;
    }

    public void setSwapOut(int swapOut) {
        SwapOut = swapOut;
    }

    @Override
    public String toString() {
        return "HostMemoryCounters{" +
                "Total=" + Total +
                ", Free=" + Free +
                ", Shared=" + Shared +
                ", Buffers=" + Buffers +
                ", Cached=" + Cached +
                ", SwapTotal=" + SwapTotal +
                ", SwapFree=" + SwapFree +
                ", PageIn=" + PageIn +
                ", PageOut=" + PageOut +
                ", SwapIn=" + SwapIn +
                ", SwapOut=" + SwapOut +
                '}';
    }
}
