package com.zendlee.sFlowC.handler;


import com.zendlee.sFlowC.dao.mongo.SFlowDao;
import com.zendlee.sFlowC.repository.SFlowHead;
import com.zendlee.sFlowC.repository.countRecord.*;
import com.zendlee.sFlowC.repository.flowRecord.ExtendedSwitchFlow;
import com.zendlee.sFlowC.repository.flowRecord.RawPacketFlow;
import com.zendlee.sFlowC.repository.sample.CounterSample;
import com.zendlee.sFlowC.repository.sample.FlowSample;
import com.zendlee.sFlowC.sFlow.Decode;
import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.DatagramPacket;
import org.apache.catalina.Host;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.IOException;

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

//    private static int threadNum = System.

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, DatagramPacket msg) throws Exception{
//        ByteBuf d = msg.content();
        count++;
        Decode decode = new Decode(msg);
        SFlowHead sFlowHead = decode.decode();
        sFlowDao.saveSflowHead(sFlowHead);
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception{
        ctx.flush();
    }
}
