package Test.HomeWork_6.WorkWithColec;
import HomeWork_6.interf.ISearchEngine;
import HomeWork_6.quest4.EasySearch;
import HomeWork_6.workWithColec.FileWorkerQ7;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FileWorkerQ7Test {
    @Test
    public void readOne() {
        assertEquals("", FileWorkerQ7.readerF("warAndPeace.txt")); //неверный путь
    }
    @Test
    public void nullWorld() {
        assertEquals(null, FileWorkerQ7.getWorld());
    }
    @Test
    public void test1() {
        String book;
        try {
            book = Files.readString(Path.of("D:\\Java\\IntelliJ IDEA Community Edition 2022.2.2\\Proj\\Test\\HomeWork_6\\WorkWithColec\\Res\\resultQ7T.txt"));
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
        String book2;
        try {
            book2 = Files.readString(Path.of("D:\\Java\\IntelliJ IDEA Community Edition 2022.2.2\\Proj\\resultQ7.txt"));
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
        //Файл сравнивается с тем, что был создан для теста
        assertEquals(book,book2);
    }
    @Test
    public void test2() {
        String book;
        try {
            book = Files.readString(Path.of("D:\\Java\\IntelliJ IDEA Community Edition 2022.2.2\\Proj\\Test\\HomeWork_6\\WorkWithColec\\Res\\resultQ7T.txt"));
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
        //Тест при изначальном наличии файла. Файл, созданый ранее, его содержимое сравнивается с указанным
        assertEquals("D:\\Java\\IntelliJ IDEA Community Edition 2022.2.2\\Proj\\Test\\HomeWork_6\\WorkWithColec\\TestingBooks: world stop use 0", book);
    }
}