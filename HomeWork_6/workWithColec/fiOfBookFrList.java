package HomeWork_6.workWithColec;
import HomeWork_6.quest4.EasySearch;
import java.io.*;

public class fiOfBookFrList implements Runnable {
    private final String book;
    private final String findWord;
    private final File res;

    public static String filToString(String text) {
        StringBuilder strBuild = new StringBuilder();
        File file = new File(text);
        if (file.exists() && !file.isDirectory()) {
            try (FileReader fileRead = new FileReader(text)) {
                int filChecking;
                while ((filChecking = fileRead.read()) != -1) {strBuild.append(Character.toChars(filChecking));}
                return strBuild.toString();
            }
            catch (IOException e) {throw new RuntimeException(e);}
        }
        else {return text;}
    }

    @Override
    public void run() {
        EasySearch es = new EasySearch();
        try (FileWriter fileWor = new FileWriter(res, true)) {
            long count = es.search(filToString(book), findWord);
            fileWor.write(book + " : слово " + findWord + " повторяется " + count + "\n" + " раз");
        }
        catch (IOException e) {throw new RuntimeException(e);}
    }
    public fiOfBookFrList(File res, String book, String findWord) {
        this.res = res;
        this.book = book;
        this.findWord = findWord;
        new Thread(this).start();
    }
}
