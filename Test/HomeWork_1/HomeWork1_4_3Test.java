package Test.HomeWork_1;

import HomeWork_1.HomeWork1_4_3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HomeWork1_4_3Test {
    @Test
    public void div(){
        assertEquals("На 0 не делиться", HomeWork1_4_3.div(5,0));
    }
    @Test
    public void div2(){
        assertEquals("5 целочисленно делится на 5 и равняется: 1 остаток равняется: 0",HomeWork1_4_3.div(5,5));
    }
    @Test
    public void div3(){
        assertEquals("5 целочисленно не делится на 2 и результат деления равняется: 2 а остаток 1",HomeWork1_4_3.div(5,2));
    }
    @Test
    public void div4(){
        assertEquals("-5 целочисленно не делится на 2 и результат деления равняется: -2 а остаток -1",HomeWork1_4_3.div(-5,2));
    }
    @Test
    public void div5(){
        assertEquals("-5 целочисленно делится на 5 и равняется: -1 остаток равняется: 0",HomeWork1_4_3.div(-5,5));
    }
    @Test
    public void div6(){
        assertEquals("-5 целочисленно делится на -5 и равняется: 1 остаток равняется: 0",HomeWork1_4_3.div(-5,-5));
    }
    @Test
    public void div7(){
        assertEquals("-5 целочисленно не делится на -2 и результат деления равняется: 2 а остаток -1",HomeWork1_4_3.div(-5,-2));
    }
    @Test
    public void div8(){
        assertEquals("-5 не делится на 22 остаток равняется: -5",HomeWork1_4_3.div(-5,22));
    }
}