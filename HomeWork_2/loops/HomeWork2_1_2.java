package HomeWork_2.loops;
public class HomeWork2_1_2 {
    public static String rev(String numberStr) {
        StringBuilder resOfString = new StringBuilder();
        int result = 1;
        for (char c : numberStr.toCharArray()) {
            if (numberStr.contains(".")) {
                return "Введено не целое число";
            }
            if (!Character.isDigit(c)) {
                return "Введено не число";
            }
        }
        char[] mass = numberStr.toCharArray();
        for (int i = 0; i < mass.length; i++) {
            int charToNumber = Character.digit(mass[i], 10);
            result *= charToNumber;
            String multiplyOrEquals = i == mass.length - 1 ? "=" + result : "*";
            resOfString.append(mass[i]).append(multiplyOrEquals);
        }
        return resOfString.toString();
    }

}
