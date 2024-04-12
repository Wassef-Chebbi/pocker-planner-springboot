package com.example.pockerplanner.service;

import com.example.pockerplanner.dto.RoomDTO;
import com.example.pockerplanner.model.Room;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

@Service
public interface RoomService {

    Room save(RoomDTO roomDTO);

    Room findRoomById(Long roomId);


    List<Room> findAll();

    Room updateRoom(RoomDTO roomDTO, Long roomId);

    void deleteRoom(Long roomId);

    String addUserToRoom(Long userId, Long roomId);

//    Session getSession(UUID sessionId);
//    void addParticipant(String sessionId, String participantId);
//
//    // Optional methods (consider for future enhancements):
//    List<Session> getAllSessions();
//    void deleteSession(String sessionId);

//    List<Map<String, Object>> getActiveSessions();


}
