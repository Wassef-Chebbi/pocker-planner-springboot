package com.example.pockerplanner.service;

import com.example.pockerplanner.Repository.SessionRepository;
import com.example.pockerplanner.Utils.HelperUtils;
import com.example.pockerplanner.model.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Component
public class SessionServiceImpl implements SessionService {

    @Autowired
    private SessionRepository sessionRepository;
    @Autowired
    private HelperUtils helperUtils;



    @Override
    public Session createSession(Session session1) {
        Session session = new Session();
        session = session1;
        sessionRepository.save(session);
        return session;

        //return new Session();
    }







    @Override
    public List<Map<String, Object>> getActiveSessions() {
        LocalDateTime oneHourAgo = LocalDateTime.now().minusHours(1);
        List<Map<String, Object>> activeSessions = sessionRepository.getActiveSessions(oneHourAgo);


        // To put inside the session controller

        // Determine password requirement for each session
//        for (Map<String, Object> session : activeSessions) {
//            Long sessionId = (Long) session.get("id");
//            Boolean isPrivate = (Boolean) session.get("isPrivate");
//            String tokenKey = helperUtils.tokenKey(sessionId);
//            session.put("requiresPassword", isPrivate && (!helperUtils.hasCookie(tokenKey) || !getCookie(tokenKey).equals(/* token value */)));
//        }

        return activeSessions;
    }


}
