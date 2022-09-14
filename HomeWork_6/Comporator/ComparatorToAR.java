package HomeWork_6.Comporator;

import java.util.Map.Entry;
import java.util.Comparator;
import java.util.Map;

public class ComparatorToAR implements Comparator<Map.Entry<String, Long>> {

    public int compare(Entry<String, Long> firOb, Entry<String, Long> SecOb) {
        return SecOb.getValue().compareTo(firOb.getValue());
    }
}