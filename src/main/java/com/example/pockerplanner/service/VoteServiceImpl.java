package com.example.pockerplanner.service;

import com.example.pockerplanner.Repository.VoteRepository;
import com.example.pockerplanner.dto.VoteDTO;
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
        return null;
    }

    @Override
    public Vote findVoteById(Long roomId) {
        return null;
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
