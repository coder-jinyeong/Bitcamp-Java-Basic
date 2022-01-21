package com.bitcamp.web;

public class CalcApp {
    public static String webSite = "Calc.com";
    private int num1 = 0;
    private int num2 = 0;
    private String opcode = "";
    public String calc(int parannum1,  String paramopcode, int paramnum2){
        num1 = parannum1;
        num2 = paramnum2;
        opcode = paramopcode;
        int sum = num1 + num2;
        return num1 + " " + opcode + " " + num2 + " = " + sum;

    }
}
