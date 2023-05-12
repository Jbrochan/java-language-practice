package com.test.main;

public class Main {
    public static void main(String[] args){
        // ( ) 안의 내용을 출력하고 한 줄 내려준다.
        // System.out.println() 사용 시 아무 내용도 작성하지 않으면
        // 아무런 내용을 출력하지 않고 밑으로 내려준다
        System.out.println("안녕하세요");
        System.out.println("반갑습니다");

        // ( ) 안의 내용을 출력하고 한 줄 내려주지 않는다.
        System.out.print("안녕하세요");
        System.out.print("반갑습니댜");

        // 다양한 형태의 값을 지원한다.
        System.out.println(100);
        System.out.println(11.11);

        // 문자열과 문자열을 더하면 하나의 문자열이 된다.
        System.out.println("문자열1" + "문자열2");

        // 문자열과 문자열이 아닌 것을 더하면
        // 문자열이 아닌 것이 문자열로 변환되고 문자열 + 문자열을 수행한다.
        System.out.println("정수 : " + 100);
    }
}
