package HanoiTowers;

import HanoiTowers.autNumRings.*;
import HanoiTowers.handNumOfRings.*;

import java.util.Scanner;
public class Towers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Добро пожаловать в игру Ханойские Башни");
        System.out.println("Выберите режим игры:");
        System.out.println("1. Ручной режим");
        System.out.println("2. Автоматический режим");
        int typeOfGame = scan.nextInt();
        switch (typeOfGame) {
            case 1:
                System.out.println("Выберите колличество колец в игре (от 3 до 8)");
                int numbOfRings = scan.nextInt();
                if (numbOfRings < 3 || numbOfRings > 8) {
                    System.out.println("Не поддерживаемое колличество колец в игре, колличество колец должно быть в пределе [3;8]");
                } else {
                    switch (numbOfRings) {
                        case 3:
                            ThreeRings.Three();
                            break;
                        case 4:
                            FourRings.four();
                            break;
                        case 5:
                            FiveRings.five();
                            break;
                        case 6:
                           SixRings.six();
                            break;
                        case 7:
                            SevenRings.seven();
                            break;
                        case 8:
                            EightRings.eight();
                            break;
                    }
                }
                break;

            case 2:
                System.out.println("Выберите колличество колец в игре (от 3 до 8)");
                int numbOfRingsA = scan.nextInt();
                if (numbOfRingsA < 3 || numbOfRingsA > 8) {
                    System.out.println("Не поддерживаемое колличество колец в игре, колличество колец должно быть в пределе [3;8]");
                } else {
                    switch (numbOfRingsA) {
                        case 3:
                            AutThreeRings.autThreeR();
                            break;
                        case 4:
                            AutFourRings.autFourR();
                            break;
                        case 5:
                            AutFiveRings.autFiveR();
                            break;
                        case 6:
                            AutSixRings.autSixR();
                            break;
                        case 7:
                            AutSevenRings.autSevenR();
                            break;
                        case 8:
                            AutEightRings.autEightR();
                            break;
                    }
                }
                break;
        }

    }
}
