package WorkInClass;
import java.io.*;
public class ReaderF {
    public void getFile(String url) {
        try {
            FileReader read = new FileReader("Std");
        } catch (FileNotFoundException e) {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.bin"))) {
                Students students = new Students("Максим","Казючиц","Андреевич",11);
                oos.writeObject(students);
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }
}
