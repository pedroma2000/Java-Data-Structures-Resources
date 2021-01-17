import List.LinkedList;
import MyExceptions.EmptyListException;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Demo {
    public static void main(String[] args) throws EmptyListException {

        Car car1 = new Car("BMW", "M3 E46", 2020);
        Car car2 = new Car("Subaru", "WRX STI", 2018);
        Car car3 = new Car("McLaren", "730S", 2020);
        Car car4 = new Car("Chevrolet", "Camaro SS", 2015);
        Car car5 = new Car("Tesla", "model S", 2005);

        LinkedList<Car> carlist = new LinkedList();

        carlist.addElement(car1);
        carlist.addElement(car2);
        carlist.addElement(car3);
        carlist.addElement(car4);
        carlist.addElement(car5);


        System.out.println("Unsorted :");
        carlist.printList();
        System.out.println("");

        Sorting.bubbleSort(carlist);

        System.out.println("Sorted :");
        carlist.printList();

    }
}
