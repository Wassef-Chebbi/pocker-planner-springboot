package com.example.pockerplanner.service;

import com.example.pockerplanner.Repository.RoomRepository;
import com.example.pockerplanner.Repository.UserRepository;
import com.example.pockerplanner.Utils.HelperUtils;
import com.example.pockerplanner.dto.RoomDTO;
import com.example.pockerplanner.model.Room;
import com.example.pockerplanner.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@Slf4j
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository roomRepository;
    @Autowired
    private UserRepository userRepository;

    @Override
    public Room save(RoomDTO roomDTO) {

        log.info("save() executed successfully");
        Room room = Room.builder()
                .name(roomDTO.getName())
                .cardSet(roomDTO.getCardSet())
                .build();
        log.info("Room:"+room.toString());
        return roomRepository.save(room);
    }

    @Override
    public Room findRoomById(Long roomId) {

        log.info("findRoomById() executed successfully");
        Room room = roomRepository.findById(roomId).get();
        log.info("Room:"+room.toString());
        return room ;
    }


    @Override
    public List<Room> findAll() {

        log.info("findAll() executed successfully");
        return roomRepository.findAll();
    }


    @Override
    public Room updateRoom(RoomDTO roomDTO, Long roomId) {

        //ToDO
        return null;
    }


    @Override
    public void deleteRoom(Long roomId) {
        log.info("deleteRoom() executed successfully");
        roomRepository.deleteById(roomId);
        log.info("room"+roomId+" deleted successfully");

    }

    @Override
    public void addUserToRoom(Long userId, Long roomId) {

        log.info("addUserToRoom() executed successfully");
        Room room = roomRepository.findById(roomId).get();
        User user = userRepository.findById(userId).get();

        if (!room.getMembers().contains(user)) {
            room.addUser(user);
            roomRepository.save(room);
            log.info("user "+ user.getId()+" added to room "+room.getRoomid()+" successfully");
            //return room.toString();
        } else {
            log.info("User with ID "+ user.getId() +" already exists in the "+ room.getRoomid()+" room");
            //return "User with ID " + user.getId() + " already exists in the room";
        }
    }





}
