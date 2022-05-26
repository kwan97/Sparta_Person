package com.sparta.week01.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass // Timestamped를 상속한 클래스에 자동으로 생성/수정 시간을 컬럼으로 잡게 해주는 어노테이션
@EntityListeners(AuditingEntityListener.class) // 생성/수정 시간을 자동으로 반영하도록 설정
public abstract class Timestamped { // abstract: 이 클래스는 무조건 상속으로만 사용할 수 있다는 것을 뜻함

    @CreatedDate // 생성일자임을 나타냅니다.
    private LocalDateTime createdAt;
    // LocalDateTime: 시간을 나타내는 자바의 자료형

    @LastModifiedDate // 마지막 수정일자임을 나타냅니다.
    private LocalDateTime modifiedAt;
}
