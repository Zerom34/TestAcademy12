package HomeWork2.arrays;
import HomeWork2.utils.HomeWork2_2_1;

import java.util.Arrays;
import java.util.Scanner;
public class HomeWork2_2_4 {
    public static void main(String[] args) {
        //Выводы полученных результатов
        //Вывод 2.4.1. Сумма четных положительных элементов массива
        System.out.println(sum(HomeWork2_2_1.arrayRandom(50, 100)));
        //Вывод 2.4.2. Максимальный из элементов массива с четными индексами
        System.out.println(max(HomeWork2_2_1.arrayRandom(50, 100)));
        //Вывод 2.4.3. Элементы массива, которые меньше среднего арифметического
        System.out.println(average(HomeWork2_2_1.arrayRandom(50, 100)));
        //Вывод 2.4.4. Найти два наименьших (минимальных) элемента массива
        System.out.println(minmas(HomeWork2_2_1.arrayRandom(50, 100)));
        //Вывод 2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу
        System.out.println(smallmas(HomeWork2_2_1.arrayRandom(50, 100)));
        //Вывод 2.4.6. Сумма цифр массива
        System.out.println(summas(HomeWork2_2_1.arrayRandom(50, 100)));
    }


    /** Метод sum = Сумма четных положительных элементов массива
     * Метод max = Максимальный из элементов массива с четными индексами
     * Метод average = Элементы массива, которые меньше среднего арифметического
     * Метод minmas = Найти два наименьших (минимальных) элемента массива
     * Метод smallmas = Сжать массив, удалив элементы, принадлежащие интервалу
     * Метод summas = Сумма цифр массива
     */


    public static int sum(int[] array) { //Нахождение суммы всех четных чисел в массиве
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
    public static int max(int[] array) { //Нахождение максимального четного числа в массиве
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && i != 0) {
                if (array[i] > maxValue) {
                    maxValue = array[i];
                }
            }
        }
        return maxValue;
    }
    public static StringBuilder average(int[] array) { //Нахождение всех чисел меньше ср. ариф.
        StringBuilder stringBuilder = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += i;
        }

        int average = sum / array.length;
        for (int i = 0; i < array.length; i++) {
            if (i < average) {
                stringBuilder.append(i + " ");
            }
        }
        stringBuilder.setLength(stringBuilder.length() - 1);
        return stringBuilder;
    }
    public static StringBuilder minmas(int[] array) { //Нахождение двух минимальных числа
        StringBuilder stringBuilder = new StringBuilder();
        int min= Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE - 1;

        for (int element : array) {
            if (element < min) {
                min2 = min;
                min = element;
            }
        }
        stringBuilder.append("Two minimums : " + min + " и " + min2);
        return stringBuilder;
    }
    public static StringBuilder smallmas(int[] array) { //Сжать массив
        StringBuilder stringBuilder = new StringBuilder();
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 5 && array[i] <= 25) {
                counter++;
                for (int k = i; k < array.length - 1; k++) {
                    array[k] = array[k + 1];
                }
                array[array.length - counter] = 0;
                i--;
            }
        }
        System.out.print("Your squeezed array : ");
        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(i + " ");
        }
        return stringBuilder;
    }
    public static StringBuilder summas(int[] array) {  //Сумма цифр массива
        StringBuilder stringBuilder = new StringBuilder();
        int sum = 0;

        for (int element : array) {
            if (element > 9) {
                int first = element / 10;
                int second = element % 10;
                if (first <= 9) {
                    sum += first + second;
                }
                if (first > 9) {
                    int x = first / 10;
                    int y = first % 10;
                    sum += x + y + second;
                }
            } else {
                sum += element;
            }
        }
        stringBuilder.append(sum);
        return stringBuilder;
    }
}
