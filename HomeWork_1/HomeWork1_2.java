package HomeWork_1;

public class HomeWork1_2 {
    public static void main(String[] args) {
        System.out.println();
        int a = 8;
        int b = 2;
        int w = 5 + 2 / 8; //  Результат 5. Выполнение: деление без остатка / первым, сложение + вторым. => 5+2/8=0+5=5
        int x = (5 + 2) / 8; // Резульат 0. Выполнение: деление без остатка / вторым, сложение + первым. => (5+2)/8=7/8=0
        int y = (5 + b++) / 8; // Результат 0. Выполнение: деление без остатка / третьим, умножение * первым, сложение + первым, Инкремент ++ Пост-унарный, >> побитовый сдвиг вправа второй
        int c = (5 * 2 >> b++) / --a; // Результат 0.   Выполнение: деление без остатка / третьим, умножение * первым, сложение + первым, Инкремент ++ Пост-унарный, -- пре, >> побитовый сдвиг вправа второй
        int v = (5 + 7 > 20 ? 68 : 22 * 2 >> b++) / --a; // Результат. 0 ?:-тернарный оператор (условие? то следствие:иначе. Если 12>20, то 68 и делится без остатка и затем выводится, но тк 12 меньше 20, то 22 умножается на 2) и затем деление
        // int o = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> b++) / --a; Результат - ошибка компиляции. Тернарный оператор выводит boolean, в следствии чего возможно деление его. Что и говорит при ошибке нам среда разр.
        boolean m = 6 - 2 > 3 && 12 * 12 <= 119; // Результат false, && дает True если оба True, в то время как 4>3 = True, но 144 не меньше 199 = false
        boolean g = true && false; // Результат false, && дает True если оба True
        System.out.print(w + "\n" + x + "\n" + y + "\n" + c + "\n" + v + "\n" + m + "\n" + g);
    }
}
