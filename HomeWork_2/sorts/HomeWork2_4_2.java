package HomeWork_2.sorts;
import java.util.Arrays;
import HomeWork_2.utils.HomeWork2_4_1;

public class HomeWork2_4_2 {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] array2 = new int[]{1, 1, 1, 1};
        int[] array3 = new int[]{9, 1, 5, 99, 9, 9};
        int[] array4 = new int[]{};
        int[] array5 = new int[]{6, 5, 4, 3, 2, 1};
        int [] randomArray = HomeWork2_4_1.arrayRandom(10, 100);
        int [] consoleArray = HomeWork2_4_1.arrayFromConsole();


        System.out.print(Arrays.toString(array1)+ "->");
        HomeWork2_4_1.bubble(array1);

        System.out.print(Arrays.toString(array2)+ "->");
        HomeWork2_4_1.bubble(array2);

        System.out.print(Arrays.toString(array3)+ "->");
        HomeWork2_4_1.bubble(array3);

        System.out.print(Arrays.toString(array4)+ "->");
        HomeWork2_4_1.bubble(array4);

        System.out.print(Arrays.toString(array5)+ "->");
        HomeWork2_4_1.bubble(array5);

        System.out.print(Arrays.toString(randomArray)+ "->");
        HomeWork2_4_1.bubble(randomArray);

        System.out.print(Arrays.toString(consoleArray)+ "->");
        HomeWork2_4_1.bubble(consoleArray);
    }
}