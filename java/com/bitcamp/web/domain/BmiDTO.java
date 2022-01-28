/**
 * packageName: bmi
 * fileNa     : BmiApp
 * au         : kimjinyeong
 * date       : 2022-01-25
 * desc       : BMI 만들기
 * class variable : Title
 * instance variable : cm, kg, name
 * area variable : m, val, sum, sum2, res
 * parameter : cm, kg, name
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         kimjinyeong    최초 생성
 */

package com.bitcamp.web.domain;

public class BmiDTO {
    public static String BMI_TITLE = "BMI";
    private double cm;
    private double kg;
    private String name;

    public double getKg(){
        return kg;
    }
    public void setKg(double kg){
        this.kg = kg;
    }
    public double getCm(){
        return cm;
    }
    public void setCm(double cm){
        this.cm = cm;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }


}

