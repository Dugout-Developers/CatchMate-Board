package com.catchmate.board.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Board {
    private Long boardId;
    private String Title;
    private String description;
}
