package HomeWork_2.arrays;

public class HomeWork2_2_4 {
    public static void main(String[] args) {

    }

    public static int sum(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i]>0) {
                if (i == 0 || i % 2 == 0) {
                    sum = sum + array[i];
                }
            }
        }
        return sum;
    }
    public static int max(int[] array) {
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
    public static String average(int[] array) {
        int sum = 0;
        String res = "";
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        int average = (sum / array.length);
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= average) {
                res = res + array[i] + " ";
            }
        }
        return res;
    }
    public static String minmas(int[] array) {
        int min= Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE - 1;
        for (int element : array) {
            if (element < min) {
                min2 = min;
                min = element;
            }
        }
        return "Два минимальных элемента массива: " + min + " и " + min2;
    }
    public static String smallmas(int[] array, int min, int max) {
        int[] arrayWork = new int[array.length];
        int flagIndex = 0;
        String a = "";
        for (int j : array) {
            if (!(j >= min && j <= max)) {
                arrayWork[flagIndex] = j;
                flagIndex++;
            }
        }
        array = arrayWork;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==0){
                a = a + "";
            }
            else {
                    a = a + array[i] + " ";

            }
        }
        return "{ "+a+"}";
    }
    public static int summas(int[] array) {
        int sumNumber = 0;
        for (int i : array) {
            if (i > 9) {
                int firstNumber = i / 10;
                int secondNumber = i % 10;
                if (firstNumber <= 9) {
                    sumNumber += firstNumber + secondNumber;
                }
                if (firstNumber > 9) {
                    int x = firstNumber / 10;
                    int y = firstNumber % 10;
                    sumNumber += x + y + secondNumber;
                }
            } else {
                sumNumber += i;
            }
        }
        return sumNumber;
    }
}

