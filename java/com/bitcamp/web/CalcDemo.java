package com.bitcamp.web;

import java.util.Scanner;

public class CalcDemo {

    public static void main(String[] args){

        CalcApp calcApp = new CalcApp();
        Scanner scanner = new Scanner(System.in);
        System.out.println(CalcApp.webSite);
        System.out.println("첫번째 숫자 : ");
        System.out.println("연산기호 : ");
        System.out.println("두번째 숫자 : ");
        int num1 = scanner.nextInt();
        String opcode = scanner.next();
        int num2 = scanner.nextInt();
        System.out.print("Output : ");
        String result = calcApp.calc(num1, opcode, num2);
        System.out.println(result);
    }
}
