/**
 * packageName: bmi
 * fileNa     : BmiDemo
 * au         : kimjinyeong
 * date       : 2022-01-25
 * desc       :
 * class variable :
 * instance variable :
 * area variable :
 * parameter :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         kimjinyeong    최초 생성
 */

package com.bitcamp.web.service;

import com.bitcamp.web.domain.BmiDTO;

public class BmiService {
    public String getBmi(BmiDTO bmi) {
        double m = bmi.getCm() / 100;
        double val = Math.pow(m,2);
        double sum = bmi.getKg() / val;
        String sum2;
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
        return String.format("%s 님의 BMI 지수 : %.2f\n%s 님은 %s 입니다.",bmi.getName(), sum, bmi.getName(),sum2);
    }
}
