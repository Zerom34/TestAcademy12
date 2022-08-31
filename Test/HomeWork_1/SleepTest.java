package Test.HomeWork_1;

import HomeWork_1.Sleep;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SleepTest {
    @Test
    public void whatYear(){assertEquals("Можно спать", Sleep.result(true,true));}
    @Test
    public void whatYear2(){assertEquals("Можно спать",Sleep.result(true,false));}
    @Test
    public void whatYear3(){assertEquals("Можно спать",Sleep.result(false,true));}
    @Test
    public void whatYear4(){assertEquals("Пора работать",Sleep.result(false,false));}
    @Test
    public void whatYear5(){assertEquals(true,Sleep.isWeekDay("да"));}
    @Test
    public void whatYear6(){assertEquals(false,Sleep.isWeekDay("нет"));}
    @Test
    public void whatYear7(){assertEquals(false,Sleep.isVacationDay("нет"));}
    @Test
    public void whatYear8(){assertEquals(true,Sleep.isVacationDay("да"));}
    @Test
    public void whatYear9(){assertEquals("Можно спать",Sleep.result(false,Sleep.isVacationDay("да")));}
    @Test
    public void whatYear10(){assertEquals("Можно спать",Sleep.result(Sleep.isWeekDay("да"),Sleep.isVacationDay("да")));}
    @Test
    public void whatYear11(){assertEquals("Пора работать",Sleep.result(Sleep.isWeekDay("нет"),Sleep.isVacationDay("нет")));}
}