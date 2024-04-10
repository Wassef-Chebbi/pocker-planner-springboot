package com.example.pockerplanner.controller;


import com.example.pockerplanner.dto.RoomDTO;
import com.example.pockerplanner.model.Room;
import com.example.pockerplanner.service.RoomService;
import com.example.pockerplanner.service.RoomServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/api/session")
@RequiredArgsConstructor
@Slf4j
@CrossOrigin("*")
public class sessionController {

    @Autowired
    private RoomService roomService;


    @GetMapping("/rooms")
    public ResponseEntity<List<Room>> getRooms()
    {
        List rooms = roomService.findAll();
        return new ResponseEntity(rooms, HttpStatus.OK);
    }


    @GetMapping("/rooms/{id}")
    public ResponseEntity<List<Room>> getRoomById(
            @PathVariable Long id
    )
    {
        Optional<Room> room = roomService.findRoomById(id);
        return new ResponseEntity(room, HttpStatus.OK);
    }


    @PostMapping("/create")
    public ResponseEntity<Room> saveDepartment(
            @RequestBody RoomDTO room)
    {
        Room savedRoom = roomService.save(room);
        return new ResponseEntity<>(savedRoom, HttpStatus.CREATED);
    }


    @DeleteMapping("/rooms/{roomId}")
    public ResponseEntity<String> deleteRoom(
            @PathVariable Long roomId)
    {
        roomService.deleteRoom(roomId);
        return new ResponseEntity<>("Room deleted successfully",HttpStatus.OK);
    }




//    @PostMapping("/createSession")
//    public ResponseEntity<String> createRoom() {
////        Session session = sessionService.createSession();
////        String webSocketUrl = "ws://localhost:8080/pocker?roomId=" + session.getSessionId();
////        log.info("=============== create room executed with success");
////        return ResponseEntity.ok(webSocketUrl);
//        return ResponseEntity.ok("sd") ;
//    }


//    @GetMapping("/createSession")
//    public String createRoom() {
////        Session session = sessionService.createSession();
////        String webSocketUrl = "ws://localhost:8080/pocker?roomId=" + session.getSessionId();
////        log.info("=============== create room executed with success");
////        return ResponseEntity.ok(webSocketUrl);
//        return "ss";
//    }



}
