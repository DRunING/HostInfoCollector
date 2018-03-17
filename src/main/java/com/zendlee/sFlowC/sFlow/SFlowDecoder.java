package com.zendlee.sFlowC.sFlow;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;

/**
 * @author zenli
 */
public class SFlowDecoder extends LengthFieldBasedFrameDecoder{

    //todo  set head_size
//    private static final int HEAD_SIZE = 0;
    private int version;
    private int ipVersion;
    private int ipAddress;
    private int subAgentId;
    private int sequenceNumber;
    private int upTime;
    private int numSamples;

    public SFlowDecoder(int maxFrameLength, int lengthFieldOffset,
                        int lengthFieldLength, int lengthAdjustment, int initialBytesToStrip ){
        super(maxFrameLength, lengthFieldOffset, lengthFieldLength,
                lengthAdjustment, initialBytesToStrip);
    }
    public SFlowDecoder(int maxFrameLength, int lengthFieldOffset,
                        int lengthFieldLength, int lengthAdjustment,
                        int initialBytesToStrip, boolean failFast) {
        super(maxFrameLength, lengthFieldOffset, lengthFieldLength,
                lengthAdjustment, initialBytesToStrip, failFast);
    }
    @Override
    public SFlowMsg decode(ChannelHandlerContext ctx, ByteBuf in2) throws Exception{
        ByteBuf in = (ByteBuf)super.decode(ctx, in2);
        if(in == null) return null;

        //todo test the head_size
        version = in.readInt();
        ipVersion = in.readInt();
        ipAddress = in.readInt();
        subAgentId = in.readInt();
        sequenceNumber = in.readInt();
        upTime = in.readInt();
        numSamples = in.readInt();

        SFlowHeader sFlowHeader = new SFlowHeader(version, ipVersion, ipAddress,subAgentId, sequenceNumber, upTime, numSamples);
        SFlowMsg sFlowMsg = new SFlowMsg(sFlowHeader, null);
        return sFlowMsg;
    }
}