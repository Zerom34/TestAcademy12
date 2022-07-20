package HomeWork1;
import java.util.Scanner;
public class HomeWork1_1 { //при попытки побитовой И/ИЛИ с числом (42.5) (пункт 3) java указывает на неправильные типы операндов для двоичного оператора.
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Input 1 number: ");
        int a = console.nextInt(); //Ввод первого числа, в примере исп. число 23, в двоичном: 00010111
        System.out.print("Input 2 number: ");
        int b = console.nextInt(); //Ввод второго числа, в примере исп. число 34, в двоичном: 00100010
        int c = a & b; // побитовый И, в примере выходит 2, в двоичном: 00000010
        int d = a | b; // побитовый ИЛИ, в примере выходит 55, в двоичном: 00110111
        System.out.println(c); //Вывод значения результата побитового И
        System.out.println(d); //Вывод значения результата побитового ИЛИ
        console.close();
    }

}
