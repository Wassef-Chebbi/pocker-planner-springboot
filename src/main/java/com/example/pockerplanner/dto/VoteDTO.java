package com.example.pockerplanner.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class VoteDTO {

    private Integer value;
    private Long roomId;
    private Long userId;
}
