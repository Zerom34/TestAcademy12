package Test.HomeWork_2.loops;

import HomeWork_2.loops.HomeWork2_1_2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HomeWork2_1_2Test {
    @Test
    public void resultCheck() {
        assertEquals("5*3*2*1=30", HomeWork2_1_2.rev("5321"));
    }
    @Test
    public void resultCheck2() {
        assertEquals("4*2*5=40", HomeWork2_1_2.rev("425"));
    }
    @Test
    public void resultCheck3() {
        assertEquals("Введено не число", HomeWork2_1_2.rev("43a"));
    }
    @Test
    public void resultCheck4() {
        assertEquals("Введено не число", HomeWork2_1_2.rev("Привет"));
    }
    @Test
    public void resultCheck5() {
        assertEquals("Введено не целое число", HomeWork2_1_2.rev("99.2"));
    }
}