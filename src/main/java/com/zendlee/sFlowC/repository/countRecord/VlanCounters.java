package com.zendlee.sFlowC.repository.countRecord;

/**
 * @author zenli
 *  VLAN counters record
 */
public class VlanCounters extends CountRecord{
    private int ID;
    private long Octets;
    private int UnicastPackets;
    private int MulticastPackets;
    private int BroadcastPackets;
    private int Discards;

    public VlanCounters(int ID, long octets, int unicastPackets, int multicastPackets, int broadcastPackets, int discards) {
        this.ID = ID;
        Octets = octets;
        UnicastPackets = unicastPackets;
        MulticastPackets = multicastPackets;
        BroadcastPackets = broadcastPackets;
        Discards = discards;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public long getOctets() {
        return Octets;
    }

    public void setOctets(long octets) {
        Octets = octets;
    }

    public int getUnicastPackets() {
        return UnicastPackets;
    }

    public void setUnicastPackets(int unicastPackets) {
        UnicastPackets = unicastPackets;
    }

    public int getMulticastPackets() {
        return MulticastPackets;
    }

    public void setMulticastPackets(int multicastPackets) {
        MulticastPackets = multicastPackets;
    }

    public int getBroadcastPackets() {
        return BroadcastPackets;
    }

    public void setBroadcastPackets(int broadcastPackets) {
        BroadcastPackets = broadcastPackets;
    }

    public int getDiscards() {
        return Discards;
    }

    public void setDiscards(int discards) {
        Discards = discards;
    }

    @Override
    public String toString() {
        return "VlanCounters{" +
                "ID=" + ID +
                ", Octets=" + Octets +
                ", UnicastPackets=" + UnicastPackets +
                ", MulticastPackets=" + MulticastPackets +
                ", BroadcastPackets=" + BroadcastPackets +
                ", Discards=" + Discards +
                '}';
    }
}
