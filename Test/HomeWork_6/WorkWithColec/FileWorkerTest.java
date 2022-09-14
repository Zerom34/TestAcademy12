package Test.HomeWork_6.WorkWithColec;

import HomeWork_6.WorkWithColec.FileWorker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FileWorkerTest {
    @Test
    public void readOne() {
        assertEquals("2 - четное число", FileWorker.readerF("C:\\Tools\\Java\\Proj\\Md-JC1-113-22\\HomeWork\\src\\warAndPeace.txt"));
    }
}