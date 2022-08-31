package Test.HomeWork_2.loops;

import HomeWork_2.loops.HomeWork2_1_6;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HomeWork2_1_6Test {
    public String res = "                                ТАБЛИЦА УМНОЖЕНИЯ \n" +
            "\n" +
            "\n" +
            "\t 2*1=2       \t 3*1=3       \t 4*1=4       \t 5*1=5       \n" +
            "\t 2*2=4       \t 3*2=6       \t 4*2=8       \t 5*2=10       \n" +
            "\t 2*3=6       \t 3*3=9       \t 4*3=12       \t 5*3=15       \n" +
            "\t 2*4=8       \t 3*4=12       \t 4*4=16       \t 5*4=20       \n" +
            "\t 2*5=10       \t 3*5=15       \t 4*5=20       \t 5*5=25       \n" +
            "\t 2*6=12       \t 3*6=18       \t 4*6=24       \t 5*6=30       \n" +
            "\t 2*7=14       \t 3*7=21       \t 4*7=28       \t 5*7=35       \n" +
            "\t 2*8=16       \t 3*8=24       \t 4*8=32       \t 5*8=40       \n" +
            "\t 2*9=18       \t 3*9=27       \t 4*9=36       \t 5*9=45       \n" +
            "\t 2*10=20       \t 3*10=30       \t 4*10=40       \t 5*10=50       \n" +
            "\t 6*1=6       \t 7*1=7       \t 8*1=8       \t 9*1=9       \n" +
            "\t 6*2=12       \t 7*2=14       \t 8*2=16       \t 9*2=18       \n" +
            "\t 6*3=18       \t 7*3=21       \t 8*3=24       \t 9*3=27       \n" +
            "\t 6*4=24       \t 7*4=28       \t 8*4=32       \t 9*4=36       \n" +
            "\t 6*5=30       \t 7*5=35       \t 8*5=40       \t 9*5=45       \n" +
            "\t 6*6=36       \t 7*6=42       \t 8*6=48       \t 9*6=54       \n" +
            "\t 6*7=42       \t 7*7=49       \t 8*7=56       \t 9*7=63       \n" +
            "\t 6*8=48       \t 7*8=56       \t 8*8=64       \t 9*8=72       \n" +
            "\t 6*9=54       \t 7*9=63       \t 8*9=72       \t 9*9=81       \n" +
            "\t 6*10=60       \t 7*10=70       \t 8*10=80       \t 9*10=90       \n";
    @Test
    public void larg() {
        assertEquals(res, HomeWork2_1_6.tab());
    }
}