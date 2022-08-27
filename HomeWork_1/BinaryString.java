package HomeWork_1;

import java.util.Scanner;

public class BinaryString {
    public static void main(String[] args) {
        System.out.print("Введите целое число : ");
        byte number = new Scanner(System.in).nextByte();
        System.out.println("В двоичном коде оно выглядит: ");
        System.out.print(eqBinary(number));
    }

    public static String eqBinary (byte number) {
        StringBuilder finVid= new StringBuilder();
        int absNumb = Math.abs(number);
        for (int pow = 7; pow >= 0; pow--) {
            if ((int)(absNumb / Math.pow(2, pow)) > 0) {
                finVid.append("1");
                absNumb %= Math.pow(2, pow);
            }
            else finVid.append("0");
        }
        if (number < 0) {
            char[] resToCharArr = finVid.toString().toCharArray();
            for (int i = 0; i < resToCharArr.length; i++) {
                resToCharArr[i] = resToCharArr[i] == '0' ? '1' : '0';
            }
            for (int i = resToCharArr.length - 1; i >= 0; i--) {
                if (resToCharArr[i] == '0') {
                    resToCharArr[i] = '1';
                    break;
                }
                resToCharArr[i] = '0';
            }
            finVid = new StringBuilder(new String(resToCharArr));
        }
        return finVid.toString();
    }
}