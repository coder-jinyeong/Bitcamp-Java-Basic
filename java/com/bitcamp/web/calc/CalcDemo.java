package com.bitcamp.web.calc;

/**
 * 숫자 2개와 연산자 1개를 받아서 계산하는 계산기를 코딩하시오
 * */

import java.util.Scanner;

public class CalcDemo {
    public static void main(String[] args) {
        CalcApp calcApp = new CalcApp();
        Scanner scanner = new Scanner(System.in);
        System.out.println(CalcApp.CALC_TITLE);
        System.out.print("첫번째 숫자를 입력하세요 : ");
        int num1 = scanner.nextInt();
        System.out.print("연산자를 입력하세요 : ");
        String opcode = scanner.next();
        System.out.print("두번째 숫자를 입력하세요 : ");
        int num2 = scanner.nextInt();
        String result = calcApp.calc(num1, opcode, num2);
        System.out.print("연산 결과 : " + result);


    }
}
