import List.LinkedList;
import MyExceptions.EmptyListException;
import SortSearch.SortingandSearching;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Demo {
    public static void main(String[] args) throws EmptyListException {

        Car car1 = new Car("BMW", "M3 E46", 2005);
        Car car2 = new Car("Subaru", "WRX STI", 2006);
        Car car3 = new Car("McLaren", "730S", 2007);
        Car car4 = new Car("Chevrolet", "Camaro SS", 2008);
        Car car5 = new Car("Tesla", "model S", 2009);

        LinkedList<Car> carlist = new LinkedList();

        carlist.addElement(car1);
        carlist.addElement(car2);
        carlist.addElement(car3);
        carlist.addElement(car4);
        carlist.addElement(car5);

        carlist.printList();

        System.out.println("Resultado: " + SortingandSearching.linearSearch(carlist,car5));
        //System.out.println("Resultado BinarySearch: " + SortingandSearching.binarySearch(carlist,0,4, car1));


    }
}
