package HomeWork_2.loops;


public class HomeWork2_1_4 {
    public static String lonNumOf(int num) {
        long bef = 1;
        String res;
        long a = 1;
        while (true) {
            a *= num;
            res = "Перед переполнением: " + bef + "\nПосле переполнением: " + a;
            if ((bef > 0 && num > 0 || bef < 0 && num < 0) && a < 0) {
                return res;
            } else if ((bef < 0 && num > 0 || bef > 0 && num < 0) && a > 0) {
                return res;
            }
            bef = a;
        }
    }

}
