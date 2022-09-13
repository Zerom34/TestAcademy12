package HanoiTowers;
import HanoiTowers.NumOfRings.FourRings;
import HanoiTowers.NumOfRings.ThreeRings;

import java.util.Scanner;
public class Towers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Добро пожаловать в Ханойские Башни");
        System.out.println("Выберите режим игры:");
        System.out.println("1. Ручной режим");
        System.out.println("2. Автоматический режим");
        //int[][] nums2 = { { 0, 1, 2 }, { 3, 4, 5 } };
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
                            int[][] fiveRing = new int[][]
                                    {
                                            {1, 0, 0},
                                            {2, 0, 0},
                                            {3, 0, 0},
                                            {4, 0, 0},
                                            {5, 0, 0}
                                    };
                            break;
                        case 6:
                            int[][] sixRing = new int[][]
                                    {
                                            {1, 0, 0},
                                            {2, 0, 0},
                                            {3, 0, 0},
                                            {4, 0, 0},
                                            {5, 0, 0},
                                            {6, 0, 0}
                                    };
                            break;
                        case 7:
                            int[][] sevenRing = new int[][]
                                    {
                                            {1, 0, 0},
                                            {2, 0, 0},
                                            {3, 0, 0},
                                            {4, 0, 0},
                                            {5, 0, 0},
                                            {6, 0, 0},
                                            {7, 0, 0}
                                    };
                            break;
                        case 8:
                            int[][] eightRing = new int[][]
                                    {
                                            {1, 0, 0},
                                            {2, 0, 0},
                                            {3, 0, 0},
                                            {4, 0, 0},
                                            {5, 0, 0},
                                            {6, 0, 0},
                                            {7, 0, 0},
                                            {8, 0, 0}
                                    };
                            break;
                    }
                }
                break;

            case 2:
                System.out.println("Извините, данный режим в разработке");
                break;
        }

    }
}
