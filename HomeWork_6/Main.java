package HomeWork_6;
import HomeWork_6.Interf.ISearchEngine;
import HomeWork_6.Quest4.EasySearch;
import HomeWork_6.Quest4.RegExSearch;
import HomeWork_6.Quest4.SearchDecorat;
import HomeWork_6.WorkWithColec.FileWorker;

public class Main {
    public static String file = FileWorker.readerF("D:\\GIT\\TestAcademy12\\warAndPeace.txt");
    //"C:\\Tools\\Java\\Proj\\Md-JC1-113-22\\HomeWork\\src\\warAndPeace.txt"
    public static void main(String[] args){
        ISearchEngine es = new EasySearch();
        ISearchEngine reg = new RegExSearch();
        ISearchEngine ignore = new SearchDecorat(new RegExSearch());

        //Поиск зависимый от регистра
        // Поиск слова мир
        System.out.println("EasySearch. Слово мир повторяется: " + es.search(file, "мир") + " раза");
        System.out.println("RegExSearch. Слово мир повторяется: " + reg.search(file, "мир") + " раза");
        // Поиск слова война
        System.out.println("EasySearch. Слово война повторяется: " + es.search(file, "война") + " раз");
        System.out.println("RegExSearch. Слово война повторяется: " + reg.search(file, "война") + " раз");
        // Поиск слова и
        System.out.println("EasySearch. Слово и повторяется: " + es.search(file, "и") + " раз");
        System.out.println("RegExSearch. Слово и повторяется: " + reg.search(file, "и") + " раз");
        //Поиск не зависимый от регистра через SearchDecorat
        System.out.println("Слово мир повторяется: " + ignore.search(file, "мир") + " раза");
        System.out.println("Слово война повторяется: " + ignore.search(file, "война") + " раза");
        System.out.println("Слово и повторяется: " + ignore.search(file, "и") + " раз");
    }
}
