/**
 * packageName: com.bitcamp.web.google
 * fileName        : GoogleApp
 * author           : kimjinyeong
 * date               : 2022-01-25
 * class variable : title
 * instance variable : search
 * area variable : search
 * parameter variable : search
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         kimjinyeong        최초 생성
 */

package com.bitcamp.web.google;

public class GoogleApp {
    public static String GOOGLE_TITLE = "Google";
    private String search;

    public String google(String search){
        this.search = search;
        return String.format("검색한 내용 : %s", search);
    }

}
