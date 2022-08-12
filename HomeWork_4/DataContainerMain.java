package HomeWork_4;
import HomeWork_4.comparator.IntegerComparator;
import java.util.Arrays;
import java.util.Iterator;

public class DataContainerMain {
    public static void main(String[] args) {
        Integer[] dataCont = new Integer[12];
        DataContainer<Integer> mainStorage = new DataContainer<>(dataCont);
        Iterator<Integer> mainIterat = mainStorage.iterator();
        IntegerComparator mainComporation = new IntegerComparator();
        int count = 0;

        System.out.println(mainStorage.add(7));
        mainStorage.add(22);
        mainStorage.add(34);
        System.out.println(mainStorage.add(1));
        mainStorage.add(4);
        mainStorage.add(55);
        mainStorage.add(32);
        mainStorage.add(542);

        System.out.println(Arrays.toString(mainStorage.getItems()));
        System.out.println(mainStorage.toString(dataCont));
        System.out.println(mainStorage.delete(2));
        System.out.println(Arrays.toString(mainStorage.getItems()));
        System.out.println(mainStorage.get(3));
        System.out.println(mainStorage.delete(mainStorage.get(3)));
        System.out.println(mainStorage.get(3));
        System.out.println(Arrays.toString(mainStorage.getItems()));

        mainStorage.sort(mainComporation);
        System.out.println(Arrays.toString((mainStorage.getItems())));

        DataContainer.sort(mainStorage);
        System.out.println(Arrays.toString((mainStorage.getItems())));

        DataContainer.sort(mainStorage, mainComporation);
        System.out.println(Arrays.toString((mainStorage.getItems())));

        while (mainIterat.hasNext()) {
            System.out.println(dataCont[count]);
            count++;
            mainIterat.next();
        }
    }


}