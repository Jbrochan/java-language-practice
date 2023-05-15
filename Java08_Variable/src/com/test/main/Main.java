package com.test.main;

public class Main {
    public static void main(String[] args){
        // 논리형 변수 선언
        // 변수는 선언과 동시에 기억장소가 만들어진다.
        boolean a1;

        // 변수는 사용하기 전에 값을 저장해야 한다.
        // = : 대입 연산자, 오른쪽에 있는 값을 왼쪽의 변수에 저장한다.
        a1 = true;

        // 변수의 사용
        // 변수의 이름만 작성해 주면 기억장소의 값을 가져다 사용할 수 있다.
        System.out.printf("a1 : %s\n", a1);

        // 변수의 선언과 동시에 값을 저장한다.
        boolean a2 = false;
        System.out.printf("a2 : %s\n", a2);

        // 문자 타입 (2 byte 정수, 0 ~ 65535)
        char char1 = 65;
        char char2 = 'A';

        System.out.printf("char1 :  %c\n", char1);
        System.out.printf("char2 : %c\n", char2);

        // 정수 타입
        // 1 byte
        byte byte1 = 127;
        // 2 byte
        short short1 = 32767;
        // 4 byte
        int int1 = 2147483647;
        // 8 byte
        long long1 = 922337203684775807L;

        System.out.printf("byte : %d\n", byte1);
        System.out.printf("short : %d\n", short1);
        System.out.printf("int : %d\n", int1);
        System.out.printf("long : %d\n", long1);

        // 실수 타입
        // 4byte
        float float1 = 11.11f;
        // 8byte
        double double1 = 22.22;

        System.out.printf("float : %f\n", float1);
        System.out.printf("double : %f\n", double1);

        // 문자열
        String str1 = "안녕하세요";
        System.out.printf("String : %s\n", str1);

        // 3항 연산자
        // 주어진 비교 연산의 결과가 true 면 값1이 연산의 결과가 되고
        // false 면 값2가 연산의 결과가 된다.
        // 비교연산식 ? 값 : 값2
        int j1 = 100;

        boolean j2 = j1 < 200 ? true : false;
        boolean j3 = j1 > 200 ? true : false;

        System.out.printf("j2 : %s\n", j2);
        System.out.printf("j3 : %s\n", j3);

        // 대입 연산자
        // 우측의 값을 좌측의 변수에 저장한다.
        int k1 = 100;
        System.out.printf("k1 : %d\n", k1);

        // 다른 연산자와 같이 사용하는 대입연산자
        int k2 = 100;
        int k3 = 100;

        k2 = k2 + 10;
        k3 += 10;

        System.out.printf("k2 : %d\n", k2);
        System.out.printf("k3 : %d\n", k3);

        k2 = k2 - 10;
        k3 -= 10;

        System.out.printf("k2 : %d\n", k2);
        System.out.printf("k3 : %d\n", k3);

        // 증감 연산자
        int l1 = 100;
        int l2 = 100;

        ++l1;
        l2++;

        System.out.printf("l1 : %d\n", l1);
        System.out.printf("l2 : %d\n", l2);

        int l3 = ++l1;
        int l4 = l2++;

        System.out.printf("l1 : %d, l3 : %d\n", l1, l3);
        System.out.printf("l2 : %d, l4 : %d\n", l2, l4);


    }
}

