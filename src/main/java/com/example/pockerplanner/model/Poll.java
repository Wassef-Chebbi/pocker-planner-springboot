//package com.example.pockerplanner.model;
//
//
//import jakarta.persistence.*;
//import lombok.*;
//import org.springframework.format.annotation.DateTimeFormat;
//
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Table(name = "poll")
//@Getter
//@Setter
//@NoArgsConstructor
//public class Poll {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String topic;
//
//    @Column(columnDefinition = "TEXT")
//    private String description;
//
//    private String url;
//
//    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
//    private LocalDateTime startTime;
//
//    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
//    private LocalDateTime endTime;
//
//    private Float result;
//
//    private Boolean consensus;
//
//    @ManyToOne
//    @JoinColumn(name = "session_id")
//    private Room room;

//    @OneToMany(mappedBy = "poll", cascade = CascadeType.ALL)
//    private List<Vote> votes = new ArrayList<>();


//}
