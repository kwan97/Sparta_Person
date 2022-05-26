package com.sparta.week01.prac;

import java.util.ArrayList;
import java.util.List;

public class prac_ForIf {

    public static int countFruit(String fruit) {
        List<String> fruits = new ArrayList<>();
        fruits.add("감");
        fruits.add("배");
        fruits.add("감");
        fruits.add("딸기");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("딸기");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("감");

        int count = 0;
        for (int i = 0; i < fruits.size(); i++) {
            String a = fruits.get(i);
            if (a == fruit) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        String title = "웹개발의 봄, Spring";
        String tutor = "김규관";
        int days = 35;

        // ClassPrac = 빵틀, course = 빵
        Course course = new Course();
        course.setTitle(title);
        course.setTutor(tutor);
        course.setDays(days);
        System.out.println(course.getTitle());
        System.out.println(course.getTutor());
        System.out.println(course.getDays());

     /* // course.** 코드 =  슈크림 채워준다는 느낌
        course.title = "웹개발의 봄, Spring";
        course.tutor = "김규관";
        course.days = 99; */


        // ClassPrac(빵틀)을 여러번 사용해서 빵 만들기 가능
        /*Course course2 = new Course();
        course2.title = "백엔드 수업 이야기";
        System.out.printf(course2.title);
        */
    }
}