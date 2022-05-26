package com.sparta.week01.prac;

public class Course {

    // title, tutor, days 가 ClassPrac 이라는 맥락 아래에서 의도가 분명히 드러나죠!
    private String title;
    private String tutor;
    private int days;

    //기본 생성자: 메서드에 값을 넣어준 채로 생성하는법법
    public Course() {

    }

    //생성자 = 클래스명과 똑같은 이름을 가진 메소드를 "생성자"라고 부릅니다.
    public Course(String title, String tutor, int days) {
        this.title = title;
        this.tutor = tutor;
        this.days = days;
    }

    //Setter (=정보를 수정하는 것)
    public void setTitle(String title) {
        this.title = title;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public void  setDays(int days) {
        this.days = days;
    }

    //Getter (=정보를 가져오는것 )
    public String getTitle() {
        return this.title;
    }

    public String getTutor() {
        return this.tutor;
    }

    public int getDays() {
        return this.days;
    }
}

