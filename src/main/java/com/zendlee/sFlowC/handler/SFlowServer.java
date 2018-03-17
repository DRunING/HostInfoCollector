package com.zendlee.sFlowC.handler;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioDatagramChannel;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.net.DatagramPacket;

@Component
public class SFlowServer {
    //todo logger
    //
    @Async("myTaskAsyncPool")
    public void run(int sFlowRevicePort){

        EventLoopGroup group = new NioEventLoopGroup();
        try {
            Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(group)
                    .channel(NioDatagramChannel.class)
                    .option(ChannelOption.SO_BROADCAST, true)
                    .handler(new SFlowServerHandler());
            Channel channel = bootstrap.bind(6343).sync ().channel();
            channel.closeFuture().await();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            group.shutdownGracefully();
        }
    }

//    public static void initServer() {
//
//        EventLoopGroup group = new NioEventLoopGroup();
//        try {
//            Bootstrap bootstrap = new Bootstrap();
//            bootstrap.group(group)
//                    .channel(NioDatagramChannel.class)
//                    .option(ChannelOption.SO_BROADCAST, true)
//                    .handler(new SFlowServerHandler());
//            Channel channel = bootstrap.bind(6343).sync ().channel();
//            channel.closeFuture().await();
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            group.shutdownGracefully();
//        }
//    }
//    public static void main(String[] args){
//        SFlowServer.initServer();
//    }

}
