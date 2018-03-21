package com.zendlee.sFlowC.handler;


import com.zendlee.sFlowC.dao.mongo.SFlowDao;
import com.zendlee.sFlowC.repository.SFlowHead;
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
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, DatagramPacket msg) throws Exception{
//        ByteBuf d = msg.content();
        //udp 不需要获取channel
        String content = msg.content().toString();
        log.info("Received UDP Msg:" + content);
//        Channel channel = ctx.channel();
//        System.out.println(channel.);
//        System.out.println("ovs : " + msg.sender().getHostName());
//        System.out.println(msg.content());
//        SFlowMsg sFlowMsg = new SFlowMsg();
        SFlowHead sFlowHead = new SFlowHead();
        sFlowHead.setVersion(msg.content().readInt());
        sFlowHead.setIpVersion(msg.content().readInt());
        sFlowHead.setIpAddress(msg.content().readInt());
        sFlowHead.setSubAgentId(msg.content().readInt());
        sFlowHead.setSequenceNumber(msg.content().readInt());
        sFlowHead.setUpTime(msg.content().readInt());
        sFlowHead.setNumSamples(msg.content().readInt());
        System.out.println(sFlowHead.toString());
        sFlowDao.saveSflowHead(sFlowHead);
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
