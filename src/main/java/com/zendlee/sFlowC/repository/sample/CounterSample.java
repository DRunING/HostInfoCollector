package com.zendlee.sFlowC.repository.sample;

import com.zendlee.sFlowC.repository.record.Record;
import org.springframework.data.annotation.Id;

/**
 * @author zenli
 */
public class CounterSample extends Sample{

    @Id
    private String id;

    private int sequenceNum;
    private byte sourceIdType;
    private int sourceIdIndexVal;
    private int numRecords;
    private Record[] records;

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

    public Record[] getRecords() {
        return records;
    }

    public void setRecords(Record[] records) {
        this.records = records;
    }
}
