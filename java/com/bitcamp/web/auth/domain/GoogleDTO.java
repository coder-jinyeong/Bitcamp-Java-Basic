/**
 * packageName: com.bitcamp.web.google
 * fileNa     : GoogleDTO
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

package com.bitcamp.web.auth.domain;

public class GoogleDTO {
    public static String GOOGLE_TITLE = "Google";
    private String search;
    public String getSearch(){
        return search;
    }
    public void setSearch(String search){
        this.search = search;
    }
}
