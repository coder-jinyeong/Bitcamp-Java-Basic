/**
 * packageName: com.bitcamp.web.service
 * fileNa     : Feb08ServiceImpl
 * au         : kimjinyeong
 * date       : 2022-02-08
 * desc       :
 * class variable :
 * instance variable :
 * area variable :
 * parameter :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08         kimjinyeong    최초 생성
 */

package com.bitcamp.web.service;

import java.util.Random;

public class Feb08ServiceImpl implements Feb08Service{
    Random rand = new Random();

    @Override
    public String arrayLotto() {
        String res = "";
        int [] lotto = new int[6];
        for(int i = 0; i < 6 ; i++){
            lotto[i] = rand.nextInt(45) + 1;
            for(int j = 0; j < i; j++){
                if(lotto[i] == lotto[j])
                    i--;
                    break;
            }
        }
        for(int i = 0; i < 6; i++){
            res += String.format(lotto[i] + " ");
        }
        return res;
    }
}
