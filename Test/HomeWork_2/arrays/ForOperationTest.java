package Test.HomeWork_2.arrays;

import HomeWork_2.arrays.ForOperation;
import HomeWork_2.arrays.IArraysOperation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForOperationTest {
    private final int[] check = {1, 2, 3, 4, 5, 6};
    private final int[] checkF = {1, 2, 3, 4, 5, 6};
    private final int[] checkSec = {2, 4, 6};
    private final int[] checkRev = {6, 5, 4, 3, 2, 1};

    @Test
    public void doWhileAllCheck() {
        IArraysOperation inter = new ForOperation();
        assertArrayEquals(checkF, inter.elements(check));
    }

    @Test
    public void doWhileSecondCheck() {
        IArraysOperation  inter = new ForOperation();
        assertArrayEquals(checkSec, inter.secondOf(check));
    }

    @Test
    public void doWhileRevertCheck() {
        IArraysOperation  inter = new ForOperation();
        assertArrayEquals(checkRev, inter.rev(check));
    }
}