package HanoiTowers.NumOfRings;

import java.util.Scanner;

public class FiveRings {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int ourRingWhoGo;
        int choose = 0;
        int a;
        int counter = 0;
        String watchArray;
        int[][] ourArray = new int[][]     //Объявление массива в удобном мне виде
                {
                        {1, 0, 0},
                        {2, 0, 0},
                        {3, 0, 0},
                        {4, 0, 0},
                        {5, 0, 0},
                        {9, 9, 9}
                };
        while (choose != 2){
            System.out.println("Чего вы желаете?");
            System.out.println("1. Сделать ход");
            System.out.println("2. Закончить игру");
            choose = scan.nextInt();
            if (choose == 2){
                break;
            }
            for (int i = 0; i <= 4; i++) { //Начало кода для вывода экрана игры для игрока до хода
                watchArray = "";
                for (int j = 0; j <= 2; j++) {
                    if (ourArray[i][j] == 0) {
                        watchArray = watchArray + "* ";
                    } else {
                        watchArray = watchArray + ourArray[i][j] + " ";
                    }
                }
                System.out.println(watchArray); //Вывод экрана игры для игрока
            }
            System.out.println("Выберите стержень с которого будете переносить кольца"); //Начало кода вывода для выбора столба с которого перенесется кольцо
            System.out.println("1. Первый столбик");
            System.out.println("2. Второй столбик");
            System.out.println("3. Третий столбик");
            int gamePlay = scan.nextInt(); //Конец кода вывода для выбора столба с которого перенесется кольцо

            switch (gamePlay) {
                case 1:
                    if (ourArray[0][0] == 0 && ourArray[1][0] == 0 && ourArray[2][0] == 0 && ourArray[3][0] == 0 && ourArray[4][0] == 0) {
                        System.out.println("На первом стержне нет колец");
                        break;
                    }
                    a = 0;
                    while (ourArray[a][0] == 0) {//Начало кода для определения какое кольцо на столбе переносится
                        if (a == 3) {
                            break;
                        }
                        if (ourArray[a][0] == 1 || ourArray[a][0] == 2 || ourArray[a][0] == 3 || ourArray[a][0] == 4) {
                            break;
                        }
                        a++;

                    }
                    ourRingWhoGo = ourArray[a][0];
                    int mem0 = a;
                    ourArray[a][0] = 0;

                    System.out.println("Выберите на какой стержень желаете перенести кольцо");
                    System.out.println("1. 1>>2");
                    System.out.println("2. 1>>3");
                    int chooseOneWhatRingTo = scan.nextInt();
                    switch (chooseOneWhatRingTo) { //Сам ход: перенос колец на выбран. место
                        case 1:

                            a = 0;
                            while (ourArray[a][1] == 0) {//!!!!Начало кода для определения какое кольцо на столбе переносится
                                if (ourArray[a][1] == 1 || ourArray[a][1] == 2 || ourArray[a][1] == 3 || ourArray[a][1] == 4) {
                                    break;
                                }
                                if (a == 3) {
                                    break;
                                }
                                a++;
                            }
                            if (ourArray[a][1] == 1 || ourArray[a][1] == 2 || ourArray[a][1] == 3 || ourArray[a][1] == 4) {
                                a--;
                            }
                            if (ourArray[a+1][1] < ourRingWhoGo){
                                System.out.println("Такой ход невозможен");
                                ourArray[mem0][0] = ourRingWhoGo;
                                break;
                            }
                            ourArray[a][1] = ourRingWhoGo;
                            counter++;
                            break;
                        case 2:


                            a = 0;
                            while (ourArray[a][2] == 0) {//!!!!Начало кода для определения какое кольцо на стержне переносится
                                if (ourArray[a][2] == 1 || ourArray[a][2] == 2 || ourArray[a][2] == 3 || ourArray[a][2] == 4) {
                                    break;
                                }
                                if (a == 3) {
                                    break;
                                }
                                a++;
                            }
                            if (ourArray[a][2] == 1 || ourArray[a][2] == 2 || ourArray[a][2] == 3 || ourArray[a][2] == 4) {
                                a--;
                            }
                            if (ourArray[a+1][2] < ourRingWhoGo){
                                System.out.println("Такой ход невозможен");
                                ourArray[mem0][0] = ourRingWhoGo;
                                break;
                            }
                            ourArray[a][2] = ourRingWhoGo;
                            counter++;
                            break;
                    }
                    break; //Конец кода для первого стержня


                case 2: //Начало кода для второго стержня
                    if (ourArray[0][1] == 0 && ourArray[1][1] == 0 && ourArray[2][1] == 0 && ourArray[3][1] == 0) {
                        System.out.println("На втором стержне нет колец");
                        break;
                    }
                    a = 0;
                    while (ourArray[a][1] == 0) {//Начало кода для определения какое кольцо на столбе переносится
                        if (a == 3) {
                            break;
                        }
                        if (ourArray[a][1] == 1 || ourArray[a][1] == 2 || ourArray[a][1] == 3 || ourArray[a][1] == 4) {
                            break;
                        }
                        a++;
                    }

                    ourRingWhoGo = ourArray[a][1];
                    int mem1 = a;
                    ourArray[a][1] = 0;
                    System.out.println("Выберите на какой столбец желаете перенести кольцо");
                    System.out.println("1. 2>>1");
                    System.out.println("2. 2>>3");
                    int chooseTwoWhatRingTo = scan.nextInt();
                    switch (chooseTwoWhatRingTo) { //Сам код: перенос колец на выбран. место
                        case 1:


                            a = 0;
                            while (ourArray[a][0] == 0) {//!!!!Начало кода для определения какое кольцо на столбе переносится
                                if (ourArray[a][0] == 1 || ourArray[a][0] == 2 || ourArray[a][0] == 3 || ourArray[a][0] == 4) {
                                    break;
                                }
                                if (a == 3) {
                                    break;
                                }
                                a++;
                            }
                            if (ourArray[a][0] == 1 || ourArray[a][0] == 2 || ourArray[a][0] == 3 || ourArray[a][0] == 4) {
                                a--;
                            }
                            if (ourArray[a+1][0] < ourRingWhoGo){
                                System.out.println("Такой ход невозможен");
                                ourArray[mem1][1] = ourRingWhoGo;
                                break;
                            }
                            ourArray[a][0] = ourRingWhoGo;
                            counter++;
                            break;

                        case 2:


                            a = 0;
                            while (ourArray[a][2] == 0) {//!!!!Начало кода для определения какое кольцо на столбе переносится
                                if (ourArray[a][2] == 1 || ourArray[a][2] == 2 || ourArray[a][2] == 3 || ourArray[a][2] == 4) {
                                    break;
                                }
                                if (a == 3) {
                                    break;
                                }
                                a++;
                            }
                            if (ourArray[a][2] == 1 || ourArray[a][2] == 2 || ourArray[a][2] == 3 || ourArray[a][2] == 4) {
                                a--;
                            }
                            if (ourArray[a+1][2] < ourRingWhoGo){
                                System.out.println("Такой ход невозможен");
                                ourArray[mem1][1] = ourRingWhoGo;
                                break;
                            }
                            ourArray[a][2] = ourRingWhoGo;
                            counter++;
                            break;
                    }
                    break; //Конец кода для второго стержня

                case 3:  //Начало для третьего стержня
                    if (ourArray[0][2] == 0 && ourArray[1][2] == 0 && ourArray[2][2] == 0 && ourArray[3][2] == 0) {
                        System.out.println("На третьем стержне нет колец");
                        break;
                    }
                    a = 0;
                    while (ourArray[a][2] == 0) {//Начало кода для определения какое кольцо на столбе переносится
                        if (a == 3) {
                            break;
                        }
                        if (ourArray[a][2] == 1 || ourArray[a][2] == 2 || ourArray[a][2] == 3 || ourArray[a][2] == 4) {
                            break;
                        }
                        a++;
                    }

                    ourRingWhoGo = ourArray[a][2];
                    int mem2 = a;
                    ourArray[a][2] = 0;
                    System.out.println("Выберите на какой столбец желаете перенести кольцо");
                    System.out.println("1. 3>>1");
                    System.out.println("2. 3>>2");
                    int chooseThreeWhatRingTo = scan.nextInt();
                    switch (chooseThreeWhatRingTo) { //Сам код: перенос колец на выбран. место
                        case 1:


                            a = 0;
                            while (ourArray[a][0] == 0) {//!!!!Начало кода для определения какое кольцо на столбе переносится
                                if (ourArray[a][0] == 1 || ourArray[a][0] == 2 || ourArray[a][0] == 3 || ourArray[a][0] == 4) {
                                    break;
                                }
                                if (a == 3) {
                                    break;
                                }
                                a++;
                            }
                            if (ourArray[a][0] == 1 || ourArray[a][0] == 2 || ourArray[a][0] == 3 || ourArray[a][0] == 4) {
                                a--;
                            }
                            if (ourArray[a+1][0] < ourRingWhoGo){
                                System.out.println("Такой ход невозможен");
                                ourArray[mem2][2] = ourRingWhoGo;
                                break;
                            }
                            ourArray[a][0] = ourRingWhoGo;
                            counter++;
                            break;

                        case 2:


                            a = 0;
                            while (ourArray[a][1] == 0) {//!!!!Начало кода для определения какое кольцо на столбе переносится
                                if (ourArray[a][1] == 1 || ourArray[a][1] == 2 || ourArray[a][1] == 3 || ourArray[a][1] == 4) {
                                    break;
                                }
                                if (a == 3) {
                                    break;
                                }
                                a++;
                            }
                            if (ourArray[a][1] == 1 || ourArray[a][1] == 2 || ourArray[a][1] == 3 || ourArray[a][1] == 4) {
                                a--;
                            }
                            if (ourArray[a+1][1] < ourRingWhoGo){
                                System.out.println("Такой ход невозможен");
                                ourArray[mem2][2] = ourRingWhoGo;
                                break;
                            }
                            ourArray[a][1] = ourRingWhoGo;
                            counter++;
                            break;
                    }
                    break; //Конец кода для третьего стержня
            }


            for (int i = 0; i <= 3; i++) {    //Начало кода для вывода экрана для игрока после хода
                watchArray = "";
                for (int j = 0; j <= 2; j++) {
                    if (ourArray[i][j] == 0) {
                        watchArray = watchArray + "* ";
                    } else {
                        watchArray = watchArray + ourArray[i][j] + " ";
                    }
                }
                System.out.println(watchArray);   ////Вывод экрана игры для игрока после хода
            }
            if (ourArray[0][2] == 1 && ourArray[1][2] == 2 && ourArray[2][2] == 3 && ourArray[3][2] == 4){
                System.out.println("Поздравляю, вы выиграли. Вам потребоволось " + counter + " ходов");
                choose = 2;
            }
        }
    }
}

