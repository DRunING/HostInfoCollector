package com.zendlee.sFlowC.handler;


import com.zendlee.sFlowC.dao.mongo.SFlowDao;
import com.zendlee.sFlowC.repository.SFlowHead;
import com.zendlee.sFlowC.repository.sample.CounterSample;
import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.DatagramPacket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author zenli
 */
@Component
public class SFlowServerHandler extends SimpleChannelInboundHandler<DatagramPacket> {

    private static final Logger log = LoggerFactory.getLogger(SFlowServerHandler.class);
    @Autowired
    private SFlowDao sFlowDao;
    //计算收到的sFlow包的数目
    private static int count = 0;

//    @Override
//    protected void channelRead0(ChannelHandlerContext ctx, DatagramPacket msg) throws Exception{
////        ByteBuf d = msg.content();
//        //udp 不需要获取channel
//        String content = msg.content().toString();
//        log.info("Received UDP Msg:" + content);
////        Channel channel = ctx.channel();
////        System.out.println(channel.);
////        System.out.println("ovs : " + msg.sender().getHostName());
////        System.out.println(msg.content());
////        SFlowMsg sFlowMsg = new SFlowMsg();
//        SFlowHead sFlowHead = new SFlowHead();
//        sFlowHead.setVersion(msg.content().readInt());
//        sFlowHead.setIpVersion(msg.content().readInt());
//        sFlowHead.setIpAddress(msg.content().readInt());
//        sFlowHead.setSubAgentId(msg.content().readInt());
//        sFlowHead.setSequenceNumber(msg.content().readInt());
//        sFlowHead.setUpTime(msg.content().readInt());
//        sFlowHead.setNumSamples(msg.content().readInt());
//        System.out.println(sFlowHead.toString());
//        sFlowDao.saveSflowHead(sFlowHead);
//        //parse the body
////        msg.content().slice();
////        System.out.println(msg.content().read(125, CharsetUtil.US_ASCII));
////        System.out.println(msg.content().readChar());
////        System.out.println(msg.content().readCharSequence(msg.content().));
////        SFlowMsg sFlowMsg = new SFlowMsg(sFlowHead1, null);
//
//    }


    @Override
    protected void channelRead0(ChannelHandlerContext ctx, DatagramPacket msg) throws Exception{
//        ByteBuf d = msg.content();
        //udp 不需要获取channel
        String content = msg.content().toString();
//        log.info("Received UDP Msg:" + content);
        Channel channel = ctx.channel();
//        System.out.println(channel.);
//        System.out.println("ovs : " + msg.sender().getHostName());
//        System.out.println(msg.content());
//        SFlowMsg sFlowMsg = new SFlowMsg();
        SFlowHead sFlowHead = new SFlowHead();
        sFlowHead.setVersion(msg.content().readInt());
        sFlowHead.setIpVersion(msg.content().readInt());
//        sFlowHead.setIpAddress(msg.content().re);
        byte[] ip =  new byte[4];
        msg.content().readBytes(ip, 0, 4);
        sFlowHead.setIpAddress(ip);
        sFlowHead.setSubAgentId(msg.content().readInt());
        sFlowHead.setSequenceNumber(msg.content().readInt());
        sFlowHead.setUpTime(msg.content().readInt());
        int numSamples = msg.content().readInt();
        sFlowHead.setNumSamples(numSamples);
        System.out.println(sFlowHead.toString());

        for(int i = 0; i < numSamples; i++){
            int type = msg.content().readInt();
//            System.out.println(type);
            int numLength = msg.content().readInt();
            if(type == 2) {
                CounterSample counterSample = new CounterSample();
                counterSample.setSequenceNum(msg.content().readInt());
                counterSample.setSourceIdType(msg.content().readByte());
//                counterSample.setSourceIdIndexVal(msg.content().readInt());
//                msg.content().readByte();

                //sourceIdINdexVal似乎是3个byte
                msg.content().skipBytes(3);
                int numRecords = msg.content().readInt();
                System.out.println("" + numRecords + "个records");
                counterSample.setNumRecords(numRecords);
                for (int j = 0; j < numRecords; j++) {
                    int recordType = msg.content().readInt();
                    System.out.println("recordType is :" + recordType);
                    int recordLength = msg.content().readInt();
                    System.out.println("recordLength is :" + recordLength);
                    msg.content().skipBytes(recordLength);
                }
            }else {
                msg.content().skipBytes(numLength);
            }
        }

//        sFlowDao.saveSflowHead(sFlowHead);
        //parse the body
//        msg.content().slice();
//        System.out.println(msg.content().read(125, CharsetUtil.US_ASCII));
//        System.out.println(msg.content().readChar());
//        System.out.println(msg.content().readCharSequence(msg.content().));
//        SFlowMsg sFlowMsg = new SFlowMsg(sFlowHead1, null);

    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception{
        ctx.flush();
    }
}
