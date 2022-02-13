package Iterator;

public class BinaryTree implements Aggregate {

    Node root;

    BinaryTree(int key)
    {
        root = new Node(key);
    }

    BinaryTree()
    {
        root = null;
    }

    @Override
    public Iterator createIterator() {
        return new BinaryTreeIterator(root);
    }
}
