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

import java.util.Scanner;

public class QuizController {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] arr = {"권혜민", "조현국",   "김진영",    "김한슬",    "서성민",
                        "정렬",   "해시",        "힙",     "완전탐색",    "DP",
                        "스택",  "깊이우선탐색","그래프",    "탐욕법",    "이중탐색",
                        "큐",    "너비우선탐색"};
        while(true){
            System.out.print("번호 입력 : ");
            switch (scanner.next()){
                case "0":
                    System.out.println("시스템종료"); return;
                case "1":
                    quiz1(arr);break;
                case "2":
                    quiz2(arr);break;
                case "3":
                    quiz3(arr);break;
                case "4":
                    quiz4(arr);break;
                case "5":
                    quiz5(scanner, arr);break;
                default:
                    System.out.println("잘못 입력 하였습니다.");
            }
        }
    }

    private static void quiz5(Scanner scanner, String[] arr) {
        System.out.print("Q5. 입력한 과제의 인덱스를 추출하세요\n과제를 입력하세요 :  ");
        String sub = scanner.next();
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(sub))index = i % 5;
        }
        System.out.println("입력한 과제의 인덱스 : " + index);
    }

    private static void quiz4(String[] arr) {
        System.out.println("Q4. 팀원별 과제 수를 출력하세요 예 ) 권혜민(3개), 조현국(3개), 김진영(2개)," +
                        "김한슬(2개)" + "서성민(2개)");
        int count = 0;
        String countManager = "";
        for(int i = 0; i < 5; i++){
            count = (arr.length - (i + 1)) / 5;
            countManager += arr[i] + "(" + count + "개), ";
        }
        System.out.println(countManager + "\n");
    }

    private static void quiz3(String[] arr) {
        System.out.println("Q3. 큐를 담당한 사람을 출력하세요. 예 ) 큐를 담당한 사람 : 권혜민");
        String qManager = "";
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals("큐")){
                for(int j = 0; j < 3 ;j++){
                    qManager += arr[i - (j * 5)] + ",";
                }
                qManager += "를 담당한 사람 : " + arr[i -15];
            }
        }
        System.out.println(qManager + "\n");
    }

    private static void quiz2(String[] arr) {
        System.out.println("Q2.  팀장이 맡은 과제만 출력하세요 . 예시 ) 김진영 , 힙, 그래프");
        String zzang = "";
        for(int i = 0; i < arr.length; i++ ){
           if(arr[i].equals("김진영")){

                for(int j = 0; j < 3; j++){
                   zzang += arr[i] + ",";
                   i += 5;
                }
            }
        }
        System.out.println(zzang + "\n");
    }

    private static void quiz1(String[] arr) {
        System.out.println("Q1. 팀별 과제를 출력하세요 : ");
        String s = "";
        for(int i = 0; i < arr.length; i++){
            s += i + " : " + arr[i] + "\t";
            if(( i + 1 ) % 5 == 0) s += "\n";
        }
        System.out.println(s + "\n");
    }
}





/*
Scanner scanner = new Scanner(System.in);
        System.out.print("학생수를 입력하세요 : ");
        int count = scanner.nextInt();
        GradeDTO[] grades = new GradeDTO[count];
        GradeService gradeService = new GradeService();
        String res = "";
        for(int i  = 0; i < grades.length; i++){
            grades[i] = new GradeDTO();
            System.out.println(GradeDTO.GRADE_TITLE + "\n" + (i+1) +" 번째 학생 \n이름, 국어, 영어, 수학");
            grades[i].setName(scanner.next());
            grades[i].setKor(scanner.nextInt());
            grades[i].setEng(scanner.nextInt());
            grades[i].setMath(scanner.nextInt());
        }
        for(int i = 0; i <grades.length; i++){
            System.out.println((i+1) + " 번째 학생");
            res = gradeService.getGrade(grades[i]);
            System.out.println(res + "\n");

        }
 */






