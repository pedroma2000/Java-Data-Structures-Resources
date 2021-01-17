package BinaryTree;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class HeapNode<T> extends BinaryTreeNode<T> {
    protected HeapNode<T> parent;

    public HeapNode(T element) {
        super(element);
        parent = null;
    }
}