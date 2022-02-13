package Iterator;

import java.util.Arrays;

public class Client {
    public static void main( String[] args )
    {
        Iterator iterator;

        System.out.println("=====Data Type: Integer Array====");

        NumberList nl = new NumberList();
        nl.add(7);
        nl.add(3);
        nl.add(4);
        nl.add(2);
        nl.add(1);

        iterator = nl.createIterator();
        while(iterator.hasNext()){
            int number = (int) iterator.next();
            System.out.println(number);
        }

        System.out.println("=====Data Type: String Array=====");

        StringList wl = new StringList();
        wl.add("Car");
        wl.add("Airplane");
        wl.add("Bicycle");
        wl.add("Train");
        wl.add("Boat");

        iterator = wl.createIterator();
        while(iterator.hasNext()){
            String word = (String) iterator.next();
            System.out.println(word);
        }

        System.out.println("=====Data Type: Binary Tree=====");

        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);

        iterator = tree.createIterator();
        while(iterator.hasNext()){
            Integer key = (int) iterator.next();
            System.out.println(key);
        }

    }
}
