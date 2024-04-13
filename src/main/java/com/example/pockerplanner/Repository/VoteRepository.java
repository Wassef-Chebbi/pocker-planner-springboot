package com.example.pockerplanner.Repository;

import com.example.pockerplanner.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface VoteRepository extends JpaRepository<Vote, Long> {

    @Query("select v FROM Vote v WHERE v.room.roomid = :roomId")
    List<Vote> findByRoomId(Long roomId);
}
