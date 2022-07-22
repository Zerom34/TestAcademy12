package HomeWork2.arrays;
import HomeWork2.utils.HomeWork2_2_1;

import java.util.Arrays;
public class HomeWork2_2_2 {
    public static void main(String[] args) {
        int[] massif = HomeWork2_2_1.arrayFromConsole();


        //Вывод к 2.2.1
        int[] box1 = dwc(massif);
        System.out.println(Arrays.toString(box1));
        int[] box2 = wc(massif);
        System.out.println(Arrays.toString(box2));
        int[] box3 = fc(massif);
        System.out.println(Arrays.toString(box3));
        int[] box4 = fec(massif);
        System.out.println(Arrays.toString(box4));
        //Вывод к 2.2.2
        int[] box5 = dwctwo(massif);
        System.out.println(Arrays.toString(box5));
        int[] box6 = wctwo(massif);
        System.out.println(Arrays.toString(box6));
        int[] box7 = fctwo(massif);
        System.out.println(Arrays.toString(box7));
        int[] box8 = fectwo(massif);
        System.out.println(Arrays.toString(box8));
        //Вывод к 2.2.3
        int[] box9 = dwcReverse(massif);
        System.out.println(Arrays.toString(box9));
        int[] box10 = wcReverse(massif);
        System.out.println(Arrays.toString(box10));
        int[] box11 = fcReverse(massif);
        System.out.println(Arrays.toString(box11));
        int[] box12 = fecReverse(massif);
        System.out.println(Arrays.toString(box12));
    }


    public static int[] dwc(int[] array1) {     //Вывести все элементы в консоль.
        int i = 0;
        do {
            if (i == 0) {
                System.out.println("Грустно, выпадение 0 ... " + array1[i]);
            }
            System.out.println(array1[i]);
            i++;
        } while (i < array1.length);
        return array1;
    }
    public static int[] wc(int[] array2) {
        int i = 0;
        while (i < array2.length) {
            if (i == 0) {
                System.out.println("Грустно, выпадение 0 ... " + array2[i]);
            }
            System.out.println(array2[i]);
            i++;
        }
        return array2;
    }
    public static int[] fc(int[] array3) {
        for (int i = 0; i < array3.length; i++) {
            if (i == 0) {
                System.out.println("Грустно, выпадение 0 ... " + array3[i]);
            }
            System.out.println(array3[i]);
        }
        return array3;
    }
    public static int[] fec(int[] array4) {
        for (int element : array4) {
            System.out.print(element);
        }
        return array4;
    }


    public static int[] dwctwo(int[] array5) { //Вывести каждый второй элемент массива в консоль.
        int i = 0;
        do {
            if (i % 2 == 0) {
                System.out.print(array5[i]);
            }
            i++;
        } while (i < array5.length);
        return array5;
    }
    public static int[] wctwo(int[] array6) {
        int i = 0;
        while (i < array6.length) {
            if (i % 2 == 0) {
                System.out.print(array6[i]);
            }
            i++;
        }
        return array6;
    }
    public static int[] fctwo(int[] array7) {
        for (int i = 1; i < array7.length; i += 2) {
            if (i == 1) {
                System.out.print(array7[i]);
            } else {
                System.out.print(array7[i]);
            }
            i += 2;
        }
        return array7;
    }
    public static int[] fectwo(int[] array8) {
        int i = 1;
        for (int element : array8) {
            if (i % 2 == 0) {
                System.out.print(element);
            }
            i++;
        }
        return array8;
    }


    public static int[] dwcReverse(int[] array9) { //Вывести все элементы массива в консоль в обратном порядке.
        int i = array9.length - 1;
        do {
            System.out.println(array9[i]);
            i--;
        } while (i >= 0);
        return array9;
    }
    public static int[] wcReverse(int[] array10) {
        int i = array10.length - 1;
        while (i >= 0) {
            System.out.println(array10[i]);
            i--;
        }
        return array10;
    }
    public static int[] fcReverse(int[] array11) {
        for (int i = array11.length - 1; i >= 0; i--) {
            if (i == array11.length - 1) {
                System.out.print(array11[i]);
            } else {
                System.out.print(array11[i]);
            }
        }
        return array11;
    }
    public static int[] fecReverse(int[] array12) {
        int[] array1 = new int[array12.length];
        int i = array12.length - 1;
        for (int element : array12) {
            array1[i] = element;
            i--;
        }
        for (int element : array1) {
            System.out.print(element + " ");
        }
        return array12;
    }
}

