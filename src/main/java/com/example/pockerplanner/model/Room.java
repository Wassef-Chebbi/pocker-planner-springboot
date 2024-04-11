package com.example.pockerplanner.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
//@Table(name = "session", indexes = { @Index(name = "date_idx", columnList = "lastAction") })
@Getter
@Setter
@RequiredArgsConstructor
@Builder
@AllArgsConstructor
public class Room {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    //private Boolean isPrivate;

    //private String token;

    private Integer cardSet;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime lastAction;

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<User> members = new ArrayList<>();
//
//    @OneToMany(mappedBy = "session", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Poll> polls = new ArrayList<>();

//    @ManyToOne
//    @JoinColumn(name = "current_poll_id")
//    private Poll currentPoll;


}
