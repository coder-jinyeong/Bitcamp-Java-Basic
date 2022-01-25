package com.bitcamp.web;

import java.util.Scanner;

public class LoginDemoTest {
    public static void main(String[] args) {
        LoginAppTest loginAppTest = new LoginAppTest();
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID : ");
        System.out.println("PW : ");
        System.out.println("Name : ");
        String id = scanner.next();
        String pw = scanner.next();
        String name = scanner.next();
        String result = loginAppTest.login(id, pw, name);
        System.out.println(result);

    }
}
