package HomeWork_6.Quest4;
import HomeWork_6.Interf.ISearchEngine;

public class SearchDecorat implements ISearchEngine {
        private final ISearchEngine searchEngine;

    public SearchDecorat(ISearchEngine searchEngine) {
            this.searchEngine = searchEngine;
        }
        @Override
        public long search(String sOfBook, String wordWhatFind) {
            return searchEngine.search(sOfBook.toLowerCase(), wordWhatFind.toLowerCase());
        }
    }

