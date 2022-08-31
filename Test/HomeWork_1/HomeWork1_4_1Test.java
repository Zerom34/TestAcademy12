package Test.HomeWork_1;
import HomeWork_1.HomeWork1_4_1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HomeWork1_4_1Test {
    @Test
    public void parOne() {
        assertEquals("2 - четное число", HomeWork1_4_1.parity(2));
    }

    @Test
    public void parTwo() {
        assertEquals("-23 - нечетное число", HomeWork1_4_1.parity(-23));
    }

    @Test
    public void parThree() {
        assertEquals("Ноль не является ни четным, ни нечетным", HomeWork1_4_1.parity(0));
    }
}
