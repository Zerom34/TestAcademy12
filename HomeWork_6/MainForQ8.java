package HomeWork_6;
import HomeWork_6.workWithColec.fiOfBookFrList;
import java.io.*;
import java.util.*;

public class MainForQ8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите путь к папке");
        File dir = new File(scanner.nextLine());
        List <File> listOFil = new ArrayList<>();
        for (File file : Objects.requireNonNull(dir.listFiles())) {
            if (file.isFile()){listOFil.add(file);}
        }
        File res = new File("resultQ8.txt");
        try {new FileWriter(res, false).close();}
        catch (IOException e) {throw new RuntimeException(e);}
        while (true) {
            System.out.println("Введите final для окончания поиска");
            System.out.println("Введите слово которое ищите");
            String findWord = scanner.nextLine();
            if (findWord.equals("final")) {break;}
            else {for (File file : listOFil) {new fiOfBookFrList(res, String.valueOf(file), findWord);}}
        }
    }
}