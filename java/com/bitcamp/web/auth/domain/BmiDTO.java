/**
 * packageName: bmi
 * fileNa     : BmiApp
 * au         : kimjinyeong
 * date       : 2022-01-25
 * desc       : BMI 만들기
 * class variable : Title
 * instance variable : cm, kg, name
 * area variable : m, val, sum, sum2, res
 * parameter : cm, kg, name
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         kimjinyeong    최초 생성
 */

package com.bitcamp.web.auth.domain;

public class BmiDTO {
    public static String BMI_TITLE = "BMI";
    private double tall;
    private double weight;
    private String name;

    public static String getBmiTitle() {
        return BMI_TITLE;
    }

    public static void setBmiTitle(String bmiTitle) {
        BMI_TITLE = bmiTitle;
    }

    public double getTall() {
        return tall;
    }

    public void setTall(double tall) {
        this.tall = tall;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

