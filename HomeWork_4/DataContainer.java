package HomeWork_4;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class DataContainer<T> implements Iterable<T> {

    protected T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }

    /** Добавляет новый элемент массива, места первой ячейки и ее значением null
     * В случае занятости всех ячеек пересоздает массив, копирую все старые ячейки,  с +1 ячейкой
     * @param argum - переданный аргумент, добавляемый в массив
     * @return возвращает показатель ячейки в которой была новая запись */

    public int add(T argum) {
        if (argum == null) {return -1;}
        int subscript = getIndexForAdd();
        if (data.length <= subscript) {
            this.data = Arrays.copyOf(this.data, this.data.length + 1);
        }
        data[subscript] = argum;
        return subscript; //возвращает показатель ячейки
    }

    /** Поиск первой null содержащей ячейки
     * @return возвращает показатель ячейки содержащую null, либо возвращает длинну заполненного массива */

    public int getIndexForAdd() {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                return i; //возвращает показатель ячейки содержащую null
            }
        }
        return data.length; //если массив заполнен возвращает длинну массива
    }

    /** Возвращает содержимое определенной ячейки (по показателю)
     * @param subscript переданный аргумент (индекс ячейки)
     * @return возвращает содержимое определенной ячейки, либо возвращает null если:
     * индекс меньше нуля
     * больше длинны масива
     * равен длинне массива возвращает null */
    public T get(int subscript) {
        if (data.length <= subscript || subscript < 0) {
            return null; // возвращает null при выполнении условий
        } else {
            return data[subscript]; //возвращает ячейки
        }

    }

    /** @return возвращает поле data */

    public T[] getItems() {
        return data;
    }

    /** Удаляет элемент из поля data по показателю
     * @param subscript переданный аргумент (индекс ячейки)
     * @return если елемент удален возвращает true, в ином случае false */

    public boolean delete(int subscript) {
        if (subscript < data.length && data[subscript] != null) {
            if (data.length - 1 - subscript >= 0) {
                System.arraycopy(data, subscript + 1, data, subscript, data.length - 1 - subscript);
            }
            data = Arrays.copyOf(data, data.length - 1);
            return true;
        } else {
            return false;
        }
    }

    /**  Очищает поле data, удаляя из него элементы
     * @param item удаляемый аргумент
     * @return если елемент удален возвращает true, в ином случае false */

    public boolean delete(T item) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null && data[i].equals(item)) {
                delete(i);
                return true;
            }
        }
        return false;
    }

    /** Сортирует данные записанные в поле data */
    public void sort(Comparator<T> comparator) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (comparator.compare(data[i], data[j]) > 0) {
                    T tmp = data[j];
                    data[j] = data[i];
                    data[i] = tmp;
                }
            }
        }
    }

    /** Переопределяет метод toString
     * @return выводить содержимое data без ячеек в которых хранится null */

    public String toString(Integer[] data) {
        StringBuilder str = new StringBuilder();
        for (T datum : this.data) {
            if (datum != null) {
                str.append(datum).append(" ");
            }
        }
        str.delete(str.length(), str.length());
        return str.toString();
    }

    /** Сортирует данные записанные в поле data */

    public static <T extends Comparable<T>> void sort(DataContainer<T> dataContainer) {
        T[] dataCont = dataContainer.getItems();
        for (int i = 0; i < dataCont.length - 1; i++) {
            if (dataCont[i] == null) {
                T tmp = dataCont[i];
                dataCont[i] = dataCont[i + 1];
                dataCont[i + 1] = tmp;
            } else {
                for (int j = i + 1; j < dataCont.length; j++) {
                    if (dataCont[j] != null) {
                        if (dataCont[i].compareTo(dataCont[j]) > 0) {
                            T tmp = dataCont[j];
                            dataCont[j] = dataCont[i];
                            dataCont[i] = tmp;
                        }
                    }
                }
            }
        }
    }

    /** Сортирует данные записанные в поле data
     * @param container  аргумет для сортировки
     * @param comparator реализация интерфейса */

    public static <T> void sort(DataContainer<T> container, Comparator<T> comparator) {
        T[] data = container.getItems();
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] == null) {
                T tmp = data[i];
                data[i] = data[i + 1];
                data[i + 1] = tmp;
            } else {
                for (int j = i + 1; j < data.length; j++) {
                    if (data[j] != null) {
                        if (comparator.compare(data[i], data[j]) > 0) {
                            T tmp = data[j];
                            data[j] = data[i];
                            data[i] = tmp;
                        }
                    }
                }
            }
        }
    }

    /** Переопределение метода Iterator */

    @Override
    public Iterator<T> iterator() {
        return new DataIterator();
    }

    /** Реализация метода Iterator */
    class DataIterator implements Iterator<T> {

        private int counter;

        /** Проверяет существование последующего элемента
         * @return если елемент существует возвращает true, если елемента нет false */
        @Override
        public boolean hasNext() {
            return counter < data.length;
        }

        /** Переходит на следующий элемент
         * @return возвращает следующий элемент */
        @Override
        public T next() {
            int tmp = counter++;
            if (tmp >= data.length) {
                return null;
            } else {
                return data[tmp];
            }
        }
    }
}