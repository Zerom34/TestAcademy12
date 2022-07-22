package HomeWork2.loops;
import java.util.Scanner;
public class HomeWork2_1_1 {
    public static void main(String[] args) {
        //1.1.1
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        int numberUser = scanner.nextInt();
        System.out.println(cycle(numberUser));

        static int cycle ( int numberUser){
            String message;
            int result = 1;
            for (int i = 1; i <= numberUser; i++) {
                if (i < numberUser) {
                    message = i + "*";
                    System.out.print(message);
                } else {
                    message = i + "=";
                    System.out.print(message);
                }
            }
            for (int j = 1; j < numberUser; j++) {
                result = result * ++j;
                result = result;
                --j;
            }
            return result;
        }
    }
}
