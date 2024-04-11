package com.example.pockerplanner.WebSocket;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.config.annotation.*;

@Configuration
@EnableWebSocket
@EnableWebSocketMessageBroker
@Slf4j
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

//    private final WebSocketHandler pokerWebSocketHandler;
//
//    public WebSocketConfig(WebSocketHandler pokerWebSocketHandler) {
//        this.pokerWebSocketHandler = pokerWebSocketHandler;
//    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        //registry.addEndpoint("/pocker").withSockJS();
        registry.addEndpoint("/pocker").setAllowedOriginPatterns("*");
        log.info("============== endpoint registered with success");
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        config.setApplicationDestinationPrefixes("/app")
        .enableSimpleBroker("/topic", "/queue");

    }



//    @Override
//    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
//        registry.addHandler(pokerWebSocketHandler, "/pocker");
//        log.info("================ handler registered with success");
//
//
//    }



}
