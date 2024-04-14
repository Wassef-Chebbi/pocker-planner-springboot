package com.example.pockerplanner.service;

import com.example.pockerplanner.Repository.RoomRepository;
import com.example.pockerplanner.Repository.UserRepository;
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
    @Autowired
    private RoomRepository roomRepository;
    @Autowired
    private UserRepository userRepository;


    @Override
    public Vote save(VoteDTO vote) {
        log.info("save() executed successfully");
        Vote newVote = Vote.builder()
                .value(vote.getValue())
                .room(roomRepository.findById(vote.getRoomId()).get())
                .member(userRepository.findById(vote.getUserId()).get())
                .roomId(vote.getRoomId())
                .userId(vote.getUserId())
                .build();
        log.info("Room:"+newVote.toString());
        return voteRepository.save(newVote);
    }

    @Override
    public Vote update(VoteDTO vote, Long voteId) {
        Vote updatedVote = voteRepository.findById(voteId).get();
        updatedVote.setValue(vote.getValue());
        return voteRepository.save(updatedVote);

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
