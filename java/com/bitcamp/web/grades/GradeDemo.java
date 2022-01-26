/**
 * packageName: com.bitcamp.web.grades
 * fileNa     : GradeDemo
 * au         : kimjinyeong
 * date       : 2022-01-26
 * desc       :
 * 사용자로부터
 * 이름 [          ]
 * 국어 [          ]
 * 영어 [          ]
 * 수학 [          ]
 * 을 차례대로 입력 받아서
 * ########## 성적표 ########
 * 이름: 홍길동
 * > 국어: 80점
 * > 영어: 79점
 * > 수학: 80점
 * 총점: 239점
 * 평균(정수): 79점
 * 합격여부: 합격(불합격)
 * #######################
 * 출력되는 프로그램을 작성
 * 단, 합격 / 불합격 기준은
 * 평균 60점 이상이면 합격
 *
 * class variable :
 * instance variable :
 * area variable :
 * parameter :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-26         kimjinyeong    최초 생성
 */

package com.bitcamp.web.grades;

import java.util.Scanner;

public class GradeDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GradeApp gradeApp = new GradeApp();
        System.out.println(GradeApp.GRADE_TITLE);
        String name;
        int kor;
        int eng;
        int math;
        int total = 0;
        int avg = 0;
        String pass = "";
        System.out.print("이름 : ");
        name = scanner.next();
        System.out.print("국어 : ");
        kor = scanner.nextInt();
        System.out.print("영어 : ");
        eng = scanner.nextInt();
        System.out.print("수학 : ");
        math = scanner.nextInt();
        String res = gradeApp.gd(name, kor, eng, math);
        System.out.println(res);
    }
}
