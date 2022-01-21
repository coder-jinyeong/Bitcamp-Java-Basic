package com.bitcamp.web;

public class LoginApp2 {
    private String id = "";
    private String pw = "";
    private String name = "";
    public static String webSite = "Naver";
    public String login(String param_id, String param_pw, String param_name ) {
        id = param_id;
        pw = param_pw;
        name = param_name;
        return "ID : " + id + ", PW : " + pw + ", Name : " + name ;
    }
}
