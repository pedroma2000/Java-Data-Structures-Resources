import SortSearch.SortingandSearching;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Demo {
    public static void main(String[] args) {

        Car car1 = new Car("BMW", "M3 E46", 2005);
        Car car2 = new Car("Subaru", "WRX STI", 2006);
        Car car3 = new Car("McLaren", "730S", 2007);
        Car car4 = new Car("Chevrolet", "Camaro SS", 2008);
        Car car5 = new Car("Tesla", "model S", 2009);

        Car cararray[] = new Car[10];
        cararray[0] = car1;
        cararray[1] = car2;
        cararray[2] = car3;
        cararray[3] = car4;
        cararray[4] = car5;

        System.out.println("Resultado: " + SortingandSearching.linearSearch(cararray, 0, 4, car5));
        System.out.println("Resultado BinarySearch: " + SortingandSearching.binarySearch(cararray,0,4, car1));


    }
}
