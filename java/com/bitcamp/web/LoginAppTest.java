package com.bitcamp.web;

public class LoginAppTest {
    String id = "";
    String pw = "";
    String name = "";

    public String login(String paraid, String parapw, String paraname){
        id = paraid;
        pw = parapw;
        name = paraname;
        return "ID : " + id + " PW : " + pw + " Name : " + name ;
    }
}
