/**
 * packageName: com.bitcamp.web.controller
 * fileNa     : Feb07Controller
 * au         : kimjinyeong
 * date       : 2022-02-07
 * desc       :
 * class variable :
 * instance variable :
 * area variable :
 * parameter :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-07         kimjinyeong    최초 생성
 */

package com.bitcamp.web.controller;

import com.bitcamp.web.service.Feb07Service;
import com.bitcamp.web.service.Feb07ServiceImpl;

import java.util.Scanner;
import java.util.Random;

public class Feb07Controller {
    /*
    1. 주사위
    2. 가위바위보
    3. 입력받은 두 수 사이의 있는 소수 구하기
    4. 입력받은 연도가 윤년인지 평년인지 판단하기
    5. 임의로 입력받은 숫자 맞추기
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Feb07Service service = new Feb07ServiceImpl();

        while (true) {
            String res = "";
            System.out.println("게임 종료 : 0, 주사위 : 1, 가위바위보 : 2, " +
                    "입력받은 두 수 사이의 있는 소수 구하기 : 3, 입력받은 연도가 윤년인지 평년인지 판단하기 : 4, " +
                    "임의로 입력받은 숫자 맞추기 : 5");
                switch(scanner.next()){
                    case "0":
                        System.out.println("시스템종료");
                        return;
                    case "1":
                        System.out.println("주사위");
                        service.feb07();
                        break;
                    case "2":
                        break;
                    case "3":
                        System.out.println(" 소수 구하기 ");
                        service.primeNumber(scanner);
                        break;
                    case "4":
                        service.leapYear(scanner);
                        break;
                    case "5":
                        res = service.quiz5();
                        System.out.println(res);
                        break;
                    default:
                        System.out.println("잘못 입력하였습니다.");
                }
        }
    }
}
