package HomeWork_2.loops;
import java.util.Random;
public class HomeWork2_1_5 {

    public static int largOf(int maxOf) {
        int res = 0;
        while (maxOf > 9) {
            int num = maxOf % 10;
            if (num > res) {
                res = num;
            }
            maxOf = maxOf / 10;
        }
        return res;
    }
    public static double verOfRandom() {
        int num = 0;
        for (int i = 0; i < 1001; i++) {
            Random r = new Random();
            int random = r.nextInt();
            if (random % 2 == 0) {
                num = num + 1;
            }
        }
        return num * 100 / 1000;
    }
    public static int[] chOrNe(int chOrNe) {
        int fir = chOrNe;
        int[] mass = new int[2];
        if (fir % 2 == 0 && fir < 9) {
            mass = new int[]{1, 0};
        } else if (fir % 2 != 0 && fir < 9) {
            mass = new int[]{0, 1};
        } else {
            int numF = 0;
            int numT = 0;
            while (chOrNe > 0) {
                int a = chOrNe % 10;
                chOrNe = (chOrNe - a) / 10;
                if (a % 2 == 0) {
                    numT = numT + 1;
                    mass[0] = numT;
                } else {
                    numF = numF + 1;
                    mass[1] = numF;
                }
            }
        }
        return mass;
    }
    public static int[] rFib(int count) {
        int numF = 0;
        int numS = 1;
        int rFiban;
        int[] mass = new int[count];
        for (int i = 0; i < mass.length; i++) {
            rFiban = numF + numS;
            numF = numS;
            numS = rFiban;
            mass[i] = numS;
        }
        return mass;
    }
    public static int[] numDiOfOf(int from, int to, int by) {
        int res = from;
        int i;
        for (i = 0; res <= to; ++i) {
            res = res + by;
        }
        res = from;
        int[] mass = new int[i];
        for (int j = 0; j < i; j++) {
            mass[j] = res;
            res = res + by;
        }
        return mass;
    }
    public static String revol(String rev) {
        StringBuilder valueForString = new StringBuilder(rev);
        valueForString.reverse();
        return valueForString.toString();
    }
}