package Iterator;

import Iterator.Iterator;

public class StringListIterator implements Iterator{
    private String[] words = new String[5];
    private int position;


    public StringListIterator(String[] words) {
        this.words = words;
    }

    @Override
    public Object next() {
        return words[position++];
    }

    @Override
    public boolean hasNext() {
        return position < 5;
    }
}
