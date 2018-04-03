package com.zendlee.sFlowC.repository.countRecord;

/**
 * @author zenli
 */
public class VgCounters {
    private int InHighPriorityFrames;
    private long InHighPriorityOctets;
    private int InNormPriorityFrames;
    private long InNormPriorityOctets;
    private int InIPMErrors;
    private int InOversizeFrameErrors;
    private int InDataErrors;
    private int InNullAddressedFrames;
    private int OutHighPriorityFrames;
    private long OutHighPriorityOctets;
    private int TransitionIntoTrainings;
    private long HCInHighPriorityOctets;
    private long HCInNormPriorityOctets;
    private long HCOutHighPriorityOctets;

    public int getInHighPriorityFrames() {
        return InHighPriorityFrames;
    }

    public void setInHighPriorityFrames(int inHighPriorityFrames) {
        InHighPriorityFrames = inHighPriorityFrames;
    }

    public long getInHighPriorityOctets() {
        return InHighPriorityOctets;
    }

    public void setInHighPriorityOctets(long inHighPriorityOctets) {
        InHighPriorityOctets = inHighPriorityOctets;
    }

    public int getInNormPriorityFrames() {
        return InNormPriorityFrames;
    }

    public void setInNormPriorityFrames(int inNormPriorityFrames) {
        InNormPriorityFrames = inNormPriorityFrames;
    }

    public long getInNormPriorityOctets() {
        return InNormPriorityOctets;
    }

    public void setInNormPriorityOctets(long inNormPriorityOctets) {
        InNormPriorityOctets = inNormPriorityOctets;
    }

    public int getInIPMErrors() {
        return InIPMErrors;
    }

    public void setInIPMErrors(int inIPMErrors) {
        InIPMErrors = inIPMErrors;
    }

    public int getInOversizeFrameErrors() {
        return InOversizeFrameErrors;
    }

    public void setInOversizeFrameErrors(int inOversizeFrameErrors) {
        InOversizeFrameErrors = inOversizeFrameErrors;
    }

    public int getInDataErrors() {
        return InDataErrors;
    }

    public void setInDataErrors(int inDataErrors) {
        InDataErrors = inDataErrors;
    }

    public int getInNullAddressedFrames() {
        return InNullAddressedFrames;
    }

    public void setInNullAddressedFrames(int inNullAddressedFrames) {
        InNullAddressedFrames = inNullAddressedFrames;
    }

    public int getOutHighPriorityFrames() {
        return OutHighPriorityFrames;
    }

    public void setOutHighPriorityFrames(int outHighPriorityFrames) {
        OutHighPriorityFrames = outHighPriorityFrames;
    }

    public long getOutHighPriorityOctets() {
        return OutHighPriorityOctets;
    }

    public void setOutHighPriorityOctets(long outHighPriorityOctets) {
        OutHighPriorityOctets = outHighPriorityOctets;
    }

    public int getTransitionIntoTrainings() {
        return TransitionIntoTrainings;
    }

    public void setTransitionIntoTrainings(int transitionIntoTrainings) {
        TransitionIntoTrainings = transitionIntoTrainings;
    }

    public long getHCInHighPriorityOctets() {
        return HCInHighPriorityOctets;
    }

    public void setHCInHighPriorityOctets(long HCInHighPriorityOctets) {
        this.HCInHighPriorityOctets = HCInHighPriorityOctets;
    }

    public long getHCInNormPriorityOctets() {
        return HCInNormPriorityOctets;
    }

    public void setHCInNormPriorityOctets(long HCInNormPriorityOctets) {
        this.HCInNormPriorityOctets = HCInNormPriorityOctets;
    }

    public long getHCOutHighPriorityOctets() {
        return HCOutHighPriorityOctets;
    }

    public void setHCOutHighPriorityOctets(long HCOutHighPriorityOctets) {
        this.HCOutHighPriorityOctets = HCOutHighPriorityOctets;
    }

    @Override
    public String toString() {
        return "VgCounters{" +
                "InHighPriorityFrames=" + InHighPriorityFrames +
                ", InHighPriorityOctets=" + InHighPriorityOctets +
                ", InNormPriorityFrames=" + InNormPriorityFrames +
                ", InNormPriorityOctets=" + InNormPriorityOctets +
                ", InIPMErrors=" + InIPMErrors +
                ", InOversizeFrameErrors=" + InOversizeFrameErrors +
                ", InDataErrors=" + InDataErrors +
                ", InNullAddressedFrames=" + InNullAddressedFrames +
                ", OutHighPriorityFrames=" + OutHighPriorityFrames +
                ", OutHighPriorityOctets=" + OutHighPriorityOctets +
                ", TransitionIntoTrainings=" + TransitionIntoTrainings +
                ", HCInHighPriorityOctets=" + HCInHighPriorityOctets +
                ", HCInNormPriorityOctets=" + HCInNormPriorityOctets +
                ", HCOutHighPriorityOctets=" + HCOutHighPriorityOctets +
                '}';
    }
}
