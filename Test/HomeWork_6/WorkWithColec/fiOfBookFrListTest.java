package Test.HomeWork_6.WorkWithColec;

import HomeWork_6.interf.ISearchEngine;
import HomeWork_6.quest4.EasySearch;
import HomeWork_6.workWithColec.FileWorkerQ7;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class fiOfBookFrListTest {
    @Test
    public void test1() {
        String book;
        try {
            book = Files.readString(Path.of("D:\\Java\\IntelliJ IDEA Community Edition 2022.2.2\\Proj\\Test\\HomeWork_6\\WorkWithColec\\Res\\resultQ8T.txt"));
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
        String book2;
        try {
            book2 = Files.readString(Path.of("D:\\Java\\IntelliJ IDEA Community Edition 2022.2.2\\Proj\\resultQ8.txt"));
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
        //Файл сравнивается с тем, что был создан для теста
        boolean result = book.trim().equals(book2);
        assertTrue(result);
    }
}