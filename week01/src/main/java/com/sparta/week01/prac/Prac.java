package com.sparta.week01.prac;

import com.sun.jmx.remote.internal.ArrayQueue;

public class Prac {
    /*메소드 선언 방법
     public 반환타입(=결과값을 어떤 타입으로 반환할지) 메소드명(파라미터(=재료 ex) int a, String b)) {
            명령 모음
            rerutn 결과값;
    }
    //반환할 값이 없다면 반환타입 대신에 void를 입력한다.
    */

    // 파라미터 X, 반환값 X
    public static void simplePrint() {
        System.out.println("파라미터도 없고, 반환값도 없어요!");
    }

    // 파라미터 O, 반환값 X
    public static void simpleSum(int num1, int num2) {
        System.out.println("num1 :" + num1 + ", num2: " + num2);
    }

    // 파라미터 X, 반환값 O
    public static String simpleReturn() {
        return "kkk";
    }

    // 파라미터 O, 반환값 O
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }


    public static void main(String[] args) {
        // main함수 안에서 메소드를 실행하려면 메소드 코드 public 다음에 static을 써줘야 한다.
        String  a = simpleReturn();
        System.out.println(a);

    }
}