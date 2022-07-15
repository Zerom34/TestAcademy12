package HomeWork1;
import java.util.Scanner;
public class HomeWork1_3 {
    public static void main(String[] args) {
        // abs - нахождения числа по модулю
        System.out.println(Math.abs(-7));      // Вывод 7
        System.out.println(Math.abs(-32.4d));  // Вывод 32.4
        System.out.println(Math.abs(7.654f));  // Вывод 7.654
        // Нахождение тригоном. функций. Стадартно в радианах.
        System.out.println(Math.sin(2)); // Вывод 0.9092974268256817
        System.out.println(Math.cos(2)); // Вывод -0.4161468365471424
        System.out.println(Math.sin(Math.toRadians(30))); // Вывод 0.49999999999999994
        System.out.println(Math.cos(Math.toRadians(30))); // Вывод 0.8660254037844387
        // не соответствует табличным значениям синусов и косинусов <= погрешность при переводе из градусов в радианы
        // Возведение в степень (a,b)(числа a в степень b)
        System.out.println(Math.pow(4,2)); // Вывод 16
        System.out.println(Math.pow(3,3)); // Вывод 27
        System.out.println(Math.pow(12,2)); // Вывод 144
        // sqrt - извлекает квадратный корень
        // cbrt - извлекает кубический корень
        System.out.println(Math.sqrt(16));  // Вывод 4
        System.out.println(Math.sqrt(81));  // Вывод 9
        System.out.println(Math.cbrt(8));   // Вывод 2
        System.out.println(Math.cbrt(27));  // Вывод 3
        // random - вывод случайного числа в промежутке от 0.0 до 1.0
        System.out.println(Math.random());
        System.out.println(Math.random());
        // random чисел от 0 до 10, до 100
        System.out.println(Math.random() * 10);
        System.out.println(Math.random() * 100);
        // деление целочисленное
        System.out.println(Math.floorDiv(1, 2)); // Вывод 0
        System.out.println(Math.floorDiv(7, 2)); // Вывод 3
        // Задача 7 класс по геометрии. Казаков В. В. Есть радиус круга такой-то, найти прощадь его. Но изменем для ввода любого радиуса
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the radius of the circle "); //Вывод сообщения
        int radius = console.nextInt(); // Ввод знач. радиуса
        long area = Math.round(Math.PI * Math.pow(radius, 2)); //Высч. площади круга
        System.out.printf("The area of a circle with a radius %d = %d \n", radius, area);  // Форматируемый вывод значения площади круга
        // Поиск мин числа из 2 введенных
        int q = console.nextInt();
        int e = console.nextInt();
        System.out.println("min: " + Math.min(q, e));
        // Поиск макс числа из 2 введенных
        int y = console.nextInt();
        int u = console.nextInt();
        System.out.println("max: " + Math.max(y, u));
        // Площадь равнестороннего треугольника с вводом стороны
        int s = console.nextInt();
        double S = s * Math.sqrt(3) / 4;
        System.out.print("The area of an equilateral triangle = " + S);

    }

 //Scanner in = new Scanner(System.in);
}
