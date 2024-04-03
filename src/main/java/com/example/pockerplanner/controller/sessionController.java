package com.example.pockerplanner.controller;


import com.example.pockerplanner.model.Session;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sessions")
@RequiredArgsConstructor
@Slf4j
@CrossOrigin("*")
public class sessionController {

//    @Autowired
//    private SessionService sessionService;



//    @PostMapping("/createSession")
//    public ResponseEntity<String> createRoom() {
////        Session session = sessionService.createSession();
////        String webSocketUrl = "ws://localhost:8080/pocker?roomId=" + session.getSessionId();
////        log.info("=============== create room executed with success");
////        return ResponseEntity.ok(webSocketUrl);
//        return ResponseEntity.ok("sd") ;
//    }


    @GetMapping("/createSession")
    public String createRoom() {
//        Session session = sessionService.createSession();
//        String webSocketUrl = "ws://localhost:8080/pocker?roomId=" + session.getSessionId();
//        log.info("=============== create room executed with success");
//        return ResponseEntity.ok(webSocketUrl);
        return "ss";
    }



}
