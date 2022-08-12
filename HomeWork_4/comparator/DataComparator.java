package HomeWork_4.comparator;
import java.util.Comparator;
public class DataComparator<T extends Comparable<T>> implements Comparator<T> {

    /** Переопределяет метод compare
     * @param item1 первая составляющая сравнения
     * @param item2 вторая составляющая сравнения
     * @return возвращает еденицу когда item1 больше item2
     * в случае если item1 меньше item2 возврвщает минус еденицу
     * в случае равенста возвращает ноль */

    @Override
    public int compare(T item1, T item2) {
        return item1.compareTo(item2);
    }
}