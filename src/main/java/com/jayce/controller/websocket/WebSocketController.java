package com.jayce.controller.websocket;

import com.jayce.common.pojo.ToUserMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jayce on 2016/12/16.
 */
@RestController
@MessageMapping("message")
public class WebSocketController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    // 注入SimpMessagingTemplate 用于点对点消息发送
    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/welcome")
    // SendTo 发送至 Broker 下的指定订阅路径
    @SendTo("/topic/getResponse")
    public String say(String string) {
        // 方法用于广播测试
//        logger.info("say called");
        return string;
    }

    @MessageMapping("/cheat")
    // 发送的订阅路径为/user/{userId}/message
    // /user/路径是默认的一个，如果想要改变，必须在config 中setUserDestinationPrefix
    public void cheatTo(ToUserMessage toUserMessage) {
        // 方法用于点对点测试
        logger.info("toUserMessage.getMessage() = " + toUserMessage.getMessage());
        logger.info("toUserMessage.getUserId() = " + toUserMessage.getUserId());
        messagingTemplate.convertAndSendToUser(toUserMessage.getUserId(), "/message", toUserMessage.getMessage());
    }
}
