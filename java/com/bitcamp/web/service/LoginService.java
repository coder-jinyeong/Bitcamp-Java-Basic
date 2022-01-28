/**
 * packageName: com.bitcamp.web.service
 * fileNa     : LoginService
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
import com.bitcamp.web.domain.LoginDTO;

public class LoginService {
    public String getLogin(LoginDTO login) {

        String res = String.format("ID : %s, PW : %s, Name : %s",login.getId(), login.getPw(), login.getName() );
        String res1;
        res1 = (login.getPw().equals(GoogleDTO.GOOGLE_TITLE)) ? String.format("\n%s 님의 비번 %s 이 맞습니다. 로그인 성공 ", login.getName(), login.getPw())
                :String.format("\n%s 님의 비번 %s 이 틀립니다. 로그인 실패 ", login.getName(), login.getPw());
        return res + res1;

    }
}
