package Iterator;

import Iterator.Iterator;

public class NumberListIterator implements Iterator{
    private final int[] numbers;
    private int position;

    public NumberListIterator(int num[]){
        this.numbers = num;
        this.position = 0;
    }

    @Override
    public Object next() {
        return numbers[position++];
    }

    @Override
    public boolean hasNext() {
        return position < numbers.length;
    }
}
