package HomeWork_1;
import java.util.Objects;
import java.util.Scanner;
public class HomeWork1_6_1 implements ICommunicationPrinter {

    @Override
    public String welcome(String name) {
        String wel = "Превет! \nЯ тебя так долго ждал";
        if (Objects.equals(name, "Вася"))
        {
            return wel;
        }
        if (Objects.equals(name, "Анастасия"))
        {
            return "Я тебя так долго ждал";
        }
        return "Добрый день, а вы кто?";
    }
}