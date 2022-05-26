package com.sparta.week01.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Person extends Timestamped {

    // 생성,수정 시간을 자동으로 만들어줍니다.
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private  String title;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String pwd;

    @Column(nullable = false)
    private String contents;

    public Person(String title, String pwd,String username, String contents) {
        this.title = title;
        this.pwd = pwd;
        this.username = username;
        this.contents = contents;
    }

    public Person(PersonRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.pwd = requestDto.getPwd();
        this.username = requestDto.getUsername();
        this.contents = requestDto.getContents();
    }

    public void update(PersonRequestDto requestDto) {
        this.username = requestDto.getUsername();
        this.contents = requestDto.getContents();
        this.title = requestDto.getTitle();
        this.pwd = requestDto.getPwd();
    }
}

