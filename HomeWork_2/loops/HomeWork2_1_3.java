package HomeWork_2.loops;

import java.util.Scanner;
public class HomeWork2_1_3 {
    public static String stepOf(double b, int c) {
        double a = 1;
        for (int i = 1; i <= c; i++) {
            a = a * b;
        }
        return b+"^"+c+"=" + a;
    }
}