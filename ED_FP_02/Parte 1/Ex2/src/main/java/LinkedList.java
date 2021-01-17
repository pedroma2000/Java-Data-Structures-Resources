import MyExceptions.EmptyListException;
import MyExceptions.NodeNotFoundException;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class LinkedList<T> {

    private int counter;


    private Node<T> sentinelhead = new Node<>(null);
    private Node<T> sentineltail = new Node<>(null);;

    LinkedList(){
        this.sentinelhead.setNext(this.sentineltail);
        this.sentineltail.setNext(this.sentinelhead);
    }


    public void addElement(T data){

        Node newNode = new Node<>(data);


        if (this.sentinelhead.getNext() == sentineltail) {
            this.sentinelhead.setNext(newNode);
            this.sentineltail.setNext(newNode);

        } else if (this.sentinelhead.getNext() != current){
            current.setNext(newNode);
            this.sentineltail.setNext(newNode);
        }
        current = current.getNext();
        counter++;
    }


    /*
    public boolean remove(T data) throws NodeNotFoundException, EmptyListException {

        if (counter == 0) { //se nao houver conteudo na lista
            throw new EmptyListException("List is Empty!");
        } else {

            Node current = this.sentinelhead;
            Node p = null;
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

                if (this.sentinelhead.getData().equals(data) || this.sentinelhead.getData().equals(null)) { //remover o primeiro com ou sem data
                    this.sentinelhead.setNext(current.getNext());
                    this.sentinelhead = current.getNext();


                    if (current.equals(tail)) { //se o primeiro nodo for o unico elemento da lista
                        this.tail = null;
                    }

                }


                else if (current != this.tail && current.getData().equals(data) || current.getData().equals(null)) { //remover do meio com ou sem data
                    p.setNext(current.getNext());

                }
                else if (this.tail.getData().equals(data) || this.tail.getData().equals(null)) {//remover ultimo com ou sem data
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

    /*
    public void printList(){

        Node Node = sentinelhead;
        for(int i = 0; i <= counter && Node.getData() != sentinelhead.getData(); i++) {
            // Print da informação
            System.out.print(Node.toString() + "\n");

            Node = Node.getNext();
        }

    }
    */
}