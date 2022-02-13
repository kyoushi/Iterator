package Iterator;

import java.util.Stack;

public class BinaryTreeIterator implements Iterator{

    Stack<Node> stack;

    public BinaryTreeIterator(Node root) {

        this.stack = new Stack<Node>();

        this.leftMostNode(root);
    }

    private void leftMostNode(Node root) {

        while (root !=null) {
            this.stack.push(root);
            root = root.left;
        }
    }

    @Override
    public Object next() {
        Node topmostNode = this.stack.pop();

        if (topmostNode.right !=null) {
            this.leftMostNode(topmostNode.right);
        }

        return topmostNode.key;
    }

    @Override
    public boolean hasNext() {
        return this.stack.size() > 0;
    }
}
