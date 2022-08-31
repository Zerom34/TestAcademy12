package Test.HomeWork_1;

import HomeWork_1.HomeWork1_4_5;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HomeWork1_4_5Test {
    @Test
    public void numOr(){ assertEquals("5 - это не буква", HomeWork1_4_5.numOr("5")); }
    @Test
    public void numOr2(){
        assertEquals("f - это буква",HomeWork1_4_5.numOr("f"));
    }
    @Test
    public void numOr3(){
        assertEquals("5a - это не буква",HomeWork1_4_5.numOr("5a"));
    }
    @Test
    public void numOrRus(){
        assertEquals("Ф - это буква",HomeWork1_4_5.numOr("Ф"));
    }
    @Test
    public void numOrRus2(){
        assertEquals("А - это буква",HomeWork1_4_5.numOr("А"));
    }
}