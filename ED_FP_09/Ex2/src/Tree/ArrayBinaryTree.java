package Tree;

import ArrayUnorderedListPkg.ArrayUnorderedList;
import Exceptions.ElementNotFoundException;
import Exceptions.EmptyListException;
import Interfaces.BinaryTreeADT;
import Queue.CircularArrayQueue;

import java.util.Iterator;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class ArrayBinaryTree<T> implements BinaryTreeADT<T> {
    protected int count;
    protected T[] tree;
    private final int CAPACITY = 50;

    /**
     * Creates an empty binary tree.
     */
    public ArrayBinaryTree() {
        count = 0;
        tree = (T[]) new Object[CAPACITY];
    }

    /**
     * Creates a binary tree with the specified element as its root.
     *
     * @param element the element which will become the root
     *                of the new tree
     */
    public ArrayBinaryTree(T element) {
        count = 1;
        tree = (T[]) new Object[CAPACITY];
        tree[0] = element;
    }

    @Override
    public T getRoot() throws ElementNotFoundException {

        if (tree[0] == null) {
            throw new ElementNotFoundException("Root is null");
        }

        return tree[0];
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean contains(T targetElement) throws ElementNotFoundException {
        return targetElement == find(targetElement);
    }

    @Override
    public T find(T targetElement) throws ElementNotFoundException {
        T temp = null;
        boolean found = false;

        for (int ct = 0; ct < count && !found; ct++) {
            if (targetElement.equals(tree[ct])) {
                found = true;
                temp = tree[ct];
            }
        }

        if (!found) {
            throw new ElementNotFoundException("Not found in binary tree");
        }

        return temp;
    }

    @Override
    public Iterator<T> iteratorInOrder() {
        ArrayUnorderedList<T> templist = new ArrayUnorderedList<T>();
        inorder(0, templist);

        return templist.iterator();
    }

    /**
     * Performs a recursive inorder traversal.
     *
     * @param node     the node used in the traversal
     * @param templist the temporary list used in the traversal
     */
    protected void inorder(int node, ArrayUnorderedList<T> templist) {
        if (node < tree.length) {
            if (tree[node] != null) {
                inorder(node * 2 + 1, templist);
                templist.addToRear(tree[node]);
                inorder((node + 1) * 2, templist);
            }
        }
    }

    @Override
    public Iterator<T> iteratorPreOrder() {
        ArrayUnorderedList<T> templist = new ArrayUnorderedList<T>();
        preorder(0, templist);

        return templist.iterator();
    }

    /**
     * Performs a recursive preorder traversal.
     *
     * @param node     the node used in the traversal
     * @param templist the temporary list used in the traversal
     */
    protected void preorder(int node, ArrayUnorderedList<T> templist) {
        if (node < tree.length) {
            if (tree[node] != null) {
                templist.addToRear(tree[node]);
                preorder(node * 2 + 1, templist);
                preorder((node + 1) * 2, templist);
            }
        }
    }

    @Override
    public Iterator<T> iteratorPostOrder() {
        ArrayUnorderedList<T> templist = new ArrayUnorderedList<T>();
        postorder(0, templist);

        return templist.iterator();
    }

    /**
     * Performs a recursive postorder traversal.
     *
     * @param node     the node used in the traversal
     * @param templist the temporary list used in the traversal
     */
    protected void postorder(int node, ArrayUnorderedList<T> templist) {
        if (node < tree.length) {
            if (tree[node] != null) {
                postorder(node * 2 + 1, templist);
                templist.addToRear(tree[node]);
                postorder((node + 1) * 2, templist);
            }
        }
    }

    @Override
    public Iterator<T> iteratorLevelOrder() throws ElementNotFoundException {
        CircularArrayQueue<T> Nodes = new CircularArrayQueue<>();
        ArrayUnorderedList<T> resultList = new ArrayUnorderedList<>();
        int node = 0;

        if (tree[0] == null) {
            throw new ElementNotFoundException("Root é null");
        }

        Nodes.enqueue(tree[0]);

        while (!Nodes.isEmpty()) {
            T tmp = Nodes.dequeue();

            if (tmp != null) {
                resultList.addToRear(tmp);

                if (tree[node * 2 + 1] != null) {
                    Nodes.enqueue(tree[node * 2 + 1]);
                    //guarda posição do filho pra proxima iteração
                    node = node * 2 + 1;

                } else if (tree[(node + 1) * 2] != null) {
                    Nodes.enqueue(tree[(node + 1) * 2]);
                    //guarda posição do filho pra proxima iteração
                    node = (node + 1) * 2;
                }

            }

        }

        return resultList.iterator();
    }
}
