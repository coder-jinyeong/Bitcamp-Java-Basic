/**
 * packageName: Naver
 * fileNa     : NaverApp
 * au         : kimjinyeong
 * date       : 2022-01-25
 * desc       :
 * class variable : Title
 * instance variable :id,pw
 * area variable : res
 * parameter : id, pw
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         kimjinyeong    최초 생성
 */

package com.bitcamp.web.naver;

public class NaverApp {
    public static String Title = "com";
    private String id;
    private String pw;
    public String naver(String id, String pw){
        this.id = id;
        this.pw = pw;
        String res = "아이디 : %s\n비밀번호 : %s";
        return String.format(res, id, pw);

    }
}
