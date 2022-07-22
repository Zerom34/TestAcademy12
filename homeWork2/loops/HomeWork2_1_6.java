package HomeWork2.loops;

public class HomeWork2_1_6 {
    public static void main(String[] args) {
        System.out.println("                                ТАБЛИЦА");
        System.out.println("                               УМНОЖЕНИЯ");
        System.out.println();
        for (int a = 1; a < 11; a++) {
            for (int b = 2; b < 6; b++) {
                System.out.print("\t "+ b + "*" + a+"="+b*a+"       ");
            }
            System.out.println("");
        }
        System.out.println();
        for (int a = 1; a < 11; a++) {
            for (int b = 6; b < 10; b++) {
                System.out.print("\t "+ b + "*" + a+"="+b*a+"       ");
            }
            System.out.println("");
        }
        System.out.println("       ЭТО");
        System.out.println("       НУЖНО");
        System.out.println("       ЗНАТЬ!");
    }
}

