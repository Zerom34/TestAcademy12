package HomeWork_6.quest4;

import HomeWork_6.interf.ISearchEngine;
import java.util.regex.*;
public class RegExSearch implements ISearchEngine {
    @Override
    public long search(String sOfBook, String wordWhatFind) {
        final String ser = "\\b" +Pattern.quote(wordWhatFind)+ "\\b";
        String re = String.format(ser);
        Pattern pattern = Pattern.compile(re);
        Matcher matcher = pattern.matcher(sOfBook);
        int counter = 0;
        while (matcher.find()) {counter++;}
        return counter;
    }
}
