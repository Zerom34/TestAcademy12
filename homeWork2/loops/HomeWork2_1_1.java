package HomeWork2.loops;
import java.util.Scanner;
public class HomeWork1_1_2 {
    public static void main(String[] args) {
        Scanner cons = new Scanner(System.in);
        System.out.println("Введите число факториал которого необходимо вычислить");
        int num = cons.nextInt();
        long outcome = fact(num); // factorial возвращает факториал(!) числа (в данном случае num)
        if (outcome > 0) {
            System.out.println(" = " + outcome);
        }
        System.out.println("!" + num + "=" + outcome); //выводит !введенного числа = результат
    }

  // метод fact = factorial (!) считает факториал, выводит в нужном виде + проверяет на переполнение
    public static long fact(int number) {
        long outcome = 1;
       System.out.print(1); //Выводит 1 (для вида 1*2*3 и тд)
        for (int a = 2; a <= number; a++) {
            outcome *= a; //Выводит числа в формате *2*3*4.. начиная с 2 (еденица выводится отдельно)
            System.out.print(" * " + a);
            /* при превышении максимального значения для long выводит сообщение:
            "Переполнение! Вы ввели слишком большое число"
             */
            if (outcome < 0) {
                System.out.println("Переполнение! Вы ввели слишком большое число");
                break;
            }
        }
        return outcome;
    }
}
