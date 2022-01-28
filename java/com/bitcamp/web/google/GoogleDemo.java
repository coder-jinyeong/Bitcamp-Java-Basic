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
    public String excute(String search) {
        GoogleApp googleApp = new GoogleApp();
        return googleApp.google(search);

    }
}
