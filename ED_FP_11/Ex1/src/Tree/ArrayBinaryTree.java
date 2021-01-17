package Tree;

import ArrayUnorderedListPkg.ArrayUnorderedList;
import Exceptions.ElementNotFoundException;
import Exceptions.EmptyListException;
import Interfaces.BinaryTreeADT;
import Queue.LinkedQueue;

import java.util.Iterator;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
abstract class ArrayBinaryTree<T> implements BinaryTreeADT<T> {

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
    public boolean isEmpty() { return (size() == 0); }

    @Override
    public int size() { return count; }

    @Override
    public boolean contains(T targetElement) throws ElementNotFoundException {
        return (search(targetElement) != -1);
    }

    private int search(T targetElement) {
        int result = -1;

        for (int i = 0; i < size(); i++) {
            if (tree[i].equals(targetElement)) {
                result = i;
            }
        }

        return result;
    }

    @Override
    public T find(T targetElement) throws ElementNotFoundException, EmptyListException {

        if (isEmpty()) {
            throw new EmptyListException("Empty List");
        }

        int current = findAgain(targetElement, 0);

        if (current == -1) {
            throw new ElementNotFoundException("Not found in binary tree");
        }

        return (tree[current]);
    }

    /**
     * Returns a reference to the specified target element if it is
     * found in this binary tree.
     *
     * @param targetElement the element being sought in this tree
     * @param next          the element to begin searching from
     */
    protected Integer findAgain(T targetElement, Integer next) {
        if (next == null) {
            return -1;
        }

        if (tree[next].equals(targetElement)) {
            return next;
        }

        int temp = findAgain(targetElement, 2 * next + 1);

        if (temp == -1) {
            temp = findAgain(targetElement, 2 * next + 2);
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
    public Iterator<T> iteratorLevelOrder() throws EmptyListException {

        if (isEmpty()) {
            throw new EmptyListException("Lista vazia");
        }

        LinkedQueue<Integer> Nodes = new LinkedQueue<>();
        ArrayUnorderedList<T> resultList = new ArrayUnorderedList<>();

        Nodes.enqueue(0);

        while (!Nodes.isEmpty()) {
            int tmp = Nodes.dequeue();

            if (tree[tmp] != null) {
                resultList.addToRear(tree[tmp]);
                if ((tmp * 2 + 1) < count && tree[tmp* 2 + 1] != null) {
                    Nodes.enqueue(tmp * 2 + 1);
                }

                if (((tmp + 1) * 2) < tree.length && tree[(tmp + 1) * 2] != null) {
                    Nodes.enqueue((tmp + 1) * 2);
                }
            }
        }

        return resultList.iterator();
    }
}
