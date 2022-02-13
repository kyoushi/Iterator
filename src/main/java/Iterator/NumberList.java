package Iterator;

public class NumberList implements Aggregate {
    private final int[] numbers;
    private int position;

    public NumberList() {
        numbers = new int[5];
        position = 0;
    }

    public void add(int i) {
        numbers[position++] = i;
    }

    public Iterator createIterator() {
        return new NumberListIterator(numbers);
    }
}
