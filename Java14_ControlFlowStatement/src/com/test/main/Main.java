package com.test.main;

public class Main {
    public static void main(String[] args){
        // if 문
        // 주어진 수식의 결과가 true 인 경우 관리하는 코드가 수행되고
        // 그렇지 않은 경우에는 수행되지 않는다.
        int a1 = 10;
        if(a1 > 5)
            System.out.println("a1은 5보다 큽니다");

        if(a1 < 5)
            System.out.println("a1은 5보다 작습니다");

        // 관리하는 코드가 한 줄 이상이면 괄호로 묶어 줘야 한다.
        if(a1 != 10){
            System.out.println("a1은 10이 아닙니다");
            System.out.println("이 부분은 수행되지 않는다");
        }

        // 조건에 만족하는 부분이 없을 경우 수행할 코드가 있다면 else 를 사용한다.
        if(a1 == 10){
            System.out.println("a1은 10입니다");
        } else{
            System.out.println("a1은 10이 아닙니다");
        }

        if(a1 > 10){
            System.out.println("a1은 10보다 큽니다");
        } else {
            System.out.println("a1은 10보다 크지 않습니다");
        }

        // 조건이 다양하게 있을 경우 else if로 추가 조건들을 설정해준다.
        if(a1 == 0){
            System.out.println("a1은 0 입니다");
        } else if(a1 == 5){
            System.out.println("a1은 5 입니다");
        } else if(a1 == 10){
            System.out.println("a1은 10 입니다");
        } else if(a1 == 20){
            System.out.println("a1은 20 입니다");
        } else {
            System.out.println("a1은 0, 5, 10, 20이 아닙니다");
        }
        System.out.println("----------------------------------");

        // switch 문
        // 정답을 찾으면 그만두고 싶은 경우 break 를 활용한다.
        // 옛날에는 switch 가 더 빨라서 용도를 구분햇지만
        // 이제는 하드웨어의 성능이 좋아짐에 따라서 차이가 없어서 if 문을 주로 사용한다.
        // 하지만 속도가 중요한 인공지능이나 게임 분야의 경우 구분해서 사용하는 것을 추천
        int a2 = 10;
        switch(a2){
            case 1:
                System.out.println("a2는 1 입니다");
                break;
            case 5:
                System.out.println("a2는 5 입니다");
                break;
            case 10:
                System.out.println("a2는 10 입니다");
                break;
            case 20:
                System.out.println("a2는 20 입니다");
                break;
            default:
                System.out.println("a2는 1, 5, 10, 20이 아닙니다");
        }
        System.out.println("----------------------------------");

        // for 문
        // 초기식, 조건식, 증감식으로 구성된다.
        // 초기식 -> 조건식 -> 코드 -> 증감식 -> 조건식 -> 코드 -> 증감식 ...
        // 조건식이 거짓이 되면 반복을 중단한다.
        for(int i=0; i<10; i++){
            System.out.printf("i : %d\n", i);
        }
        System.out.println("----------------------------------");

        // while 문
        // 주어진 조건식이 true 인 경우에 반복한다.
        // 조건식이 위에 있으므로 조건이 처음부터 거짓이면 한 번도 수행되지 않는다.
        int a3 = 0;
        while(a3 < 10){
            System.out.printf("a3 : %d\n", a3);
            a3++;
        }

        int a4 = 10;
        while(a4 < 10){
            System.out.printf("a4 : %d\n", a4);
            a4++;
        }
        System.out.println("----------------------------------");

        // do while 문
        // 주어진 조건식이 true 인 경우에 반복한다.
        // 조건식이 아래에 있으므로 조건이 처음부터 거짓이라도 한 번은 수행된다.
        int a5 = 0;
        do {
            System.out.printf("a5 : %d\n", a5);
            a5++;
        } while(a5 < 10);
        System.out.println("----------------------------------");

        // 조건식이 처음부터 거짓인 상황
        int a6 = 10;
        do {
            System.out.printf("a6 : %d\n", a6);
        } while (a6 < 10);
    }git
}
