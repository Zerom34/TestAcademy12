package HomeWork_2.loops;

public class HomeWork2_1_6 {
    public static String tab() {
        String res ="                                ТАБЛИЦА УМНОЖЕНИЯ \n" ;
        res = res + "\n";
        for (int a = 1; a < 11; a++) {
            res = res + "\n";
            for (int b = 2; b < 6; b++) {
                String k ="\t "+ b + "*" + a+"="+b*a+"       ";
                res = res +k;
            }
        }
        res = res + "\n";
        for (int a = 1; a < 11; a++) {
            for (int b = 6; b < 10; b++) {
                String g = ("\t "+ b + "*" + a+"="+b*a+"       ");
                res = res + g;
            }
            res = res + "\n";
        }
        return res;
    }
}

