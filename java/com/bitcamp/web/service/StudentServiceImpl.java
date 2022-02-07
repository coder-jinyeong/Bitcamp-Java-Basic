/**
 * packageName: com.bitcamp.web.service
 * fileNa     : StudentImpl
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

package com.bitcamp.web.service;

import com.bitcamp.web.domain.*;

public class StudentServiceImpl implements StudentService{
    @Override
    public String bmi(BmiDTO bmi) {
        double m = bmi.getCm() / 100;
        double val = Math.pow(m,2);
        double sum = bmi.getKg() / val;
        String sum2;
        if(sum <= 18.5){
            sum2 = "저체중";
        }
        else if(18.5 < sum && sum <  23){
            sum2 = "정상";
        }
        else if(23 < sum && sum < 25){
            sum2 = "과체중";
        }
        else{
            sum2 = "비만";
        }
        return String.format("%s 님의 BMI 지수 : %.2f\n%s 님은 %s 입니다.",bmi.getName(), sum, bmi.getName(),sum2);
    }

    @Override
    public String calc(CalcDTO calc) {
        int res = 0;
        switch(calc.getOpcode()){
            case "+" : res = calc.getNum1() + calc.getNum2(); break;
            case "-" : res = calc.getNum1() - calc.getNum2(); break;
            case "*" : res = calc.getNum1() * calc.getNum2(); break;
            case "/" : res = calc.getNum1() / calc.getNum2(); break;
        }
        String result = String.format("%d %s %d = %d" , calc.getNum1(), calc.getOpcode(), calc.getNum2(), res);
        return result;
    }

    @Override
    public String google(GoogleDTO google) {
        return String.format("검색한 내용 : %s",google.getSearch());
    }

    @Override
    public String grade(GradeDTO grade) {
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

    @Override
    public String login(LoginDTO login) {
        String res = String.format("ID : %s, PW : %s, Name : %s",login.getId(), login.getPw(), login.getName() );
        String res1;
        res1 = (login.getPw().equals(LoginDTO.PASSWORD)) ? String.format("\n%s 님의 비번 %s 이 맞습니다. 로그인 성공 ", login.getName(), login.getPw())
                :String.format("\n%s 님의 비번 %s 이 틀립니다. 로그인 실패 ", login.getName(), login.getPw());
        return res + res1;
    }
}
