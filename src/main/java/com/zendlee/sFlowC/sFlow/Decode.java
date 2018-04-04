package com.zendlee.sFlowC.sFlow;
import com.zendlee.sFlowC.repository.countRecord.*;
import com.zendlee.sFlowC.repository.flowRecord.ExtendedSwitchFlow;
import com.zendlee.sFlowC.repository.flowRecord.RawPacketFlow;
import com.zendlee.sFlowC.repository.sample.CounterSample;
import com.zendlee.sFlowC.repository.sample.FlowSample;
import io.netty.channel.socket.DatagramPacket;
import com.zendlee.sFlowC.repository.SFlowHead;

public class Decode{

    public DatagramPacket msg;
    public SFlowHead sFlowHead;

    public Decode(DatagramPacket msg){
        this.msg = msg;
    }
    public SFlowHead decode(){
        SFlowHead sFlowHead = new SFlowHead();
        sFlowHead.setVersion(msg.content().readInt());
        sFlowHead.setIpVersion(msg.content().readInt());
        byte[] ip =  new byte[4];
        msg.content().readBytes(ip, 0, 4);
        sFlowHead.setIpAddress(ip);
        sFlowHead.setSubAgentId(msg.content().readInt());
        sFlowHead.setSequenceNumber(msg.content().readInt());
        sFlowHead.setUpTime(msg.content().readInt());

        int numSamples = msg.content().readInt();
        sFlowHead.setNumSamples(numSamples);

        for(int i = 0; i < numSamples; i++){
            int type = msg.content().readInt();
            int numLength = msg.content().readInt();
            switch (type){
                //counter sample
                case 2:
                    //todo
                    CounterSample counterSample = new CounterSample();
                    counterSample.setSequenceNum(msg.content().readInt());
                    counterSample.setSourceIdType(msg.content().readByte());
                    byte[] tmp = new byte[3];
                    //sourceIdINdexVal是3个byte
//                    counterSample.setSourceIdIndexVal(msg.content().readBytes(tmp));
                    msg.content().skipBytes(3);
                    int numRecords = msg.content().readInt();
                    counterSample.setNumRecords(numRecords);
                    for (int j = 0; j < numRecords; j++) {
                        int recordType = msg.content().readInt();
                        int recordLength = msg.content().readInt();
                        switch (recordType){
                            case 1:
                                GenericInterfaceCounters genericInterfaceCounters = new GenericInterfaceCounters(
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readLong(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readLong(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readLong(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt()
                                );
                                counterSample.setRecord(genericInterfaceCounters, j);
                                break;
                            case 2:
                                EthernetCounters ethernetCounters = new EthernetCounters(
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt()
                                );
                                counterSample.setRecord(ethernetCounters, j);
                                break;
                            case 3:
                                TokenRingCounters tokenRingCounters = new TokenRingCounters(
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt()
                                );
                                counterSample.setRecord(tokenRingCounters, j);
                                break;
                            case 4:
                                VgCounters vgCounters = new VgCounters(
                                        msg.content().readInt(),
                                        msg.content().readLong(),
                                        msg.content().readInt(),
                                        msg.content().readLong(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readLong(),
                                        msg.content().readInt(),
                                        msg.content().readLong(),
                                        msg.content().readLong(),
                                        msg.content().readLong()
                                );
                                counterSample.setRecord(vgCounters, j);
                                break;
                            case 5:
                                VlanCounters vlanCounters = new VlanCounters(
                                        msg.content().readInt(),
                                        msg.content().readLong(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt()
                                );
                                counterSample.setRecord(vlanCounters, j);
                                break;
                            case 1001:
                                ProcessorCounters processorCounters = new ProcessorCounters(
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readLong(),
                                        msg.content().readLong()
                                );
                                counterSample.setRecord(processorCounters, j);
                                break;
                            case 2003:
                                HostCPUCounters hostCPUCounters = new HostCPUCounters(
                                        msg.content().readFloat(),
                                        msg.content().readFloat(),
                                        msg.content().readFloat(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt()
                                );
                                counterSample.setRecord(hostCPUCounters, j);
                                break;
                            case 2004:
                                HostMemoryCounters hostMemoryCounters = new HostMemoryCounters(
                                        msg.content().readLong(),
                                        msg.content().readLong(),
                                        msg.content().readLong(),
                                        msg.content().readLong(),
                                        msg.content().readLong(),
                                        msg.content().readLong(),
                                        msg.content().readLong(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt()

                                );
                                counterSample.setRecord(hostMemoryCounters, j);
                                break;
                            case 2005:
                                HostDiskCounters hostDiskCounters = new HostDiskCounters(
                                        msg.content().readLong(),
                                        msg.content().readLong(),
                                        msg.content().readFloat(),
                                        msg.content().readInt(),
                                        msg.content().readLong(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readLong(),
                                        msg.content().readInt()
                                );
                                counterSample.setRecord(hostDiskCounters, j);
                                break;
                            case 2006:
                                HostNetCounters hostNetCounters = new HostNetCounters(
                                        msg.content().readLong(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readLong(),
                                        msg.content().readInt(),
                                        msg.content().readInt(),
                                        msg.content().readInt()
                                );
                                counterSample.setRecord(hostNetCounters, j);
                                break;
                        }
                    }
                    sFlowHead.setSamples(counterSample, i);
                    break;
                case 1:
                    //todo
                    com.zendlee.sFlowC.repository.sample.FlowSample flowSample = new FlowSample();
                    flowSample.setSequenceNum(msg.content().readInt());
                    flowSample.setSourceIdType(msg.content().readByte());
                    msg.content().skipBytes(3);
                    flowSample.setSamplingRate(msg.content().readInt());
                    flowSample.setSamplePool(msg.content().readInt());
                    flowSample.setDrops(msg.content().readInt());
                    flowSample.setInput(msg.content().readInt());
                    flowSample.setOutput(msg.content().readInt());
                    int num = msg.content().readInt();
                    flowSample.setNumRecords(num);
                    for(int j = 0;j  < num; j++){
                        int recordType = msg.content().readInt();
                        int recordLength = msg.content().readInt();
                        switch (recordType){
                            case 1:
                                msg.content().skipBytes(recordLength);
                                com.zendlee.sFlowC.repository.flowRecord.RawPacketFlow rawPacketFlow = new RawPacketFlow();
                                flowSample.setRecords(rawPacketFlow, j);
                                break;
                            case 1001:
                                msg.content().skipBytes(recordLength);
                                com.zendlee.sFlowC.repository.flowRecord.ExtendedSwitchFlow extendedSwitchFlow = new ExtendedSwitchFlow();
                                flowSample.setRecords(extendedSwitchFlow, j);
                                break;
                        }
                    }
                    sFlowHead.setSamples(flowSample,i);
                    break;
            }
        }

        System.out.println(sFlowHead);
        return sFlowHead;
    }
}
