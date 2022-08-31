package Test.HomeWork_2.arrays;

import HomeWork_1.HomeWork1_4_6;
import HomeWork_2.arrays.HomeWork2_2_4;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HomeWork2_2_4Test {
    private final int[] check = {2, 3, 5, 1, 9, 4, 1};
    @Test
    public void whatAbSum(){assertEquals(17, HomeWork2_2_4.sum(check));}
    @Test
    public void whatAbMax(){assertEquals(9, HomeWork2_2_4.max(check));}
    @Test
    public void whatAbAverage(){assertEquals("2 3 1 1 ", HomeWork2_2_4.average(check));}
    @Test
    public void whatAbMin(){assertEquals("Два минимальных элемента массива: 1 и 2", HomeWork2_2_4.minmas(check));}
    @Test
    public void whatAbSmall(){assertEquals("{ 5 9 4 }", HomeWork2_2_4.smallmas(check,1,3));}
    @Test
    public void whatAbSm(){assertEquals(25, HomeWork2_2_4.summas(check));}

}