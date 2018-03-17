package com.zendlee.sFlowC.sFlow;

public class FlowSample {
    private int  sequenceNum;
    private byte  sourceIdType;
    private int sourceIdIndexVal;  // NOTE: this is 3 bytes in the datagram
    private int samplingRate;
    private int samplePool;
    private int drops;
    private int input;
    private int output;
    private int numRecords;
    private Record[] records;

    public FlowSample(int sequenceNum,
                           byte sourceIdType,
                           int sourceIdIndexVal,
                           int samplingRate,
                           int samplePool,
                           int drops,
                           int input,
                           int output,
                           int numRecords,
                           Record[] records) {
        this.sequenceNum = sequenceNum;
        this.sourceIdType = sourceIdType;
        this.sourceIdIndexVal = sourceIdIndexVal;
        this.samplingRate = samplingRate;
        this.samplePool = samplePool;
        this.drops = drops;
        this.input = input;
        this.output = output;
        this.numRecords = numRecords;
        this.records = records;
    }

    public int getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(int sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

    public byte getSourceIdType() {
        return sourceIdType;
    }

    public void setSourceIdType(byte sourceIdType) {
        this.sourceIdType = sourceIdType;
    }

    public int getSourceIdIndexVal() {
        return sourceIdIndexVal;
    }

    public void setSourceIdIndexVal(int sourceIdIndexVal) {
        this.sourceIdIndexVal = sourceIdIndexVal;
    }

    public int getSamplingRate() {
        return samplingRate;
    }

    public void setSamplingRate(int samplingRate) {
        this.samplingRate = samplingRate;
    }

    public int getSamplePool() {
        return samplePool;
    }

    public void setSamplePool(int samplePool) {
        this.samplePool = samplePool;
    }

    public int getDrops() {
        return drops;
    }

    public void setDrops(int drops) {
        this.drops = drops;
    }

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }

    public int getOutput() {
        return output;
    }

    public void setOutput(int output) {
        this.output = output;
    }

    public int getNumRecords() {
        return numRecords;
    }

    public void setNumRecords(int numRecords) {
        this.numRecords = numRecords;
    }

    public Record[] getRecords() {
        return records;
    }

    public void setRecords(Record[] records) {
        this.records = records;
    }
}
