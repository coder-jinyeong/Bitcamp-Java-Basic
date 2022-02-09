/**
 * packageName: com.bitcamp.web.grade
 * fileNa     : GradeDTO
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

public class GradeDTO {
    public static String GRADE_TITLE = "성적표";
    private String name;
    private int kor;
    private int eng;
    private int math;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name ;
    }
    public int getKor(){
        return kor;
    }
    public void setKor(int kor){
        this.kor = kor;
    }
    public int getEng(){
        return eng;
    }
    public void setEng(int eng){
        this.eng = eng;
    }
    public int getMath(){
        return math;
    }
    public void setMath(int math){
        this.math = math;
    }

    public String toString(){
        return String.format("name %s, kor %d, eng %d, math %d ",name, kor, eng, math);
    }
}
