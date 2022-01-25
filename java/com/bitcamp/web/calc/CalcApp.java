package com.bitcamp.web.calc;

/**
 * 숫자 2개와 연산자 1개를 받아서 계산하는 계산기를 코딩하시오
 * */

public class CalcApp {
    public static String cal = "계산기";
    int num1;
    int num2;
    String opcode;

    public String calc(int num1, String opcode, int num2){
        this.num1 = num1;
        this.num2 = num2;
        this.opcode = opcode;
        int sum = num1 + num2;
        return String.format("%d %s %d = %d" , this.num1, this.opcode, this.num2, sum);
    }
}
