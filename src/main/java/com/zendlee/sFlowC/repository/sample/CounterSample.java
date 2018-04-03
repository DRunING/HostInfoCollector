package com.zendlee.sFlowC.repository.sample;

import com.zendlee.sFlowC.repository.countRecord.CountRecord;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import java.util.Arrays;

/**
 * @author zenli
 */
public class CounterSample extends Sample{

    @Id
    @GeneratedValue
    private String id;

    private int sequenceNum;
    private byte sourceIdType;
    private int sourceIdIndexVal; //这个字段在协议中占3个byte
    private int numRecords;
    private CountRecord[] records;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getNumRecords() {
        return numRecords;
    }

    public void setNumRecords(int numRecords) {
        this.numRecords = numRecords;
    }



    @Override
    public String toString() {
        return "CounterSample{" +
                "id='" + id + '\'' +
                ", sequenceNum=" + sequenceNum +
                ", sourceIdType=" + sourceIdType +
                ", sourceIdIndexVal=" + sourceIdIndexVal +
                ", numRecords=" + numRecords +
                ", records=" + Arrays.toString(records) +
                '}';
    }
}
