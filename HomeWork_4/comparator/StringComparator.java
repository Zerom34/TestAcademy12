package HomeWork_4.comparator;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {

    /** Переопределяет метод compare
     * @param item1 первая составляющая сравнения
     * @param item2 вторая составляющая сравнения
     * @return возвращает еденицу когда item1 больше item2
     * в случае если item1 меньше item2 возврвщает минус еденицу
     * в случае равенста возвращает ноль
     * (Booth itmes string) */

    @Override
    public int compare(String item1, String item2) {
        char[] massOne = item1.toCharArray();
        char[] massTwo = item2.toCharArray();
        for (int count = 0; count < massOne.length; count++) {
            if (massOne[count] > massTwo[count]) {return 1;}
            else if (massOne[count] < massTwo[count]) {return -1;}
        }
        return 0;
    }
}