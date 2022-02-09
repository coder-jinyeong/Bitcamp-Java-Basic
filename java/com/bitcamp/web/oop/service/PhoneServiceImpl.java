/**
 * packageName: com.bitcamp.web.service
 * fileNa     : PhoneServiceImpl
 * au         : kimjinyeong
 * date       : 2022-02-08
 * desc       :
 * class variable :
 * instance variable :
 * area variable :
 * parameter :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08         kimjinyeong    최초 생성
 */

package com.bitcamp.web.oop.service;

import com.bitcamp.web.oop.domain.CelPhone;
import com.bitcamp.web.oop.domain.GalPhone;
import com.bitcamp.web.oop.domain.IPhone;
import com.bitcamp.web.oop.domain.Phone;

public class PhoneServiceImpl implements PhoneService{


    @Override
    public void usePhone(Phone phone) {
        System.out.println(phone.toString());
    }

    @Override
    public void useCelPhone(CelPhone celPhone) {
        System.out.println(celPhone.toString());
    }

    @Override
    public void useIPhone(IPhone iPhone) {
        System.out.println(iPhone.toString());
    }

    @Override
    public void useGalPhone(GalPhone galPhone) {
        System.out.println(galPhone.toString());
    }
}
