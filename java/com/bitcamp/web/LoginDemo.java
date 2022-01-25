package com.bitcamp.web;

import java.util.Scanner;

public class LoginDemo {
    static String id = "";
    static String pw = "";
    static String name = "";
    public static void main(String[] args) {

        HelloApp helloApp = new HelloApp();
        Scanner scanner = new Scanner(System.in);
        String webSite = "com";
        System.out.println(webSite);
        System.out.println("Input ID : ");
        System.out.println("Input PW : ");
        System.out.println("Input Name : ");
        id = scanner.next();
        pw = scanner.next();
        name = scanner.next();
        System.out.print("Output : ");
        String result = helloApp.hello(id, pw, name);
        System.out.println(result);
    }
}
