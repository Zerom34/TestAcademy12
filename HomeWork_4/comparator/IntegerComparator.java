package HomeWork_4.comparator;

import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer> {

    /** Переопределяет метод compare
     * @param item1 первая составляющая сравнения
     * @param item2 вторая составляющая сравнения
     *
     * @return возвращает еденицу когда item1 больше item2
     * в случае если item1 меньше item2 возврвщает минус еденицу
     * в случае равенста возвращает ноль
     * (Booth itmes int) */

    @Override
    public int compare(Integer item1, Integer item2) {
        if (item1 != null && item2 != null && item1 > item2) {return -1;}
        else if (item1 != null && item2 != null && item1 < item2) {return 1;}
        else {return 0;}
    }
}