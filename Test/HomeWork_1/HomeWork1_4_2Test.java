package Test.HomeWork_1;

import HomeWork_1.HomeWork1_4_2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HomeWork1_4_2Test {

    @Test
    public void aver(){
        assertEquals(5, HomeWork1_4_2.aver(5, 2, 11));
    }
    @Test
    public void aver_2(){
        assertEquals(5,HomeWork1_4_2.aver(2, 5, 11));
    }
    @Test
    public void aver_3(){
        assertEquals(5,HomeWork1_4_2.aver(11, 5, 2));
    }
    @Test
    public void aver2(){
        assertEquals(22,HomeWork1_4_2.aver(22, 1, 111));
    }
    @Test
    public void aver2_2(){
        assertEquals(22,HomeWork1_4_2.aver(1, 22, 111));
    }
    @Test
    public void aver2_3(){
        assertEquals(22,HomeWork1_4_2.aver(111, 22, 1));
    }
    @Test
    public void aver3(){
        assertEquals(100,HomeWork1_4_2.aver(1, 100, 10000));
    }
    @Test
    public void aver3_2(){
        assertEquals(-100,HomeWork1_4_2.aver(-1, -100, -10000));
    }
    @Test
    public void aver4(){
        assertEquals(-1,HomeWork1_4_2.aver(-1, 100, -10000));
    }
    @Test
    public void aver5(){
        assertEquals(100,HomeWork1_4_2.aver(100, 100, -10000));
    }
    @Test
    public void aver6(){
        assertEquals(100,HomeWork1_4_2.aver(100, 100, 100));
    }
}