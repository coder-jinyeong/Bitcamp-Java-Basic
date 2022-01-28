/**
 * packageName: com.bitcamp.web.calc
 * fileNa     : CalcService
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

package com.bitcamp.web.service;

import com.bitcamp.web.domain.CalcDTO;

public class CalcService {
    public String getCalc(CalcDTO calc){
        int res = 0;
        switch(calc.getOpcode()){
            case "+" : res = calc.getNum1() + calc.getNum2(); break;
            case "-" : res = calc.getNum1() - calc.getNum2(); break;
            case "*" : res = calc.getNum1() * calc.getNum2(); break;
            case "/" : res = calc.getNum1() / calc.getNum2(); break;
        }
        String result = String.format("%d %s %d = %d" , calc.getNum1(), calc.getOpcode(), calc.getNum2(), res);
        return result;
    }
}
