package com.zendlee.sFlowC.repository.countRecord;

/**
 * @author zenli
 * host CPU counters record
 */
public class HostCPUCounters {
    private float Load1m;
    private float Load5m;
    private float Load15m;
    private int ProcessesRunning;
    private int ProcessesTotal;
    private int NumCPU;
    private int SpeedCPU;
    private int UpTime;

    private int CPUUser;
    private int CPUNice;
    private int CPUSys;
    private int CPUIdle;
    private int CPUWio;
    private int CPUIntr;
    private int CPUSoftIntr;
    private int Interrupts;
    private int ContextSwitches;

    private int CPUSteal;
    private int CPUGuest;
    private int CPUGuestNice;

    public float getLoad1m() {
        return Load1m;
    }

    public void setLoad1m(float load1m) {
        Load1m = load1m;
    }

    public float getLoad5m() {
        return Load5m;
    }

    public void setLoad5m(float load5m) {
        Load5m = load5m;
    }

    public float getLoad15m() {
        return Load15m;
    }

    public void setLoad15m(float load15m) {
        Load15m = load15m;
    }

    public int getProcessesRunning() {
        return ProcessesRunning;
    }

    public void setProcessesRunning(int processesRunning) {
        ProcessesRunning = processesRunning;
    }

    public int getProcessesTotal() {
        return ProcessesTotal;
    }

    public void setProcessesTotal(int processesTotal) {
        ProcessesTotal = processesTotal;
    }

    public int getNumCPU() {
        return NumCPU;
    }

    public void setNumCPU(int numCPU) {
        NumCPU = numCPU;
    }

    public int getSpeedCPU() {
        return SpeedCPU;
    }

    public void setSpeedCPU(int speedCPU) {
        SpeedCPU = speedCPU;
    }

    public int getUpTime() {
        return UpTime;
    }

    public void setUpTime(int upTime) {
        UpTime = upTime;
    }

    public int getCPUUser() {
        return CPUUser;
    }

    public void setCPUUser(int CPUUser) {
        this.CPUUser = CPUUser;
    }

    public int getCPUNice() {
        return CPUNice;
    }

    public void setCPUNice(int CPUNice) {
        this.CPUNice = CPUNice;
    }

    public int getCPUSys() {
        return CPUSys;
    }

    public void setCPUSys(int CPUSys) {
        this.CPUSys = CPUSys;
    }

    public int getCPUIdle() {
        return CPUIdle;
    }

    public void setCPUIdle(int CPUIdle) {
        this.CPUIdle = CPUIdle;
    }

    public int getCPUWio() {
        return CPUWio;
    }

    public void setCPUWio(int CPUWio) {
        this.CPUWio = CPUWio;
    }

    public int getCPUIntr() {
        return CPUIntr;
    }

    public void setCPUIntr(int CPUIntr) {
        this.CPUIntr = CPUIntr;
    }

    public int getCPUSoftIntr() {
        return CPUSoftIntr;
    }

    public void setCPUSoftIntr(int CPUSoftIntr) {
        this.CPUSoftIntr = CPUSoftIntr;
    }

    public int getInterrupts() {
        return Interrupts;
    }

    public void setInterrupts(int interrupts) {
        Interrupts = interrupts;
    }

    public int getContextSwitches() {
        return ContextSwitches;
    }

    public void setContextSwitches(int contextSwitches) {
        ContextSwitches = contextSwitches;
    }

    public int getCPUSteal() {
        return CPUSteal;
    }

    public void setCPUSteal(int CPUSteal) {
        this.CPUSteal = CPUSteal;
    }

    public int getCPUGuest() {
        return CPUGuest;
    }

    public void setCPUGuest(int CPUGuest) {
        this.CPUGuest = CPUGuest;
    }

    public int getCPUGuestNice() {
        return CPUGuestNice;
    }

    public void setCPUGuestNice(int CPUGuestNice) {
        this.CPUGuestNice = CPUGuestNice;
    }

    @Override
    public String toString() {
        return "HostCPUCounters{" +
                "Load1m=" + Load1m +
                ", Load5m=" + Load5m +
                ", Load15m=" + Load15m +
                ", ProcessesRunning=" + ProcessesRunning +
                ", ProcessesTotal=" + ProcessesTotal +
                ", NumCPU=" + NumCPU +
                ", SpeedCPU=" + SpeedCPU +
                ", UpTime=" + UpTime +
                ", CPUUser=" + CPUUser +
                ", CPUNice=" + CPUNice +
                ", CPUSys=" + CPUSys +
                ", CPUIdle=" + CPUIdle +
                ", CPUWio=" + CPUWio +
                ", CPUIntr=" + CPUIntr +
                ", CPUSoftIntr=" + CPUSoftIntr +
                ", Interrupts=" + Interrupts +
                ", ContextSwitches=" + ContextSwitches +
                ", CPUSteal=" + CPUSteal +
                ", CPUGuest=" + CPUGuest +
                ", CPUGuestNice=" + CPUGuestNice +
                '}';
    }
}
