package HomeWork_2.arrays;
public class DoWhileOperation implements IArraysOperation  {

    @Override
    public int[] elements(int[] massiv) {
        int firstOf = 0;
        do {
            firstOf++;
        }
        while (firstOf < massiv.length);
        return massiv;
    }
    @Override
    public int[] secondOf(int[] massiv) {
        int SecOf = 1;
        int firstOf = 0;
        int[] mas = new int[massiv.length / 2];
        do {
            mas[firstOf] = massiv[SecOf];
            SecOf = SecOf + 2;
            firstOf++;
        }
        while (SecOf < massiv.length);
        return mas;
    }
    @Override
    public int[] rev(int[] massiv) {
        int firstOf = 0;
        int[] mas = new int[massiv.length];
        int SecOf = massiv.length - 1;
        do {
            mas[firstOf] = massiv[SecOf];
            SecOf = SecOf - 1;
            firstOf++;
        }
        while (SecOf >= 0);
        return mas;
    }
}
