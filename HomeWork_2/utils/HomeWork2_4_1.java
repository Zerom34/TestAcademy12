package HomeWork_2.utils;
import java.util.Random;
import java.util.Scanner;
public class HomeWork2_4_1 {
public static void main(String[] args) {
    int[] array1 = new int[]{36, 18, 30, 21, 81, 96, 3, 47};
    //Ответ 4.1.1
    System.out.print("Массив до проведения сортировки: ");
    for (int element : array1) {
        System.out.print(element + " ");
    }
    System.out.println();
    bubble(array1);
    System.out.println("Массив пузырьковой сортировки : " + arrayBubbleToString(array1));

    int[] array2 = new int[]{21, 81, 96, 3, 47, 30, 22, 55};
    //Ответ 4.1.2
    System.out.print("Массив до проведения сортировки: ");
    for (int element : array2) {
        System.out.print(element + " ");
    }
    System.out.println();
    shake(array2);
    System.out.println("Массив шейкерной сортировки : " + arrayShakerToString(array2));
}

    //Пузырьковая сортировка, при которой перебирается массив и сравниваются элементы,
    // пока они не займут свои позиции и не будут идти по возрастанию.
    // Сортировка идет слева неправо и потом возвращается после последнего элемента сразу к первому и занов
    public static void bubble(int[] arr) {
        boolean sort = false;

        while (!sort) {
            sort = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    sort = false;
                }
            }
        }
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