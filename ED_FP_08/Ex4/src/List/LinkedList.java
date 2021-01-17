package List;

import MyExceptions.EmptyListException;
import MyExceptions.NodeNotFoundException;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class LinkedList<T> {

    private int counter = 0;
    private LinearNode<T> head, tail;

    /**
     *
     */
    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    /**
     * @param data
     * @return
     */
    public void addElement(T data) {

        LinearNode newNode = new LinearNode<>(data);

        if (this.head == null) {
            this.head = newNode;
            this.tail = this.head;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
        counter++;
    }

    /**
     * @param data
     */
    public boolean remove(T data) throws NodeNotFoundException, EmptyListException {
        //se nao houver conteudo na lista
        if (counter == 0) {
            throw new EmptyListException("List is Empty!");
        } else {

            LinearNode current = this.head;
            LinearNode p = null;
            boolean found = false;

            while (current != null && found == false) {

                if (current.getData() == data) {
                    found = true;
                } else {
                    p = current;
                    current = current.getNext();
                }
            }

            if (found == true) { //so se remove se o nodo for encontrado

                if (this.head.getData().equals(data) || this.head.getData().equals(null)) { //remover o primeiro com ou sem data
                    this.head.setNext(current.getNext());
                    this.head = current.getNext();

                    if (current.equals(tail)) { //se o primeiro nodo for o unico elemento da lista
                        this.tail = null;
                    }

                } else if (current != this.tail && current.getData().equals(data) || current.getData().equals(null)) { //remover do meio com ou sem data
                    p.setNext(current.getNext());

                } else if (this.tail.getData().equals(data) || this.tail.getData().equals(null)) {//remover ultimo com ou sem data
                    p.setNext(tail.getNext());
                    this.tail = p;
                }

                counter--; //decrementar o counter na remoção
                return found;
            } else { //se nao for encontrado lança exception
                throw new NodeNotFoundException("Node Not found!!");
            }
        }
    }


    /**
     * Imprimir todos os elementos da list
     */
    public void printList() throws EmptyListException {
        LinearNode Node = this.head;
        //só imprime se houver elementos na lista
        while (Node != null) {
            System.out.println(Node.getData().toString());

            Node = Node.getNext();
        }

        if (counter == 0){
            throw new EmptyListException("Lista vazia");
        }
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public LinearNode<T> getHead() {
        return head;
    }

    public void setHead(LinearNode<T> head) {
        this.head = head;
    }

    public LinearNode<T> getTail() {
        return tail;
    }

    public void setTail(LinearNode<T> tail) {
        this.tail = tail;
    }
}
