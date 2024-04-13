package com.example.pockerplanner.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Room")
@Getter
@Setter
@RequiredArgsConstructor
@Builder
@AllArgsConstructor
public class Room {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roomId")
    private Long roomid;

    @Column(name = "roomName")
    private String name;


    @Column(name = "roomCardSet")
    private Integer cardSet;

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<User> members ;



    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
    private List<Vote> votes = new ArrayList<>();


    public void addUser(User user) {
        members.add(user);
        //user.setRoom(this);
    }



    //private Boolean isPrivate;

    //private String token;

//    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
//    @Column(name = "roomLastAction")
//    private LocalDateTime lastAction;


//
//    @OneToMany(mappedBy = "session", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Poll> polls = new ArrayList<>();

//    @ManyToOne
//    @JoinColumn(name = "current_poll_id")
//    private Poll currentPoll;


    @Override
    public String toString() {
        return "Room{" +
                "roomid=" + roomid +
                ", name='" + name + '\'' +
                ", cardSet=" + cardSet +
                ", members=" + members +
                '}';
    }
}
