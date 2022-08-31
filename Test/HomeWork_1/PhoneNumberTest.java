package Test.HomeWork_1;

import HomeWork_1.PhoneNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PhoneNumberTest {
    @Test
    public void numOr(){
        assertEquals("(532) 163-3699", PhoneNumber.createPhoneNumber(new int[]{5,3,2,1,6,3,3,6,9,9}));
    }
}