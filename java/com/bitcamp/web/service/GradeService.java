/**
 * packageName: com.bitcamp.web.grade
 * fileNa     : GradeService
 * au         : kimjinyeong
 * date       : 2022-01-28
 * desc       :
 * class variable :
 * instance variable :
 * area variable :
 * parameter :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-28         kimjinyeong    최초 생성
 */

package com.bitcamp.web.service;

import com.bitcamp.web.grade.GradeApp;
import com.bitcamp.web.domain.GradeDTO;

public class GradeService {
    public String getGrade(GradeDTO grade) {
        int total = grade.getKor() + grade.getEng() + grade.getMath();
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
                GradeDTO.GRADE_TITLE, grade.getName(), grade.getKor(), grade.getEng(), grade.getMath(), total, avg, pass);

        return res ;


    }
}
