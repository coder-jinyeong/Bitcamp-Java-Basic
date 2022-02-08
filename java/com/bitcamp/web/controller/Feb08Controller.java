/**
 * packageName: com.bitcamp.web.controller
 * fileNa     : Feb08Controller
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

package com.bitcamp.web.controller;

import com.bitcamp.web.service.Feb08Service;
import com.bitcamp.web.service.Feb08ServiceImpl;

import java.util.Random;
import java.util.Scanner;

public class Feb08Controller {
    /*
    1. 구구단
    2. 야구
    3. 로또
    4. 은행(bank)
    5. 예약(book)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Feb08Service service = new Feb08ServiceImpl();
        while (true) {
            String res = "";
            System.out.println("메뉴를 선택하세요.\n" +
                    "0.EXIT " +
                    "1. 구구단 " +
                    "2. 야구 " +
                    "3. 로또 " +
                    "4. 은행 " +
                    "5. 예약");
            switch(scanner.next()){
                case "0":
                    System.out.println("시스템종료");
                    return;
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    System.out.println("로또 번호 생성");
                    res = service.arrayLotto();
                    System.out.println(res);
                    break;
                case "4":
                    break;
                case "5":
                    break;
                default:
                    System.out.println("잘못 입력하였습니다.");
            }
        }
    }
}
