package com.bitcamp.web.login;
/**
 * 아이디 , 비번, 이름 입력받기
 * */

public class LoginApp {
    public static String webSite = "Naver";
    String id;
    String pw;
    String name;
    public String login(String id, String pw, String name){
        this.id = id;
        this.pw = pw;
        this.name = name;
        return String.format("ID : %s, PW : %s, Name : %s",this.id, this.pw, this.name );
    }
}
