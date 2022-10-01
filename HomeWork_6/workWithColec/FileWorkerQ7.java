package HomeWork_6.workWithColec;
import java.io.*;
import java.nio.file.*;
import java.util.Scanner;
public class FileWorkerQ7 {
    private static String bookPath;
    private static String world;
    private static String PATH = "";

    public static void ourBooksFromLib(String path) {
        System.out.println("Найденные в папке файлы: ");
        try {
            File file = new File(path);
            String[] massOfBooks;
            massOfBooks = file.list();
            for (String book : massOfBooks) {
                System.out.println(book);
            }
        } catch (Exception e) {
            System.out.println("Не найдено указанная папка по этому пути");
        }
    }

    public static String pathFromC() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Укажите путь к папке с книгами ");
        PATH = scan.nextLine();
        File file = new File(PATH);
        if (!file.isDirectory()) {
            System.out.println(" ");
        }
        return PATH;
    }

    public static String usePathBook(String PATH) {
        System.out.println("Выберите книгу из представленных ");
        Scanner scan = new Scanner(System.in);
        bookPath =scan.nextLine();
        String allPath = PATH +"/" +bookPath;
        File wordPathExist = new File(allPath);
        if (!wordPathExist.isFile()) {
            System.out.println("Такой книги нет");
        }
        return allPath;
    }

    public static String getPathBook() {
        return bookPath;
    }

    public static String searchingWorld() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите слово для поиска: ");
        world = scan.nextLine();
        return world;
    }

    public static String getWorld() {
        return world;
    }

    public static String readerF(String PATH) {
        FileReader read = null;
        StringBuilder sbuild = new StringBuilder();
        try {
            read = new FileReader(PATH);
        } catch (FileNotFoundException e) {
            System.out.println("Нет указанного файла");
        }
        try {
            int checkF;
            do {
                checkF = read.read();
                if (checkF != -1) {
                    sbuild.append(Character.toChars(checkF));
                }
            } while (checkF != -1);
        } catch (IOException e) {
            System.out.println("Ошибки при вычитки");
        } catch (NullPointerException e) {
            System.out.println("Нет указанного файла");
        }
        return sbuild.toString();
    }

    public static void resTFile(String name, String findW, Long number) {
        try {
            File file = new File("resultQ7.txt");
            if (file.createNewFile()) {System.out.println("File created");}
        }
        catch (Exception e) {
            System.err.println(e);
        }
        String ourNewFile = "resultQ7.txt";
        Path path = Paths.get(ourNewFile);
        String res = name + ": слово " + findW + " повторяется " + number + "\n";
        byte[] bs = res.getBytes();
        try {
            Files.write(path, bs, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Произошла ошибки при записи в файл");
        }
    }
}