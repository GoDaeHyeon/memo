package com.example.memo.dto;

import com.example.memo.entity.Memo;
import lombok.Getter;

@Getter

public class MemoResponseDto {

    private Long id;
    private String title;
    private String contents;

    public MemoResponseDto(Memo memo) {
    }
}
