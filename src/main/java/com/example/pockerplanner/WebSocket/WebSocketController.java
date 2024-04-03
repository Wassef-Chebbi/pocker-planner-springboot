//package com.example.pockerplanner.WebSocket;
//
//
//import com.example.pockerplanner.model.Session;
//import com.example.pockerplanner.service.SessionService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.messaging.handler.annotation.MessageMapping;
//import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
//import org.springframework.messaging.simp.SimpMessagingTemplate;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.CrossOrigin;
//
//@Controller
//@Slf4j
//@CrossOrigin("*")
//public class WebSocketController {
//
//    @Autowired
//    private SessionService sessionService;
//
//    @Autowired
//    private  SimpMessagingTemplate messagingTemplate;
//
//    @MessageMapping("/create-room")
//    public void createRoom(SimpMessageHeaderAccessor headerAccessor) {
//        Session room = sessionService.createSession();
//        String roomLink = "ws://localhost:8080/pocker?roomId=" + room.getSessionId();
//        messagingTemplate.convertAndSendToUser(headerAccessor.getUser().getName(), "/queue/room-link", roomLink);
//        log.info("+++++++ create room from ws controller executed with success");
//    }
//
//
//}
