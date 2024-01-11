import java.util.Iterator;

public class CustomList implements Iterable {

    private int[] array;

    public CustomList(int[] array) {

        this.array = array;
    }

    @Override
    public Iterator iterator() {
        Iterator result = new Customiterator(this.array);
        return result;
    }


    public void add(int number) {
        int[] newArr = new int[this.array.length + 1];
        for (int i = 0; i < this.array.length; i++) {
            newArr[i] = this.array[i];
        }
        newArr[this.array.length] = number;
        this.array = newArr;
    }

    public void remove(int number) {
        int indexRemove = -1;
        for (int i = 0; i < this.array.length; i++) {
            if (array[i] == number) {
                indexRemove = i;

            }
        }
        if (indexRemove != -1) {
            int[] newArr = new int[this.array.length - 1];
            array = newArr;
        }
    }

    public int indexOf(int number1) {
        for (int i = 0; i < this.array.length; i++) {
            if (array[i] == number1) {
                return i;
            }

        }
        return -1;
    }
}



