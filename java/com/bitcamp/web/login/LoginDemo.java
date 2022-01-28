package com.bitcamp.web.login;

/**
 * 아이디 , 비번, 이름 입력받기
 * */
import java.util.Scanner;

public class LoginDemo {
    public String excute(String id, String pw, String name) {
        LoginApp loginApp = new LoginApp();
        return loginApp.login(id, pw, name);
    }
}
