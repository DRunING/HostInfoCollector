package com.zendlee.sFlowC.repository.flowRecord;

public class ExtendedSwitchFlow extends FlowRecord{
    private int sourceVlan;
    private int sourcePrority;
    private int destinationVlan;
    private int destinationPrority;

    public int getSourceVlan() {
        return sourceVlan;
    }

    public void setSourceVlan(int sourceVlan) {
        this.sourceVlan = sourceVlan;
    }

    public int getSourcePrority() {
        return sourcePrority;
    }

    public void setSourcePrority(int sourcePrority) {
        this.sourcePrority = sourcePrority;
    }

    public int getDestinationVlan() {
        return destinationVlan;
    }

    public void setDestinationVlan(int destinationVlan) {
        this.destinationVlan = destinationVlan;
    }

    public int getDestinationPrority() {
        return destinationPrority;
    }

    public void setDestinationPrority(int destinationPrority) {
        this.destinationPrority = destinationPrority;
    }

    @Override
    public String toString() {
        return "ExtendedSwitchFlow{" +
                "sourceVlan=" + sourceVlan +
                ", sourcePrority=" + sourcePrority +
                ", destinationVlan=" + destinationVlan +
                ", destinationPrority=" + destinationPrority +
                '}';
    }
}
