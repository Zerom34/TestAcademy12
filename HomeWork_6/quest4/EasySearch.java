package HomeWork_6.quest4;
import HomeWork_6.interf.ISearchEngine;

public class EasySearch implements ISearchEngine {

    public long search(String sOfBook, String wordWhatFind) {
        int id = sOfBook.indexOf(wordWhatFind);
        int counter = 0;
        while (id != -1) {
            if (wordWhatFind.length() == 1 && id == 0) {counter++;}
            else if (wordWhatFind.length() > 0 && id == 0) {
                boolean bool = Character.isLetter(sOfBook.charAt(id + wordWhatFind.length()));
                if (!bool) {counter++;}
            }
            else if (id == sOfBook.indexOf(sOfBook.length() - 1)) {counter++;}
            else if (wordWhatFind.length() + id - 1 == sOfBook.length() - 1) {counter++;}
            else {
                boolean bool2 = Character.isLetter(sOfBook.charAt(id - 1));
                boolean bool3 = Character.isLetter(sOfBook.charAt(id + wordWhatFind.length()));
                if (!bool2 && !bool3) {counter++;}
            }
            sOfBook = sOfBook.substring(id + 1);
            id = sOfBook.indexOf(wordWhatFind);
        }
        return counter;
    }
}
