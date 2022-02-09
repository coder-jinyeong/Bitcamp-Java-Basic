/**
 * packageName: com.bitcamp.web.service
 * fileNa     : StudentService
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

package com.bitcamp.web.auth.service;

import com.bitcamp.web.auth.domain.*;

public interface StudentService {
    String bmi(BmiDTO bmi);
    String calc(CalcDTO calc);
    String google(GoogleDTO google);
    String grade(GradeDTO grade);
    String login(LoginDTO login);
}
