package HomeWork_5.btm;

import java.util.Collection;
import java.util.Iterator;

public class InfDel {

    //Отчистка коллекции итератором
    public static <T> void delByTheInterator(Collection<T> collection) {
        Iterator<T> itr = collection.iterator();
        long positionToTime1 = System.currentTimeMillis();
        while (itr.hasNext()) {
            T item = itr.next();
            itr.remove();
        }
        long positionToTime2 = System.currentTimeMillis();
    }
}
