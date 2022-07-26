package HomeWork_2.utils;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class HomeWork2_2_1 {
    public static void main(String[] args) {
        //Выводит значения массива (ручного ввода)
        int[] container = arrayFromConsole();
        System.out.println(Arrays.toString(container));

        //Рандомного массива
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length : ");
        int length = scanner.nextInt();
        System.out.print("Enter array max value for random : ");
        int generate = scanner.nextInt();
        int[] container1 = arrayRandom(length, generate);
        System.out.println(Arrays.toString(container1));
    }
    //Массив вводимый пользователем (формирование)
    public static int[] arrayFromConsole() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scan.nextInt();
        int[] array = new int[size];
        System.out.println("Введите числа для заполнения массива");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        return array;
    }
    //Рандомный массив с заданными условиями (формирование)
    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] array = new int[size];
        Random x = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = x.nextInt(maxValueExclusion + 1);
        }
        return array;
    }
}