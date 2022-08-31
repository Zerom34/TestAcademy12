package HomeWork_2.arrays;

public class ForOperation implements IArraysOperation  {
    @Override
    public int[] elements(int[] massiv) {
        for (int firstOf = 0; firstOf < massiv.length; ) {
            firstOf++;
        }
        return massiv;
    }
    @Override
    public int[] secondOf(int[] massiv) {
        int firstOf = 0;
        int[] mas = new int[massiv.length / 2];
        for (int i = 1; i < massiv.length; i = i + 2) {
            mas[firstOf] = massiv[i];
            firstOf++;
        }
        return mas;
    }
    @Override
    public int[] rev(int[] massiv) {
        int firstOf = 0;
        int[] mas = new int[massiv.length];
        for (int SecOf = massiv.length - 1; SecOf >= 0; SecOf--) {
            mas[firstOf] = massiv[SecOf];
            firstOf++;
        }
        return mas;
    }
}