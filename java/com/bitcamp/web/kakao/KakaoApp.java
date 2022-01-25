package com.bitcamp.web.kakao;
/**
 *  전화번호와 메시지를 받아서 전송하는 어플을 만드시오.
 *  번호 - String telno
 *  메시지 - String message
 * */
public class KakaoApp {
    public static String App = "Kakao";
    String telno;
    String message;
    public String kakao(String telno, String message){
        this.telno = telno;
        this.message = message;
        return String .format("전화번호 : %s\n메시지 : %s",this.telno, this.message);
    }
}
