package com.example.pockerplanner.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Formula;

@Entity
@Table(name = "Vote")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "voteId")
    private Long voteid;

    @Column(name = "voteValue")
    private Integer value;

    private Boolean highlighted = false;



    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "room_id")
    private Room room;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "user_id")
    private User member;


    @Transient
    private Long roomId;

    @Transient
    private Long userId;

    @PostLoad
    private void populateIds() {
        if (room != null) {
            roomId = room.getRoomid();
        }
        if (member != null) {
            userId = member.getId();
        }
    }




}
