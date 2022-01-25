package com.bitcamp.web;

import java.util.Scanner;

public class CalcDemoTest {
    public static void main(String[] args) {

        CalcApp calcApp = new CalcApp();
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하세요 : ");
        System.out.println("연산기호를 입력하세요 : ");
        System.out.println("두번째 숫자를 입력하세요 : ");
        int num1 = scanner.nextInt();
        String opcode = scanner.next();
        int num2 = scanner.nextInt();
        System.out.println("Output : ");
        String result = calcApp.calc(num1, opcode , num2);
        System.out.println(result);


    }
}
