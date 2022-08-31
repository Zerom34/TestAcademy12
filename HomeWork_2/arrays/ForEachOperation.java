package HomeWork_2.arrays;

public class ForEachOperation implements IArraysOperation  {
    @Override
    public int[] elements(int[] massiv) {
        for (int firstOf = 0; firstOf < massiv.length; ) {
            firstOf++;
        }
        return massiv;
    }
    @Override
    public int[] secondOf(int[] massiv) {
        int[] mas = new int[massiv.length / 2];
        int SecOf = 1;
        int firstOf = 0;
        for (int item : massiv) {
            if (SecOf % 2 != 0) {
                mas[firstOf] = massiv[SecOf];
                firstOf++;
            }
            SecOf++;
        }
        return mas;
    }
    @Override
    public int[] rev(int[] massiv) {
        int firstOf = 0;
        int[] mas = new int[massiv.length];
        int SecOf = massiv.length - 1;
        for (int item : massiv) {
            mas[firstOf] = massiv[SecOf];
            firstOf++;
            SecOf = SecOf - 1;
        }
        return mas;
    }
}