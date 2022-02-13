package Iterator;

public class StringList implements Aggregate {
    private final String[] words;
    private int position;

    public StringList() {
        words = new String[5];
        position = 0;
    }

    public void add(String w){
        words[position] = w;
        position++;
    }

    @Override
    public Iterator createIterator() {
        return new StringListIterator(words);
    }
}
