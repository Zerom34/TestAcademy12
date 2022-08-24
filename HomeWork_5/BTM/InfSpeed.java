package HomeWork_5.BTM;

import java.util.*;

public class InfSpeed {

    //Замер скорости с использованием итератора
    public static <S> void checkSpeedIter(Collection<S> collection) {
        long positionToTime1 = System.currentTimeMillis();
        Iterator<S> iterator = collection.iterator();
        while (iterator.hasNext()) {S item = iterator.next();}
        long positionToTime2 = System.currentTimeMillis();
        System.out.println("Операция: через итератор");
        System.out.println((positionToTime2 - positionToTime1) + " * 10^-6 sec ");
    }

    //Замер скорости с использованием цикла For
    public static <S> void checkSpeedFor(Collection<S> collection) {
        long positionToTime1 = System.currentTimeMillis();
        for (int c = 0; c < collection.size(); ) {c++;}
        long positionToTime2 = System.currentTimeMillis();
        System.out.println("Операция: через for");
        System.out.println((positionToTime2 - positionToTime1) + " * 10^-6 sec ");
    }
}
