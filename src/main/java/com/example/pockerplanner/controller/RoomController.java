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
@RequestMapping("/api/room")
@RequiredArgsConstructor
@Slf4j
@CrossOrigin("*")
public class RoomController {

    @Autowired
    private RoomService roomService;



    // gets the list of available rooms
    @GetMapping("/getAll")
    public ResponseEntity<List<Room>> getRooms()
    {
        List rooms = roomService.findAll();
        return new ResponseEntity(rooms, HttpStatus.OK);
    }


    // get the actual room (desired)
    @GetMapping(value = "/getById/{id}")
    public ResponseEntity<Room> getRoomById(
            @PathVariable Long id
    )
    {
        Room room = roomService.findRoomById(id);
        return new ResponseEntity(room, HttpStatus.OK);
    }

    // creates a room
    @PostMapping("/add")
    public ResponseEntity<Room> saveDepartment(
            @RequestBody RoomDTO room)
    {
        Room savedRoom = roomService.save(room);
        return new ResponseEntity<>(savedRoom, HttpStatus.CREATED);
    }


    // deleetes the room
    @DeleteMapping("/delete/{roomId}")
    public ResponseEntity<String> deleteRoom(
            @PathVariable Long roomId)
    {
        roomService.deleteRoom(roomId);
        return new ResponseEntity<>("Room deleted successfully",HttpStatus.OK);
    }

    // adds a member to a room : (let him join it)
    @PostMapping("/join/room/{roomId}/user/{userId}")
    public ResponseEntity<String> addMember(
            @PathVariable Long roomId,
            @PathVariable Long userId)
    {
        String room = roomService.addUserToRoom(userId,roomId);
        return new ResponseEntity<>(room,HttpStatus.OK);
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
