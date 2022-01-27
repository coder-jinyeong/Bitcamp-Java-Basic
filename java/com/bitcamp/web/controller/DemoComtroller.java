/**
 * packageName: com.bitcamp.web.controller
 * fileNa     : DemoComtroller
 * au         : kimjinyeong
 * date       : 2022-01-27
 * desc       :
 * class variable :
 * instance variable :
 * area variable :
 * parameter :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-27         kimjinyeong    최초 생성
 */

package com.bitcamp.web.controller;

import java.util.Scanner;

public class DemoComtroller {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        for(int i = 1; i < 3 ; i ++){
        System.out.println("메뉴 선택");
        String menu = "1.BMI 2.CALC 3.SEARCH 4.GRADE 5.LOGIN";
        System.out.println(menu);
        String select = scanner.next();
        System.out.print("선택한 메뉴 : ");
        String answer = "";
        switch(select) {
            case "1": answer = "BMI";break;
            case "2": answer = "CALC";break;
            case "3": answer = "SEARCH";break;
            case "4": answer = "GRADE";break;
            case "5": answer = "LOGIN";break;
            default: answer = "잘못 입력 하였습니다.";break;
        }
            System.out.println(answer);
        }


    }
}
