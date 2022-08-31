package Test.HomeWork_2.loops;

import HomeWork_2.loops.HomeWork2_1_3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HomeWork2_1_3Test {
    @Test
    public void resultCheck() {
        assertEquals("5.0^3=125.0", HomeWork2_1_3.stepOf(5,3));
    }
    @Test
    public void resultCheck2() {
        assertEquals("4.0^4=256.0", HomeWork2_1_3.stepOf(4,4));
    }
    @Test
    public void resultCheck3() {
        assertEquals("12.2^3=1815.8479999999995", HomeWork2_1_3.stepOf(12.2,3));
    }
    @Test
    public void resultCheck4() {
        assertEquals("18.0^5=1889568.0", HomeWork2_1_3.stepOf(18,5));
    }
    @Test
    public void resultCheck5() {
        assertEquals("7.5^2=56.25", HomeWork2_1_3.stepOf(7.5,2));
    }
}