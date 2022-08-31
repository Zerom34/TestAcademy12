package Test.HomeWork_1;

import HomeWork_1.HomeWork1_4_6;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HomeWork1_4_6Test {
    @Test
    public void whatYear(){assertEquals("1973 не високосный год", HomeWork1_4_6.whatYear(1973));}
    @Test
    public void whatYear2(){
        assertEquals("1974 не високосный год",HomeWork1_4_6.whatYear(1974));
    }
    @Test
    public void whatYear3(){
        assertEquals("1975 не високосный год",HomeWork1_4_6.whatYear(1975));
    }
    @Test
    public void whatYear4(){
        assertEquals("1976 високосный год",HomeWork1_4_6.whatYear(1976));
    }
    @Test
    public void whatYear5(){
        assertEquals("1977 не високосный год",HomeWork1_4_6.whatYear(1977));
    }
    @Test
    public void whatYearFor(){
        for (int i = 1901; i < 1904; i++){
            assertEquals(i + " не високосный год",HomeWork1_4_6.whatYear(i));
        }
    }
}