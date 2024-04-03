package com.example.pockerplanner.service;

import com.example.pockerplanner.model.Session;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public interface SessionService {

    Session createSession(Session session);

//    Session getSession(UUID sessionId);
//    void addParticipant(String sessionId, String participantId);
//
//    // Optional methods (consider for future enhancements):
//    List<Session> getAllSessions();
//    void deleteSession(String sessionId);

    List<Map<String, Object>> getActiveSessions();


}
