package Test.HomeWork_2.utils;
import HomeWork_2.utils.HomeWork2_4_1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HomeWork2_4_1Test {
    private final int[] bef1 = {6, 2, 3, 4, 5, 1};
    private final int[] bef2 = new int[]{1, 1, 1, 1};
    private final int[] bef3 = new int[]{9, 1, 5, 99, 9, 9};
    private final int[] bef4 = new int[]{7, 3, 9, 1};
    private final int[] bef5 = new int[]{6, 5, 4, 2, 0, 93, 2};
    @Test
    public void bubble() {
        HomeWork2_4_1.bubble(bef1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, bef1);
        HomeWork2_4_1.bubble(bef2);
        assertArrayEquals(new int[]{1, 1, 1, 1}, bef2);
        HomeWork2_4_1.bubble(bef3);
        assertArrayEquals(new int[]{1, 5, 9, 9, 9, 99}, bef3);
        HomeWork2_4_1.bubble(bef4);
        assertArrayEquals(new int[]{1, 3, 7, 9}, bef4);
        HomeWork2_4_1.bubble(bef5);
        assertArrayEquals(new int[]{0, 2, 2, 4, 5, 6, 93}, bef5);
    }
    @Test
    public void shake() {
        HomeWork2_4_1.shake(bef1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, bef1);
        HomeWork2_4_1.shake(bef2);
        assertArrayEquals(new int[]{1, 1, 1, 1}, bef2);
        HomeWork2_4_1.shake(bef3);
        assertArrayEquals(new int[]{1, 5, 9, 9, 9, 99}, bef3);
        HomeWork2_4_1.shake(bef4);
        assertArrayEquals(new int[]{1, 3, 7, 9}, bef4);
        HomeWork2_4_1.shake(bef5);
        assertArrayEquals(new int[]{0, 2, 2, 4, 5, 6, 93}, bef5);
    }

}