package com.example.pockerplanner.service;

import com.example.pockerplanner.Repository.VoteRepository;
import com.example.pockerplanner.dto.VoteDTO;
import com.example.pockerplanner.model.Room;
import com.example.pockerplanner.model.Vote;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class VoteServiceImpl implements VoteService {

    @Autowired
    private VoteRepository voteRepository;


    @Override
    public Vote save(VoteDTO vote) {
        log.info("save() executed successfully");
        Vote newVote = Vote.builder()
                .value(vote.getValue())
                .roomId(vote.getRoomId())
                .userId(vote.getUserId())
                .build();
        log.info("Room:"+newVote.toString());
        return voteRepository.save(newVote);
    }

    @Override
    public List<Vote> findVotesByRoomId(Long roomId) {
        log.info("findVotesByRoomId() executed successfully");
        return voteRepository.findByRoomId(roomId);
    }



    @Override
    public List<Vote> findAll() {
        log.info("findAll() executed successfully");
        return voteRepository.findAll();
    }

    @Override
    public Vote updateVote(VoteDTO voteDTO) {
        return null;
    }

    @Override
    public void deleteVote(Long voteId) {

    }
}
