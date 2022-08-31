package Test.HomeWork_2.loops;
import HomeWork_2.loops.HomeWork2_1_1_1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HomeWork2_1_1_1Test {
    @Test
    public void resultCheck() {
        assertEquals(" = 120", HomeWork2_1_1_1.oneW(5));
    }
    @Test
    public void resultCheck2() {
        assertEquals(" !Произошло переполнение", HomeWork2_1_1_1.oneW(72));
    }
    @Test
    public void resultCheck3() {
        assertEquals(" = 479001600", HomeWork2_1_1_1.oneW(12));
    }
}