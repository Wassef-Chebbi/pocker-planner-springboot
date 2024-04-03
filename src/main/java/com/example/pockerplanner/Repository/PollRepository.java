package com.example.pockerplanner.Repository;

import com.example.pockerplanner.model.Poll;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PollRepository extends JpaRepository<Poll, Long> {
}
