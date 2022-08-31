package Test.HomeWork_1;

import HomeWork_1.HomeWork1_4_4;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HomeWork1_4_4Test {
    @Test
    public void byteToKilobyte(){
        assertEquals("25 это 0.25 килобайт", HomeWork1_4_4.byteToKilobyte(1,25));
    }
    @Test
    public void byteToKilobyte2(){
        assertEquals("25534 это 24.958 килобайт",HomeWork1_4_4.byteToKilobyte(1,25534));
    }
    @Test
    public void byteToKilobyte3(){
        assertEquals("Данные не могут быть отрицательными",HomeWork1_4_4.byteToKilobyte(1,-25));
    }
    @Test
    public void byteToKilobyte4(){
        assertEquals("Данные не могут быть отрицательными",HomeWork1_4_4.byteToKilobyte(1,-242345));
    }
    @Test
    public void kilobyteToByte(){
        assertEquals("25 это 25600 байт",HomeWork1_4_4.byteToKilobyte(2,25));
    }
    @Test
    public void kilobyteToByte2(){
        assertEquals("Данные не могут быть отрицательными",HomeWork1_4_4.byteToKilobyte(2,-25));
    }
    @Test
    public void kilobyteToByte3(){
        assertEquals("534534 это 547362816 байт",HomeWork1_4_4.byteToKilobyte(2,534534));
    }
    @Test
    public void kilobyteToByte4(){
        assertEquals("Данные не могут быть отрицательными",HomeWork1_4_4.byteToKilobyte(2,-54645625));
    }
}