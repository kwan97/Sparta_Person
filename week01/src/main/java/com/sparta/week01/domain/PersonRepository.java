package com.sparta.week01.domain;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findAllByOrderByModifiedAtDesc();
    // findAll By OrderBy ModifiedAt Desc(): 최신순으로 정렬을 해주는 로직

}

