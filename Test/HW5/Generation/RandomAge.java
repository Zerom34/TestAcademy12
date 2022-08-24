package Test.HW5.Generation;
import java.util.Random;

public class RandomAge {
    public static int randomAge(){
        int [] randomAge = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int min = 1;
        int max = randomAge.length;
        int randomNumb = (new Random().nextInt(max - min) + min);

        return randomAge[randomNumb];
    }
}

