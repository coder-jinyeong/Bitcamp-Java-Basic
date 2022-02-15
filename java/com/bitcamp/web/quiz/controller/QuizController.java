/**
 * packageName: com.bitcamp.web.quiz.controller
 * fileNa     : QuizController
 * au         : kimjinyeong
 * date       : 2022-02-09
 * desc       :
 * class variable :
 * instance variable :
 * area variable :
 * parameter :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-09         kimjinyeong    최초 생성
 */

package com.bitcamp.web.quiz.controller;

import com.bitcamp.web.quiz.service.*;

import java.util.Scanner;

public class QuizController {
    public void execute(Scanner scanner){
        Feb06Service feb06Service = new Feb06ServiceImpl();
        Feb07Service feb07Service = new Feb07ServiceImpl();
        Feb08Service feb08Service = new Feb08ServiceImpl();
        Feb10Service feb10Service = new Feb10ServiceImpl();
        while (true){
            System.out.println("[서브메뉴]\n 0)Exit 1)2월6일 2)2월7일 3)2월8일 4)2월10일");
            switch (scanner.next()){
                case "0":
                    System.out.println("### Exit ###");
                    return;
                case "1":
                    String[] arr = {"권혜민",   "조현국",     "김진영",  "김한슬",  "서성민",
                            "정렬",     "해시",        "힙",   "완전탐색", "DP",
                            "스택",  "깊이우선탐색 ",  "그래프", "탐욕법", "이중탐색",
                            "큐",    "너비우선탐색"                        };
                    System.out.println("[소메뉴]\n 0.Exit \n1.팀별 과제 \n2.팀장이 맡은 과제 \n3.큐를 담당한 사람\n 4.팀원별 과제 수");
                    while (true) {
                        System.out.print("번호 입력 : ");
                        switch (scanner.next()) {
                            case "0":
                                System.out.println("시스템종료");
                                return;
                            case "1":
                                feb06Service.quiz1(arr);
                                break;
                            case "2":
                                feb06Service.quiz2(arr);
                                break;
                            case "3":
                                feb06Service.quiz3(arr);
                                break;
                            case "4":
                                feb06Service.quiz4(arr);
                                break;
                            case "5":
                                System.out.print("Q5. 입력한 과제의 팀원 인덱스를 추출하세요\n과제를 입력하세요 :  ");
                                String res = scanner.next();
                                feb06Service.quiz5(res,arr);
                                break;
                            default:
                                System.out.println("잘못 입력 하였습니다.");
                        }
                    }
                case "2":
                    while (true) {
                        String res = "";
                        System.out.println("메뉴를 선택하세요.\n" +
                                " 0.EXIT\n " +
                                "1.주사위\n " +
                                "2.가위바위보\n " +
                                "3.입력받은 두수 사이의 소수구하기\n" +
                                "4.입력받은 년도가 윤년인지 평년인지 판단하기\n" +
                                "5.임의로 입력받은 숫자 맞추기");
                        switch(scanner.next()){
                            case "0":
                                System.out.println("시스템종료");
                                return;
                            case "1":
                                System.out.println("주사위");
                                feb07Service.feb07();
                                break;
                            case "2":
                                System.out.println("2.가위바위보");
                                feb07Service.rps(scanner);
                                break;
                            case "3":
                                System.out.println(" 소수 구하기 ");
                                feb07Service.primeNumber(scanner);
                                break;
                            case "4":
                                feb07Service.leapYear(scanner);
                                break;
                            case "5":
                                res = feb07Service.numberGolf();
                                System.out.println(res);
                                break;
                            default:
                                System.out.println("잘못 입력하였습니다.");
                                break;
                        }
                    }
                case "3":
                    while (true) {
                        String res = "";
                        System.out.println("메뉴를 선택하세요.\n" +
                                "0.EXIT " +
                                "1. 구구단 " +
                                "2. 야구 " +
                                "3. 로또 " +
                                "4. 은행 " +
                                "5. 좌석 예약");
                        switch(scanner.next()){
                            case "0":
                                System.out.println("시스템종료");
                                return;
                            case "1":
                                feb08Service.dice(scanner);
                                break;
                            case "2":
                                feb08Service.baseball(scanner);
                                break;
                            case "3":
                                System.out.println("로또 번호 생성");
                                res = feb08Service.arrayLotto();
                                System.out.println(res);
                                break;
                            case "4":
                                feb08Service.quiz4(scanner);
                                break;
                            case "5":
                                System.out.println("좌석 예약");
                                feb08Service.book(scanner);
                                break;
                            default:
                                System.out.println("잘못 입력하였습니다.");
                        }
                    }
                case "4":
                    while(true){
                        String res = "";
                        System.out.println("메뉴를 선택하세요.\n" +
                                "0.EXIT " +
                                "1. 권혜민" +
                                "2. 서성민 " +
                                "3. 조현국 " +
                                "4. 김한슬 " +
                                "5. 김진영");
                        switch(scanner.next()){
                            case "0":
                                System.out.println("시스템종료");
                                return;
                            case "1":

                                break;
                            case "2":

                                break;
                            case "3":

                                break;
                            case "4":

                                break;
                            case "5":
                                res = feb10Service.rectangleStarPrint();
                                System.out.println(res);
                                res = feb10Service.triangleStarPrint();
                                System.out.println(res);
                                break;
                            default:
                                System.out.println("잘못 입력하였습니다.");
                        }

                    }

            }
        }
    }
}
