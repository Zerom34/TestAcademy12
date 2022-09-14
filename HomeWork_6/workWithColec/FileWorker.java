package HomeWork_6.workWithColec;
import HomeWork_6.comporator.ComparatorToAR;

import java.util.*;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
public class FileWorker {
    public static String [] strToMass (String bookSt) {return bookSt.split("[.?:;!,\\s]+");}

    public static Set <String> collectUs(String[] massWords){
        return new HashSet<>(Arrays.asList(massWords));
    }

    public static long counterOfWords(Set <String> wordSet) {
        return wordSet.size();
    }

    public static long counterOfW(String word, String[] massWords) {
        long counter = 0;
        for (String value : massWords) {
            if (word.equals(value)) {
                counter++;
            }
        }
        return counter;
    }

    public static Map<String,Long> collectByMap(String[] massWords) {
        Map<String, Long> counterSec = new HashMap<>();
        for (String word : massWords) {
            counterSec.put(word, counterOfW(word, massWords));
        }
        return counterSec;
    }

    public static <Key,Volum> List<Map.Entry <Key,Volum>> mapToArListConv(Map<Key,Volum> map){return new ArrayList<>(map.entrySet());}

    public static void sortOfArList(List<Map.Entry<String, Long>> arrayList) {
        arrayList.sort(new ComparatorToAR());
    }

    public static void whatAbN(List <Map.Entry<String, Long>> arrList, int number) {
        int i = 0;
        while (i < number) {
            System.out.println(arrList.get(i));
            i++;
        }
    }
    public static String readerF(String fileWay) {
        String erWay = "Ошибка пути. Укажите верный путь";
        String erWh = "Ошибка при считывании";
        StringBuilder bildString = new StringBuilder();
        FileReader filered = null;
        try {
            filered = new FileReader(fileWay);
        }
        catch (FileNotFoundException e) {System.out.println(erWay);}
        try {
            int worldString;
            do {
                worldString = filered.read();
                if (worldString != -1) {bildString.append(Character.toChars(worldString));}
            } while (worldString != -1);
        } catch (IOException e) {
            System.out.println(erWh);
        }
        return bildString.toString();
    }

}

