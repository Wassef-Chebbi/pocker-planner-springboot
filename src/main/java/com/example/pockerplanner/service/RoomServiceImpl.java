package com.example.pockerplanner.service;

import com.example.pockerplanner.Repository.RoomRepository;
import com.example.pockerplanner.Utils.HelperUtils;
import com.example.pockerplanner.dto.RoomDTO;
import com.example.pockerplanner.model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Component
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository roomRepository;

    @Override
    public Room save(RoomDTO roomDTO) {


        Room room = Room.builder()
                .name(roomDTO.getName())
                .cardSet(roomDTO.getCardSet())
                .lastAction(LocalDateTime.now())
                .build();
        return roomRepository.save(room);
    }

    @Override
    public Optional<Room> findRoomById(Long roomId) {
        return roomRepository.findById(roomId);
    }


    @Override
    public List<Room> findAll() {
        return roomRepository.findAll();
    }

    @Override
    public Room updateRoom(RoomDTO roomDTO, Long roomId) {
        return null;
    }

    @Override
    public void deleteRoom(Long roomId) {
        roomRepository.deleteById(roomId);

    }


//    @Override
//    public List<Map<String, Object>> getActiveSessions() {
//        LocalDateTime oneHourAgo = LocalDateTime.now().minusHours(1);
//        List<Map<String, Object>> activeSessions = sessionRepository.getActiveSessions(oneHourAgo);
//
//
//        // To put inside the session controller
//
//        // Determine password requirement for each session
////        for (Map<String, Object> session : activeSessions) {
////            Long sessionId = (Long) session.get("id");
////            Boolean isPrivate = (Boolean) session.get("isPrivate");
////            String tokenKey = helperUtils.tokenKey(sessionId);
////            session.put("requiresPassword", isPrivate && (!helperUtils.hasCookie(tokenKey) || !getCookie(tokenKey).equals(/* token value */)));
////        }
//
//        return activeSessions;
//    }


}
