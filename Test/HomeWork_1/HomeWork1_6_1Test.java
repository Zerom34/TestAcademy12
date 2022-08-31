package Test.HomeWork_1;
import HomeWork_1.HomeWork1_6_1;
import HomeWork_1.ICommunicationPrinter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HomeWork1_6_1Test {
    public final String wel = "Превет! \nЯ тебя так долго ждал";

    @Test
    public void welcom(){
        ICommunicationPrinter welcom=new HomeWork1_6_1();
        assertEquals(wel,welcom.welcome("Вася"));
    }

    @Test
    public void welcom2(){
        ICommunicationPrinter welcom2=new HomeWork1_6_1();
        assertEquals("Я тебя так долго ждал",welcom2.welcome("Анастасия"));
    }

    @Test
    public void welcom3(){
        ICommunicationPrinter welcom4=new HomeWork1_6_1();
        assertNotEquals("Добрый день, а вы кто?",welcom4.welcome("Вася"));
    }
}