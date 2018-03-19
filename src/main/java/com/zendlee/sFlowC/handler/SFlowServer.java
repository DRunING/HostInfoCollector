package com.zendlee.sFlowC.handler;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioDatagramChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.net.DatagramPacket;

//作为spring的一个bean
@Component
public class SFlowServer {

    private static final Logger log = LoggerFactory.getLogger(SFlowServer.class);

    //使用@Async注解将方法定义成异步的，asyncPool是自定义的线程池
    @Async("asyncPool")
    public void run(int sFlowRevicePort){

        EventLoopGroup group = new NioEventLoopGroup();
        log.info("a sFlow server start!!");

            try {
            //初始化bootstrap
            Bootstrap bootstrap = new Bootstrap();
            //此处NioDatagramChannel.class采用的是非阻塞的模式接受消息, 若是接受的UDP消息少，可以采用阻塞式的方式接受UDP消息。
            bootstrap.group(group)
                    .channel(NioDatagramChannel.class)
                    .option(ChannelOption.SO_BROADCAST, true)
                    .handler(new SFlowServerHandler());
            Channel channel = bootstrap.bind(sFlowRevicePort).sync ().channel();
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
