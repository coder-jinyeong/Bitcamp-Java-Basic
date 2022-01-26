package com.bitcamp.web.calc;

/**
 * 숫자 2개와 연산자 1개를 받아서 계산하는 계산기를 코딩하시오
 * */

public class CalcApp {
    public static String CALC_TITLE= "계산기";
    private int num1;
    private int num2;
    private String opcode;

    public String calc(int num1, String opcode, int num2){
        this.num1 = num1;
        this.num2 = num2;
        this.opcode = opcode;
        int res = 0;

        //switch(){}
        //for(){}
        //while(){}
        /*
        if(opcode.equals("+")){
            res = num1 + num2;
        }
        else if(opcode.equals("-")) {
            res = num1 - num2;
        }
        else if(opcode.equals("*")) {
            res = num1 * num2;
        }
        else if(opcode.equals("/")) {
            res = num1 / num2;
        }
        else{
            res = 0;
        }
        */
        switch(opcode){
            case "+" : res = num1 + num2; break;
            case "-" : res = num1 - num2; break;
            case "*" : res = num1 * num2; break;
            case "/" : res = num1 / num2; break;
        }
        String result = String.format("%d %s %d = %d" , this.num1, this.opcode, this.num2, res);
        return result;
    }
}
