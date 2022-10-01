package HomeWork_6;
import HomeWork_6.interf.ISearchEngine;
import HomeWork_6.quest4.EasySearch;
import HomeWork_6.workWithColec.FileWorkerQ7;
import java.io.IOException;

public class MainFor7Q {
    public static void main(String[] args) throws IOException {
        String findW = "";
        String PATH = "";
        while (!findW.equals("final") || !PATH.equals("final")) {
            PATH = FileWorkerQ7.pathFromC();
            FileWorkerQ7.ourBooksFromLib((PATH));
            String stringBook = FileWorkerQ7.readerF(FileWorkerQ7.usePathBook(PATH));
            ISearchEngine es = new EasySearch();
            Long counter = es.search(stringBook, FileWorkerQ7.searchingWorld());
            String name = FileWorkerQ7.getPathBook();
            findW = FileWorkerQ7.getWorld();
            if (!findW.equals("final") || !PATH.equals("final")) {
                FileWorkerQ7.resTFile(name, findW, counter);
            }
        }
    }
}