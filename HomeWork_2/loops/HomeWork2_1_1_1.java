package HomeWork_2.loops;
public class HomeWork2_1_1_1 {
    public static String oneW(int res) {
        int result = 1;
        for (int i = 2; i <= res; i++) {
            result *= i;
            if (result < 0) {
                return " !Произошло переполнение";

            }
        }
        if (result > 0) {
            return " = " + result;
        }
        return "(";
    }
}