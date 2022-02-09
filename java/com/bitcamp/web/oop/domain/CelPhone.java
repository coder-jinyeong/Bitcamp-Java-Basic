/**
 * packageName: com.bitcamp.web.domain
 * fileNa     : CelPhone
 * au         : kimjinyeong
 * date       : 2022-02-09
 * desc       :
 * class variable :
 * instance variable :
 * area variable :
 * parameter :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-09         kimjinyeong    최초 생성
 */

package com.bitcamp.web.oop.domain;

public class CelPhone extends Phone{
    private boolean portable;
    private String move;

    public CelPhone(String kind, String company, String move){
        super(kind, company);
        this.move = move;
    }
    public boolean isPortable() {
        return portable;
    }
    public void setPortable(boolean portable) {
        this.portable = portable;
    }
    public String getMove() {
        return move;
    }


    @Override
    public String toString() {
        return String.format("%s 인 %s 제품을 사용해서 %s 라고 %s 통화한다."
        ,super.getKind(), super.getCompany(), super.getCall(), move);
    }
}

