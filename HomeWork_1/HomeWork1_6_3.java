package HomeWork_1;

public class HomeWork1_6_3 implements ICommunicationPrinter{
    public String welcome (String name) {
        String wel = "Превет! \nЯ тебя так долго ждал";
        switch (name) {
            case "Вася":
                return wel;
            case "Анастасия":
                return "Я тебя так долго ждал";
        }
                return "Добрый день, а вы кто?";
    }
}