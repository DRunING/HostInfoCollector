package com.zendlee.sFlowC.repository.countRecord;

/**
 * @author zenli
 * host memory counters record
 */
public class HostMemoryCounters extends CountRecord{
   private long  Total;
   private long  Free;
   private long Shared;
   private long Buffers;
   private long  Cached;
   private long  SwapTotal;
   private long  SwapFree;

   private int PageIn;
   private int PageOut;
   private int SwapIn;
   private int SwapOut;

    public HostMemoryCounters(long total, long free, long shared, long buffers, long cached, long swapTotal, long swapFree, int pageIn, int pageOut, int swapIn, int swapOut) {
        Total = total;
        Free = free;
        Shared = shared;
        Buffers = buffers;
        Cached = cached;
        SwapTotal = swapTotal;
        SwapFree = swapFree;
        PageIn = pageIn;
        PageOut = pageOut;
        SwapIn = swapIn;
        SwapOut = swapOut;
    }


    public void setTotal(long total) {
        Total = total;
    }

    public void setFree(long free) {
        Free = free;
    }

    public void setShared(long shared) {
        Shared = shared;
    }

    public void setBuffers(long buffers) {
        Buffers = buffers;
    }

    public void setCached(long cached) {
        Cached = cached;
    }

    public void setSwapTotal(long swapTotal) {
        SwapTotal = swapTotal;
    }

    public void setSwapFree(long swapFree) {
        SwapFree = swapFree;
    }

    public void setSwapTotal(int swapTotal) {
        SwapTotal = swapTotal;
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
