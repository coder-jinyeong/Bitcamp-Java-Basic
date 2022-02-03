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

import com.bitcamp.web.domain.GradeDTO;
import com.bitcamp.web.service.GradeService;

import java.util.Scanner;

public class TempController {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] arr = {"권혜민", "서성민", "조현국", "김한슬", "김진영",
                        "해시", "DFS", "BFS", "정렬", "스택", "큐", "힙",
                        "그래프", "완전탐색", "탐욕법", "동적계획법", "이분탐색","","","" };
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + ":" + arr[i + 5] + ", " + arr[i + 10] +
                   ", " + arr[i + 15]);
        }
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






