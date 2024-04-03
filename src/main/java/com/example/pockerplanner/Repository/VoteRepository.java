package com.example.pockerplanner.Repository;

import com.example.pockerplanner.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VoteRepository extends JpaRepository<Vote, Long> {
}
