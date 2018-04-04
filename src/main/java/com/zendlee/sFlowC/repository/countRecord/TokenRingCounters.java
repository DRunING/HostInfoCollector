package com.zendlee.sFlowC.repository.countRecord;

/**
 * @author zenli
 * TokenRingCounters is a token ring interface counters record
 */
public class TokenRingCounters extends CountRecord{
    private int LineErrors;
    private int BurstErrors;
    private int ACErrors;
    private int AbortTransErrors;
    private int InternalErrors;
    private int LostFrameErrors;
    private int ReceiveCongestions;
    private int FrameCopiedErrors;
    private int TokenErrors;
    private int SoftErrors;
    private int HardErrors;
    private int SignalLoss;
    private int TransmitBeacons;
    private int Recoverys;
    private int LobeWires;
    private int Removes;
    private int Singles;
    private int FreqErrors;

    public TokenRingCounters(int lineErrors, int burstErrors, int ACErrors, int abortTransErrors, int internalErrors, int lostFrameErrors, int receiveCongestions, int frameCopiedErrors, int tokenErrors, int softErrors, int hardErrors, int signalLoss, int transmitBeacons, int recoverys, int lobeWires, int removes, int singles, int freqErrors) {
        LineErrors = lineErrors;
        BurstErrors = burstErrors;
        this.ACErrors = ACErrors;
        AbortTransErrors = abortTransErrors;
        InternalErrors = internalErrors;
        LostFrameErrors = lostFrameErrors;
        ReceiveCongestions = receiveCongestions;
        FrameCopiedErrors = frameCopiedErrors;
        TokenErrors = tokenErrors;
        SoftErrors = softErrors;
        HardErrors = hardErrors;
        SignalLoss = signalLoss;
        TransmitBeacons = transmitBeacons;
        Recoverys = recoverys;
        LobeWires = lobeWires;
        Removes = removes;
        Singles = singles;
        FreqErrors = freqErrors;
    }

    public int getLineErrors() {
        return LineErrors;
    }

    public void setLineErrors(int lineErrors) {
        LineErrors = lineErrors;
    }

    public int getBurstErrors() {
        return BurstErrors;
    }

    public void setBurstErrors(int burstErrors) {
        BurstErrors = burstErrors;
    }

    public int getACErrors() {
        return ACErrors;
    }

    public void setACErrors(int ACErrors) {
        this.ACErrors = ACErrors;
    }

    public int getAbortTransErrors() {
        return AbortTransErrors;
    }

    public void setAbortTransErrors(int abortTransErrors) {
        AbortTransErrors = abortTransErrors;
    }

    public int getInternalErrors() {
        return InternalErrors;
    }

    public void setInternalErrors(int internalErrors) {
        InternalErrors = internalErrors;
    }

    public int getLostFrameErrors() {
        return LostFrameErrors;
    }

    public void setLostFrameErrors(int lostFrameErrors) {
        LostFrameErrors = lostFrameErrors;
    }

    public int getReceiveCongestions() {
        return ReceiveCongestions;
    }

    public void setReceiveCongestions(int receiveCongestions) {
        ReceiveCongestions = receiveCongestions;
    }

    public int getFrameCopiedErrors() {
        return FrameCopiedErrors;
    }

    public void setFrameCopiedErrors(int frameCopiedErrors) {
        FrameCopiedErrors = frameCopiedErrors;
    }

    public int getTokenErrors() {
        return TokenErrors;
    }

    public void setTokenErrors(int tokenErrors) {
        TokenErrors = tokenErrors;
    }

    public int getSoftErrors() {
        return SoftErrors;
    }

    public void setSoftErrors(int softErrors) {
        SoftErrors = softErrors;
    }

    public int getHardErrors() {
        return HardErrors;
    }

    public void setHardErrors(int hardErrors) {
        HardErrors = hardErrors;
    }

    public int getSignalLoss() {
        return SignalLoss;
    }

    public void setSignalLoss(int signalLoss) {
        SignalLoss = signalLoss;
    }

    public int getTransmitBeacons() {
        return TransmitBeacons;
    }

    public void setTransmitBeacons(int transmitBeacons) {
        TransmitBeacons = transmitBeacons;
    }

    public int getRecoverys() {
        return Recoverys;
    }

    public void setRecoverys(int recoverys) {
        Recoverys = recoverys;
    }

    public int getLobeWires() {
        return LobeWires;
    }

    public void setLobeWires(int lobeWires) {
        LobeWires = lobeWires;
    }

    public int getRemoves() {
        return Removes;
    }

    public void setRemoves(int removes) {
        Removes = removes;
    }

    public int getSingles() {
        return Singles;
    }

    public void setSingles(int singles) {
        Singles = singles;
    }

    public int getFreqErrors() {
        return FreqErrors;
    }

    public void setFreqErrors(int freqErrors) {
        FreqErrors = freqErrors;
    }
}
