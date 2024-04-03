package com.example.pockerplanner.Repository;

import com.example.pockerplanner.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long> {

    @Query("SELECT s.id, s.name, s.isPrivate, s.token, COUNT(m.id) AS memberCount FROM Session s LEFT JOIN s.members m WHERE s.lastAction > :oneHourAgo GROUP BY s.id")
    List<Map<String, Object>> getActiveSessions(@Param("categoryId") LocalDateTime oneHourAgo);


}
