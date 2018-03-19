package com.zendlee.sFlowC.handler;


import com.zendlee.sFlowC.sFlow.SFlowHeader;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.DatagramPacket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zenli
 */
public class SFlowServerHandler extends SimpleChannelInboundHandler<DatagramPacket> {
    private static final Logger log = LoggerFactory.getLogger(SFlowServerHandler.class);
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
//        SFlowMsg sFlowMsg = new SFlowMsg()
        SFlowHeader sFlowHeader = new SFlowHeader();
        sFlowHeader.setVersion(msg.content().readInt());
        sFlowHeader.setIpVersion(msg.content().readInt());
        sFlowHeader.setIpAddress(msg.content().readInt());
        sFlowHeader.setSubAgentId(msg.content().readInt());
        sFlowHeader.setSequenceNumber(msg.content().readInt());
        sFlowHeader.setUpTime(msg.content().readInt());
        sFlowHeader.setNumSamples(msg.content().readInt());


        System.out.println(sFlowHeader.toString());

        //parse the body
        msg.content().slice();
//        System.out.println(msg.content().read(125, CharsetUtil.US_ASCII));
//        System.out.println(msg.content().readChar());
//        System.out.println(msg.content().readCharSequence(msg.content().));


//        SFlowMsg sFlowMsg = new SFlowMsg(sFlowHeader1, null);

    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception{
        ctx.flush();
    }
}
