package HomeWork_2.utils;
import java.util.Random;
import java.util.Scanner;
public class HomeWork2_4_1 {
    //Пузырьковая сортировка, при которой перебирается массив и сравниваются элементы,
    // пока они не займут свои позиции и не будут идти по возрастанию.
    // Сортировка идет слева неправо и потом возвращается после последнего элемента сразу к первому и занов
    public static int[] bubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = (arr.length - 1); j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static String arrayBubbleToString(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(arr[i]);
        }
        stringBuilder.append("]");

        return stringBuilder.toString();
    }

    //Шейкерная сортировка по своей сути очень похожа на пузырьковую,
    // однако если в пузырьковой мы проходились по массиву слево направо,
    // то в шейкерном мы проходимся слево направо и потом справа налево, а не возвращаемсяк началу массива
    public static void shake(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int count = 1;

        while (count > 0) {
            count = 0;
            for (int i = left; i < right; i++) {
                if (arr[i + 1] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    count = 1;
                }
            }
            right--;

            for (int i = right; i > left; i--) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    count = 1;
                }
            }
            left++;
        }
    }

    public static String arrayShakerToString(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(arr[i]);
        }
        stringBuilder.append("]");

        return stringBuilder.toString();
    }
    public static int[] arrayFromConsole() {
        int size;
        int[] array;
        System.out.println("Массив какого размера?");
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.out.println("неверный ввод");
            System.out.println("Получен массив размером 0");
            scanner.close();
        }
        size = scanner.nextInt();
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("номер позиции " + i);
            if (scanner.hasNextInt()) {
                array[i] = scanner.nextInt();
                System.out.println("на позиции " + i + " число= " + array[i]);
            } else {
                System.out.println("неверный ввод " + i);
                System.out.println("Получен массив размером 0 с позиции " + i);
                scanner.close();
                return array;
            }
        }
        scanner.close();
        return array;
    }

    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxValueExclusion);
        }
        return array;
    }
}