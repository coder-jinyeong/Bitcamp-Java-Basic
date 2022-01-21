package com.bitcamp.web;

import java.util.Scanner;

public class HelloDemo {
    public static void main(String[] args) {

        HelloApp helloApp = new HelloApp();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input ID : ");
        System.out.println("Input PW : ");
        System.out.println("Input Name : ");
        String id = scanner.next();
        String pw = scanner.next();
        String name = scanner.next();
        System.out.print("Output : ");
        String result = helloApp.hello(id, pw, name);
        System.out.println(result);
    }
}
