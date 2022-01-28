/**
 * packageName: com.bitcamp.web.domain
 * fileNa     : LoginDTO
 * au         : kimjinyeong
 * date       : 2022-01-28
 * desc       :
 * class variable :
 * instance variable :
 * area variable :
 * parameter :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-28         kimjinyeong    최초 생성
 */

package com.bitcamp.web.domain;

public class LoginDTO {
    public static String LOGIN_TITLE = "LOGIN";
    public static String PASSWORD = "abc";
    private String id;
    private String pw;
    private String name;

    public String getId(){return id;}
    public void setId(String id){this.id = id;}
    public String getPw(){return pw;}
    public void setPw(String pw){this.pw = pw;}
    public String getName(){return name;}
    public void setName(String Name){this.name = name;}

}
