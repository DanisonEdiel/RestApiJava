package com.example.RestApiJava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller
@CrossOrigin
public class webSocketController {
    private final SimpMessagingTemplate template;

    @Autowired
    webSocketController(SimpMessagingTemplate template){
        this.template = template;
    }

    @MessageMapping("/queue/reply")
    public void sendMessage(String message){
        System.out.println(message);
        this.template.convertAndSend("/topic",  message);
    }
}
