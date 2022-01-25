package com.bitcamp.web;

public class CalcAppTest {
    public static String webSite = "Naver";
    private int num1 = 0;
    private int num2 = 0;
    private String opcode = "";

    public String calc(int paranum1, String paraopcode, int paranum2){
        num1 = paranum1;
        num2 = paranum2;
        opcode = paraopcode;
        int sum = num1 + num2;
        return num1 + " " + opcode + " " + num2 + " = " + sum ;
    }

}
