package com.poll.pollapp.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Vote {
    private long pollId;
    private int optionIndex;
}
