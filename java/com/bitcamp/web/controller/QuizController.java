/**
 * packageName: com.bitcamp.web.controller
 * fileNa     : TempController
 * au         : kimjinyeong
 * date       : 2022-02-03
 * desc       :
 * class variable :
 * instance variable :
 * area variable :
 * parameter :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-03         kimjinyeong    최초 생성
 */

package com.bitcamp.web.controller;

import com.bitcamp.web.service.QuizService;
import com.bitcamp.web.service.QuizServiceImpl;

import java.util.Scanner;

public class QuizController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuizServiceImpl service = new QuizServiceImpl();
        String[] arr = {"권혜민", "조현국", "김진영", "김한슬", "서성민",
                "정렬", "해시", "힙", "완전탐색", "DP",
                "스택", "깊이우선탐색", "그래프", "탐욕법", "이중탐색",
                "큐", "너비우선탐색"};
        while (true) {
            System.out.print("번호 입력 : ");
            switch (scanner.next()) {
                case "0":
                    System.out.println("시스템종료");
                    return;
                case "1":
                    service.quiz1(arr);
                    break;
                case "2":
                    service.quiz2(arr);
                    break;
                case "3":
                    service.quiz3(arr);
                    break;
                case "4":
                    service.quiz4(arr);
                    break;
                case "5":
                    System.out.print("Q5. 입력한 과제의 팀원 인덱스를 추출하세요\n과제를 입력하세요 :  ");
                    String res = scanner.next();
                    service.quiz5(res,arr);
                    break;
                default:
                    System.out.println("잘못 입력 하였습니다.");
            }
        }


    }
}













