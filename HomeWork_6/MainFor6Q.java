package HomeWork_6;
import HomeWork_6.interf.ISearchEngine;
import HomeWork_6.quest4.EasySearch;
import HomeWork_6.workWithColec.FileWorkerQ6;
import java.io.IOException;

public class MainFor6Q {
    public static void main(String[] args) throws IOException {
        String findW = "";
        String PATH = "";
        while (!"f".equals(findW) || !"f".equals(PATH)) {
            PATH = FileWorkerQ6.pathFromC();
            FileWorkerQ6.ourBooksFromLib((PATH));
            String stringBook = FileWorkerQ6.readerF(FileWorkerQ6.usePathBook(PATH));
            ISearchEngine es = new EasySearch();
            Long number = es.search(stringBook, FileWorkerQ6.searchingWorld());
            String bookName = FileWorkerQ6.getPathBook();
            findW = FileWorkerQ6.getWorld();
            if (!"f".equals(findW) || !"f".equals(PATH)) {
                FileWorkerQ6.resTFile(bookName, findW, number);
            }
        }
    }
}