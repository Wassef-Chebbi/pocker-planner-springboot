package com.example.pockerplanner.controller;


import com.example.pockerplanner.dto.RoomDTO;
import com.example.pockerplanner.dto.VoteDTO;
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
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/vote")
@RequiredArgsConstructor
@Slf4j
@CrossOrigin("*")
public class VoteController {

    @Autowired
    private VoteService voteService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Vote>> getVotes()
    {
        List votes = voteService.findAll();
        return new ResponseEntity(votes, HttpStatus.OK);
    }

    // let the member to ote for in a specific room
    @PostMapping("/add")
    public ResponseEntity<Vote> saveVote(
            @RequestBody VoteDTO vote)
    {
        Vote savedVote = voteService.save(vote);
        return new ResponseEntity<>(savedVote, HttpStatus.CREATED);
    }

    @PatchMapping("/update/{voteId}")
    public ResponseEntity<Vote> updateVote(
            @PathVariable Long voteId,
            @RequestBody VoteDTO vote)
    {
        Vote updated = voteService.update(vote,voteId);
        return new ResponseEntity<>(updated, HttpStatus.ACCEPTED);
    }

    // for the admin user
    // gets all votes for a specific room(submitted)
    @GetMapping(value = "/votes/room/{roomId}")
    public ResponseEntity<Room> getVotesByRoomId(
            @PathVariable Long roomId
    )
    {
        List<Vote> vote = voteService.findVotesByRoomId(roomId);
        return new ResponseEntity(vote, HttpStatus.OK);
    }





}
