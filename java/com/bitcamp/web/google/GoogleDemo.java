/**
 * packageName: com.bitcamp.web.google
 * fileName        : GoogleDemo
 * author           : kimjinyeong
 * date               : 2022-01-25
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         kimjinyeong        최초 생성
 */

package com.bitcamp.web.google;

import java.util.Scanner;

public class GoogleDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GoogleApp googleApp = new GoogleApp();
        System.out.println(GoogleApp.title);
        System.out.print("Google 검색 또는 URL 입력 : ");
        String search = scanner.next();
        String result = googleApp.google(search);
        System.out.println(result);

    }
}
