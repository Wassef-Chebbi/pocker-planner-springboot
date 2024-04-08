package com.example.pockerplanner.Repository;

import com.example.pockerplanner.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, Long> {
}
