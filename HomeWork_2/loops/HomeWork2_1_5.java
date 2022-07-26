package HomeWork_2.loops;
import java.util.Scanner;
import java.util.Random;
public class HomeWork2_1_5 {
    public static void main(String[] args) {
        System.out.println("З.1. Найти наибольшую цифру натурального числа. Ответ:"+ Work1());
        System.out.println("З.2. Вероятность четных случайных чисел. Ответ:"+ Work2());
        System.out.println("З.3. Посчитать четные и нечетные цифры числа. Ответ:"+ Work3());
        System.out.println("З.4. Ряд Фибоначчи. Ответ:"+ Work4());
        System.out.println("З.5. Вывести ряд чисел в диапазоне с шагом. Ответ:"+ Work5());
        System.out.println("1.5.6. Переворот числа. Ответ:"+ Work6());
    }


    public static int Work1() { //Найти наибольшую цифру натурального числа
        Scanner cons = new Scanner(System.in);
        System.out.println("Введите число");
        String num = cons.nextLine();
        char[] mas1 = num.toCharArray();
        int[] mas2 = new int[num.length()];
        int maxnum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length(); i++) {
            mas2[i] = Character.getNumericValue(mas1[i]);
            if (mas2[i] > maxnum) {
                maxnum = mas2[i];
            }
        }
        return maxnum;
    }


    public static int Work2() {     //Вероятность четных случайных чисел
        int maxnumber = 0;
        int[] mas = new int[1000];
        Random x = new Random();
        for (int i = 0; i < 1000; i++) {
            mas[i] = x.nextInt();
            if (mas[i] % 2 == 0) {
                maxnumber += 1;
            }
        }
        return maxnumber;
    }


    public static StringBuilder Work3() {     //Посчитать четные и нечетные цифры числа
        Scanner cons = new Scanner(System.in);
        System.out.println("Введите число в котором будет производиться подсчет четных и нечетных чисел");
        String num = cons.nextLine();
        char[] mas1 = num.toCharArray();
        int[] mas2 = new int[num.length()];
        int numb1 = 0;
        int numb2 = 0;
        for (int i = 0; i < num.length(); i++) {
            mas2[i] = Character.getNumericValue(mas1[i]);
            if (mas2[i] % 2 != 0) {
                numb1 += 1;
            } else {
                numb2 += 1;
            }
        }
        StringBuilder resul = new StringBuilder();
        resul.append("Нечетных чисел: " + numb1 + "  Четных чисел: " + numb2);
        return resul;
    }


    public static String Work4() {     // Ряд Фибоначчи
        int num1 = 1;
        int num2 = 2;
        String result = "";
        Scanner cons = new Scanner(System.in);
        System.out.println("Введите число символов");
        int Soupon = cons.nextInt();
        if (Soupon <= 0) {
            result = "Введите число символов!!!";
        } else if (Soupon == 1) {
            result += num1;
        } else if (Soupon == 2) {
            result += num1 + " " + num2;
        } else {
            result += num1 + " " + num2;
            for (int i = 0; i < Soupon - 2; i++) {
                if (i % 2 == 0) {
                    num1 += num2;
                    result += " " + num1;
                } else {
                    num2 += num1;
                    result += " " + num2;
                }
            }
        }
        return result;
    }


    public static String Work5() {     //Вывести ряд чисел в диапазоне с шагом
        int min = 0;
        String result = "0";
        Scanner cons = new Scanner(System.in);
        System.out.println("Введите максимум диапозона");
        int max = cons.nextInt();
        System.out.println("Введите шаг");
        int step = cons.nextInt();
        int count = min;
        while (count < max) {
            count += step;
            result += " " + count;
        }
        return result;
    }



    public static String Work6() {     //Переворот числа
        Scanner cons = new Scanner(System.in);
        System.out.println("Введите число");
        String num = cons.nextLine();
        String result = "";
        char[] array = num.toCharArray();
        for (int i = array.length - 1; i >= 0; i--) {
            result += array[i];
        }
        return result;
    }
}
