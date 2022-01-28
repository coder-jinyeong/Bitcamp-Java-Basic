/**
 * packageName: com.bitcamp.web.google
 * fileNa     : CoogleService
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

package com.bitcamp.web.service;

import com.bitcamp.web.domain.GoogleDTO;

public class GoogleService {
    public String getGoogle(GoogleDTO google) {
        return String.format("검색한 내용 : %s",google.getSearch());

    }
}
