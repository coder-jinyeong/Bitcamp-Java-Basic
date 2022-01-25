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

package com.bitcamp.web.bmi;

public class BmiApp {
    public static String Title = "나의 체질량지수";
    private double cm;
    private double kg;
    private String name;
    public String bmi(double cm, double kg, String name){
        this.cm = cm;
        this.kg = kg;
        this.name = name;
        double m = cm / 100;
        double val = Math.pow(m,2);
        String sum2 ;
        double sum = kg / val;
        if(sum <= 18.5){
            sum2 = "저체중";
        }
        else if(18.5 < sum && sum <  23){
            sum2 = "정상";
        }
        else if(23 < sum && sum < 25){
            sum2 = "과체중";
        }
        else{
            sum2 = "비만";
        }

        String res = "%s 님의 BMI 지수 : %.2f\n%s 님은 %s 입니다.";
        return String.format(res, name, sum, name, sum2);
    }
}
