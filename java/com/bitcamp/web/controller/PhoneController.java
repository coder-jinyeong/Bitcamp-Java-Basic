/**
 * packageName: com.bitcamp.web.controller
 * fileNa     : PhoneController
 * au         : kimjinyeong
 * date       : 2022-02-08
 * desc       :
 * class variable :
 * instance variable :
 * area variable :
 * parameter :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08         kimjinyeong    최초 생성
 */

package com.bitcamp.web.controller;

import com.bitcamp.web.service.PhoneService;
import com.bitcamp.web.service.PhoneServiceImpl;

import java.util.Scanner;

public class PhoneController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneService service = new PhoneServiceImpl();
        while(true){
            System.out.println("Menu : 0.Exit" +
                    " 1.집전화 2.휴대폰 3.아이폰 4.갤럭시노트");
            switch(scanner.nextInt()){
                case 0:
                    System.out.println("Exit");
                    return;
                case 1:
                    System.out.println("집전화");
                    service.usePhone(scanner);
                    break;
                case 2:
                    System.out.println("휴대폰");
                    service.useCelPhone(scanner);
                    break;
                case 3:
                    System.out.println("아이폰");
                    service.useIPhone(scanner);
                    break;
                case 4:
                    System.out.println("갤럭시노트");
                    service.useGalPhone(scanner);
                    break;
                default:
                    System.out.println("잘못 입력 하였습니다.");
            }
        }
    }
}
