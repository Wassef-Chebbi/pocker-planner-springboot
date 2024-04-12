package com.example.pockerplanner.controller;


import com.example.pockerplanner.model.Room;
import com.example.pockerplanner.model.Vote;
import com.example.pockerplanner.service.RoomService;
import com.example.pockerplanner.service.VoteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/session")
@RequiredArgsConstructor
@Slf4j
@CrossOrigin("*")
public class VoteController {

    @Autowired
    private VoteService voteService;

    @GetMapping("/votes")
    public ResponseEntity<List<Vote>> getVotes()
    {
        List votes = voteService.findAll();
        return new ResponseEntity(votes, HttpStatus.OK);
    }





}
