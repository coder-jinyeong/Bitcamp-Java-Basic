package com.bitcamp.web.login;
/**
 * 아이디 , 비번, 이름 입력받기
 * */

public class LoginApp {
    public static String WEBSITE = "com";
    String id;
    String pw;
    String name;
    static String PASSWORD = "abc";

    public String login(String id, String pw, String name){
        this.id = id;
        this.pw = pw;
        this.name = name;
        String res = String.format("ID : %s, PW : %s, Name : %s",this.id, this.pw, this.name );
        String res1;
        /*
        if(PASSWORD.equals(pw)){
            res1 = String.format("\n%s 님의 비번 %s 이 맞습니다. 로그인 성공 ", this.name, this.pw);
        }
        else{
            res1 = String.format("\n%s 님의 비번 %s 이 틀립니다. 로그인 실패 ", this.name, this.pw);
        }
        */

        /*
        switch(pw){
            case "abc" : res1 = String.format("\n%s 님의 비번 %s 이 맞습니다. 로그인 성공 ", this.name, this.pw);
                break;
            default:
                 res1 = String.format("\n%s 님의 비번 %s 이 틀립니다. 로그인 실패 ", this.name, this.pw);
        }
         */
        res1 = (pw.equals(PASSWORD)) ? String.format("\n%s 님의 비번 %s 이 맞습니다. 로그인 성공 ", this.name, this.pw)
                :String.format("\n%s 님의 비번 %s 이 틀립니다. 로그인 실패 ", this.name, this.pw);
        return res + res1;
    }
}
