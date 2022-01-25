package com.bitcamp.web.kakao;
/**
 *  전화번호와 메시지를 받아서 전송하는 어플을 만드시오.
 *  번호 - String telno
 *  메시지 - String message
 * */

import java.util.Scanner;

public class KakaoDemo {
    public static void main(String[] args) {
        KakaoApp kakaoApp = new KakaoApp();
        Scanner scanner = new Scanner(System.in);
        System.out.println(KakaoApp.App);
        System.out.print("전화번호를 입력하세요 : ");
        String telno = scanner.next();
        System.out.print("메시지를 입력하세요 : ");
        String message = scanner.next();
        String result = kakaoApp.kakao(telno, message);
        System.out.println(result);

    }
}
