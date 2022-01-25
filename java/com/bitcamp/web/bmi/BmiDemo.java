/**
 * packageName: bmi
 * fileNa     : BmiDemo
 * au         : kimjinyeong
 * date       : 2022-01-25
 * desc       :
 * class variable :
 * instance variable :
 * area variable :
 * parameter :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         kimjinyeong    최초 생성
 */

package com.bitcamp.web.bmi;

import java.util.Scanner;

public class BmiDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BmiApp bmiApp = new BmiApp();
        System.out.println(BmiApp.Title);
        System.out.print("이름 : ");
        String name = scanner.next();
        System.out.print("신장 : ");
        double cm = scanner.nextDouble();
        System.out.print("체중 : ");
        double kg = scanner.nextDouble();
        String result = bmiApp.bmi(cm, kg, name);
        System.out.println(result);
    }
}
