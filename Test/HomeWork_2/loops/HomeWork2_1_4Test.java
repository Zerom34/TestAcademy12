package Test.HomeWork_2.loops;

import HomeWork_2.loops.HomeWork2_1_4;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HomeWork2_1_4Test {
    public String res = "Перед переполнением: 3273344365508751233\n" +
            "После переполнением: -2080022246165795451";
    public String res2 = "Перед переполнением: 4052555153018976267\n" +
            "После переполнением: -6289078614652622815";
    public String res3 = "Перед переполнением: 1560496482665168896\n" +
            "После переполнением: -1774566438301073408";
    public String res4 = "Перед переполнением: 799006685782884121\n" +
            "После переполнением: 3265617043834753317";
    @Test
    public void resultCheck() {
        assertEquals(res, HomeWork2_1_4.lonNumOf(5));
    }
    @Test
    public void resultCheck2() {
        assertEquals(res2, HomeWork2_1_4.lonNumOf(3));
    }
    @Test
    public void resultCheck3() {
        assertEquals(res3, HomeWork2_1_4.lonNumOf(188));
    }
    @Test
    public void resultCheck4() {
        assertEquals(res4, HomeWork2_1_4.lonNumOf(-19));
    }
}