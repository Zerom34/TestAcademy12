package HomeWork_2.arrays;

public class WhileOperation implements IArraysOperation  {

    @Override
    public int[] elements(int[] massiv) {
        int firstOf = 0;
        while (firstOf < massiv.length) {
            firstOf++;
        }
        return massiv;
    }
    @Override
    public int[] secondOf(int[] massiv) {
        int SecOf = 1;
        int firstOf = 0;
        int[] mas = new int[massiv.length / 2];
        while (SecOf < massiv.length) {
            mas[firstOf] = massiv[SecOf];
            SecOf = SecOf + 2;
            firstOf++;
        }
        return mas;
    }
    @Override
    public int[] rev(int[] massiv) {
        int firstOf = 0;
        int[] mas = new int[massiv.length];
        int SecOf = massiv.length - 1;
        while (SecOf >= 0) {
            mas[firstOf] = massiv[SecOf];
            SecOf = SecOf - 1;
            firstOf++;
        }
        return mas;
    }
}