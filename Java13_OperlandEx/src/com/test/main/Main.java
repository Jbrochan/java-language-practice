package com.test.main;
g
public class Main {
    public static void main(String[] args){
        // 문제1
        // 다음 변수에 저장되어 있는 값이 짝수면 "짝수"를
        // 홀수면 "홀수"를 결과하는 3항 연산 식을 작성하세요.
        int num1 = 123;
        String result = (num1 % 2 ) == 1 ? "홀수" : "짝수";
        System.out.printf("answer : %s\n", result);

        // 문제2
        // 다음 변수에 저장되어 있는 값을 십의 자리 이하를 버리는
        // 코드를 작성하여 출력한다.
        // 예) 421 -> 400
        int num2 = 421;
        String num2ToString = Integer.toString(num2);

        char[] num2ToCharArr = num2ToString.toCharArray();
        num2ToCharArr[num2ToString.length()-1]  = '0';
        num2ToCharArr[num2ToString.length()-2] = '0';

        String stringToNum2 = new String(num2ToCharArr);
        int num2Result = Integer.parseInt(stringToNum2);
        System.out.printf("answer : %d\n", num2Result);

        // 문제3
        // 다음 변수에 저장되어 있는 값을 각 자리별로 뜯어내어 출력한다.
        // 예) 123
        // 1
        // 2
        // 3
        int num3 = 123;
        String num3ToString = Integer.toString(num3);
        char[] num3ToCharArr = num3ToString.toCharArray();
        for(int i=0; i<num3ToCharArr.length; i++){
            System.out.printf("answer %c\n", num3ToCharArr[i]);
        }

        // 문제4)
        // 주어진 화씨 온도를 섭씨 온도로 계산한다.
        // 섭씨온도 = 5 / 9 x (회씨온도 - 32)
        int num4 = 100;
        double answer4 = 5.0 / 9 * (num4 - 32);
        System.out.printf("answer : %f\n", answer4);

        // 문제5)
        // 다음에 주어진 대문자 알파벳을 소문자로 바꿔서 출력한다.
        // 대문자 A는 65이고, 소문자 a는 정수로 97이다.
        char upper = 'A';
        char lower = (char)((int)upper+32);
        System.out.printf("answer : %c\n", lower);
    }
}
