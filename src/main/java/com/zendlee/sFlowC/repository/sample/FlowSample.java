package com.zendlee.sFlowC.repository.sample;

import com.zendlee.sFlowC.repository.flowRecord.FlowRecord;
import org.springframework.data.annotation.Id;

import java.util.Arrays;

/**
 * @author zenli
 */
public class FlowSample extends Sample{

    private int  sequenceNum;
    private byte  sourceIdType;
    private int sourceIdIndexVal;// NOTE: this is 3 bytes in the datagram
    private int samplingRate;
    private int samplePool;
    private int drops;
    private int input;
    private int output;
    private int numRecords;
    private FlowRecord[] records;

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
        this.records = new FlowRecord[numRecords];
    }
    public void setRecords(FlowRecord record, int j){
        records[j] = record;
    }

    @Override
    public String toString() {
        return "FlowSample{" +
                "sequenceNum=" + sequenceNum +
                ", sourceIdType=" + sourceIdType +
                ", sourceIdIndexVal=" + sourceIdIndexVal +
                ", samplingRate=" + samplingRate +
                ", samplePool=" + samplePool +
                ", drops=" + drops +
                ", input=" + input +
                ", output=" + output +
                ", numRecords=" + numRecords +
                ", records=" + Arrays.toString(records) +
                '}';
    }
}
