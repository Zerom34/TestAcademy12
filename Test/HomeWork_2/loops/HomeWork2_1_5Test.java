package Test.HomeWork_2.loops;
import HomeWork_2.loops.HomeWork2_1_5;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HomeWork2_1_5Test {
    @Test
    public void revol() {
        assertEquals("555333222", HomeWork2_1_5.revol("222333555"));
    }
    @Test
    public void larg() {
        assertEquals(7, HomeWork2_1_5.largOf(552313753));
    }
    @Test
    public void numDiOfOf() {
        int[] arrExpected = {1, 6, 11};
        int[] arrActual = HomeWork2_1_5.numDiOfOf(1, 11, 5);
        assertArrayEquals(arrExpected, arrActual);
    }

    @Test
    public void numDiOfOf2() {
        int[] mass1 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int[] mass2 = HomeWork2_1_5.numDiOfOf(2, 20, 2);
        assertArrayEquals(mass1, mass2);
    }


    @Test
    public void rFib() {
        int[] mass = {1, 2, 3, 5, 8, 13};
        int[] massOf = HomeWork2_1_5.rFib(6);
        assertArrayEquals(mass, massOf);
    }

    @Test
    public void chOrNe() {
        int[] mass1 = {2, 7};
        int[] mass2 = HomeWork2_1_5.chOrNe(555443333);
        assertArrayEquals(mass1, mass2);
    }
}