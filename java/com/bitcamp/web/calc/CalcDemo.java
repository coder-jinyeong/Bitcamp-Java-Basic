package com.bitcamp.web.calc;

/**
 * 숫자 2개와 연산자 1개를 받아서 계산하는 계산기를 코딩하시오
 * */

import java.util.Scanner;

public class CalcDemo {
    public String excute(int num1, String opcode, int num2) {
        CalcApp calcApp = new CalcApp();
        return calcApp.calc(num1,opcode,num2);


    }
}
