package com.bitcamp.web.login;

/**
 * 아이디 , 비번, 이름 입력받기
 * */
import java.util.Scanner;

public class LoginDemo {
    public static void main(String[] args) {
        LoginApp loginApp = new LoginApp();
        Scanner scanner = new Scanner(System.in);
        System.out.println(LoginApp.WEBSITE);
        System.out.print("아이디를 입력하세요 : ");
        String id = scanner.next();
        System.out.print("비밀번호를 입력하세요 : ");
        String pw = scanner.next();
        System.out.print("이름을 입력하세요 : ");
        String name = scanner.next();
        String result = loginApp.login(id, pw, name);
        System.out.println(result);
    }
}
