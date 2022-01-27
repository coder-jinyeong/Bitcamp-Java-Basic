/**
 * packageName: com.bitcamp.web.grades
 * fileNa     : GradeApp
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

public class GradeApp {
    static String GRADE_TITLE = "성적표";
    private String name;
    private int kor;
    private int eng;
    private int math;

    public String getGrade(String name,int kor, int eng, int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        int total = kor + eng + math;
        int avg = total / 3;
        String pass = (60 <= avg) ? String.format("합격")
                : String.format("불학격");

        String res = String.format(" * ########## %s ########\n"
                        + " * 이름: %s\n"
                        + " * > 국어: %d점\n"
                        + " * > 영어: %d점\n"
                        + " * > 수학: %d점\n"
                        + " * 총점: %d점\n"
                        + " * 평균(정수): %d점\n"
                        + " * 합격여부: %s\n"
                        + " * #######################",
                GradeApp.GRADE_TITLE, name, kor, eng, math, total, avg, pass);

        return res ;
    }
}
