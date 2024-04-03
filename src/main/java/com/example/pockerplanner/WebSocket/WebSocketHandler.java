//package com.example.pockerplanner.WebSocket;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//import org.springframework.web.socket.TextMessage;
//import org.springframework.web.socket.WebSocketSession;
//import org.springframework.web.socket.handler.TextWebSocketHandler;
//
//import java.util.List;
//import java.util.concurrent.CopyOnWriteArrayList;
//
//
//@Slf4j
//@Component
//public class WebSocketHandler extends TextWebSocketHandler {
//
//    private List<WebSocketSession> sessions = new CopyOnWriteArrayList<>();
//
//    @Override
//    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
//        sessions.add(session);
////        String roomId =  session.getId();
//        log.info("============== session added with success ");
//    }
//
//    @Override
//    public void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
////        String roomId = (String) session.getAttributes().get("roomId");
////        String receivedMessage = message.getPayload();
////        log.info("============ Received message from room " + roomId + ": " + receivedMessage);
//        for(WebSocketSession s : sessions){
//            s.sendMessage(message);
//        }
//
//    }
//}
