/**
 * packageName: com.bitcamp.web.controller
 * fileNa     : Democontroller2
 * au         : kimjinyeong
 * date       : 2022-01-27
 * desc       :
 * class variable :
 * instance variable :
 * area variable :
 * parameter :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-27         kimjinyeong    최초 생성
 */

package com.bitcamp.web.controller;

import com.bitcamp.web.domain.BmiDTO;
import com.bitcamp.web.service.*;
import com.bitcamp.web.domain.CalcDTO;
import com.bitcamp.web.domain.GoogleDTO;
import com.bitcamp.web.domain.GradeDTO;
import com.bitcamp.web.service.GoogleService;
import com.bitcamp.web.domain.LoginDTO;
import com.bitcamp.web.service.LoginService;

import java.util.Scanner;

public class Democontroller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BmiDTO bmi = new BmiDTO();
        BmiService bmiService = new BmiService();
        CalcDTO calc = new CalcDTO();
        CalcService calcService = new CalcService();
        GoogleDTO google = new GoogleDTO();
        GoogleService googleService = new GoogleService();
        GradeDTO grade = new GradeDTO();
        GradeService gradeService = new GradeService();
        LoginDTO login = new LoginDTO();
        LoginService loginService = new LoginService();
        while (true) {
            String res = "";
            System.out.println("[ Menu ]\n 0. Exit 1. BMI 2. CALC 3. GOOGLE 4. GRADE 5. LOGIN");
            switch (scanner.next()){
                case "0" : System.out.println("Exit");
                    return;
                case "1" :
                    System.out.println(BmiDTO.BMI_TITLE + "\n키 몸무게 이름");
                    bmi.setCm(scanner.nextDouble());
                    bmi.setKg(scanner.nextDouble());
                    bmi.setName(scanner.next());
                    res = bmiService.getBmi(bmi);
                    break;
                case "2" :
                    System.out.println(CalcDTO.CALC_TITLE + "\n숫자1, 연산자, 숫자2");
                    calc.setNum1(scanner.nextInt());
                    calc.setOpcode(scanner.next());
                    calc.setNum2(scanner.nextInt());
                    res = calcService.getCalc(calc);
                    break;
                case "3" :
                    System.out.println(GoogleDTO.GOOGLE_TITLE + "\n검색");
                    google.setSearch(scanner.next());
                    res = googleService.getGoogle(google);
                    break;
                case "4" :
                    System.out.println(GradeDTO.GRADE_TITLE + "\n이름, 국어, 영어, 수학");
                    grade.setName(scanner.next());
                    grade.setKor(scanner.nextInt());
                    grade.setEng(scanner.nextInt());
                    grade.setMath(scanner.nextInt());
                    res = gradeService.getGrade(grade);
                    break;
                case "5" :
                    System.out.println(LoginDTO.LOGIN_TITLE + "\nID, PW, Name");
                    login.setId(scanner.next());
                    login.setPw(scanner.next());
                    login.setName(scanner.next());
                    res = loginService.getLogin(login);
                    break;
                default : System.out.println("Wrong Number");
                    break;
            }
            System.out.println(res);
        }
    }
}
