package com.bitcamp.web.oop.service;

import com.bitcamp.web.oop.domain.CelPhone;
import com.bitcamp.web.oop.domain.GalPhone;
import com.bitcamp.web.oop.domain.IPhone;
import com.bitcamp.web.oop.domain.Phone;

public interface PhoneService {
    void usePhone(Phone phone);
    void useCelPhone(CelPhone celPhone);
    void useIPhone(IPhone iPhone);
    void useGalPhone(GalPhone galPhone);
}
