package com.example.pockerplanner.service;

import com.example.pockerplanner.dto.RoomDTO;
import com.example.pockerplanner.dto.VoteDTO;
import com.example.pockerplanner.model.Room;
import com.example.pockerplanner.model.Vote;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VoteService {

    Vote save(VoteDTO vote);

    List<Vote> findVotesByRoomId(Long roomId);

    List<Vote> findAll();

    Vote updateVote(VoteDTO voteDTO);

    void deleteVote(Long voteId);


}
