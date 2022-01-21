package com.bitcamp.web;



import java.sql.SQLOutput;
import java.util.Scanner;

public class LoginDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginApp2 loginApp = new LoginApp2();
        System.out.println(LoginApp2.webSite);
        System.out.println("ID : ");
        System.out.println("PW : ");
        System.out.println("Name : ");
        String id = scanner.next();
        String pw = scanner.next();
        String name = scanner.next();
        String result = loginApp.login(id, pw ,name);
        System.out.println(result);
    }
}
