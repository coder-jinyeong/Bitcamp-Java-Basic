/**
 * packageName: com.bitcamp.web.calc
 * fileNa     : CalcDTO
 * au         : kimjinyeong
 * date       : 2022-01-28
 * desc       :
 * class variable :
 * instance variable :
 * area variable :
 * parameter :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-28         kimjinyeong    최초 생성
 */

package com.bitcamp.web.auth.domain;

public class CalcDTO {
    public static String CALC_TITLE= "계산기";
    private int num1;
    private int num2;
    private String opcode;

    public int getNum1(){
        return num1;
    }
    public void setNum1(int num1){
        this.num1 = num1;
    }
    public int getNum2(){
        return num2;
    }
    public void setNum2(int num2){
        this.num2 = num2;
    }
    public String getOpcode(){
        return opcode;
    }
    public void setOpcode(String opcode){
        this.opcode = opcode;
    }

}
