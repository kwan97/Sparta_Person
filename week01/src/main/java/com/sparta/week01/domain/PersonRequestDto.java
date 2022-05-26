package com.sparta.week01.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class PersonRequestDto {
    private final String title;
    private final String username;
    private final String pwd;
    private final String contents;
}
