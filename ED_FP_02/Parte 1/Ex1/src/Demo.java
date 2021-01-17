import MyExceptions.EmptyListException;
import MyExceptions.NodeNotFoundException;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Demo {

    public static void main(String[] args) throws NodeNotFoundException, EmptyListException {

        Carro car1 = new Carro("BMW M3 E46");
        Carro car2 = new Carro("Mercedes GL62");
        Carro car3 = new Carro("Ferrari F458");
        Carro car4 = new Carro("Bentley Continental GT");
        Carro car5 = new Carro("Chevrolet Camaro");
        //Carro car6 = new Carro("Bugatti Chiron");

        LinkedList<Carro> list1 = new LinkedList();

        System.out.println("");

        list1.addElement(car1);
        list1.addElement(car2);
        list1.addElement(car3);
        list1.addElement(car4);
        list1.addElement(car5);
        System.out.println("Old List : \n");
        list1.printList();
        //System.out.println("");
        //teste remover o primeiro
        list1.remove(car1);

        //teste remover do meio
        //list1.remove(car1);
        //list1.remove(car2);
        list1.remove(car3);
        list1.remove(car4);

        //teste remover ultimo
        //list1.remove(car5);

        System.out.println("New List : \n");
        list1.printList();

        //list1.printList();
        System.out.println("");
        System.out.println("");
    }

}
