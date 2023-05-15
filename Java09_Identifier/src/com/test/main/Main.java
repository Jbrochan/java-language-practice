package com.test.main;

import java.awt.*;

public class Main {
    public static void main(String[] args){
        // 식별자는 길이의 제한이 없다.
        // 식별자는 길이의 제한이 없다.
        int a1111111111111111111111111111111111111111111 = 100;
        System.out.println(a1111111111111111111111111111111111111111111);


        // 첫 글자는 문자, , $로 시작해야 하며 그 이후는
        // 문자, , $, 숫자가 가능하다
        int abc$100 = 200;
        System.out.println(abc$100);

        // 첫 글자가 숫자이므로 오류 발생
        // int 9abc = 300;

        // 한글 등도 가능하다.
        int 정수형변수 = 300;
        System.out.println(정수형변수);

        // 스네이크 표기 기법
        // 단어와 단어 사이에 언더바(_)를 두는 표기 기법
        // 자바에서는 상수를 표기할 때 사용
        int student_korean_point = 400;

        // 카멜 표기 기법
        // 맨 첫 글자를 제외한 각 단어의 첫 글자를 대문자로 표기하는 기법
        // 자바에서는 변수, 메서드를 표기할 때 사용
        int studentKoreanPoint = 500;

        // 파스칼 표기 기법
        // 각 단어의 첫 글자를 대문자로 표기하는 기법
        // 자바에서는 클래스를 표기할 때 사용
        int StudentKoreanPoint = 600;

        System.out.println(student_korean_point);
        System.out.println(studentKoreanPoint);
        System.out.println(StudentKoreanPoint);
    }
}
