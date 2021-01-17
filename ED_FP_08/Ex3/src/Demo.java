
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

        Car cararray[] = new Car[5];
        cararray[0] = car3;
        cararray[1] = car1;
        cararray[2] = car5;
        cararray[3] = car2;
        cararray[4] = car4;

        System.out.println("Desordenado: ");
        for (int i = 0; i < cararray.length; ++i){
            System.out.println(cararray[i].toString());
        }

        Sorting.quickSort(cararray,0,4);

        System.out.println("");
        System.out.println("Ordenado: ");
        for (int i = 0; i < cararray.length; ++i){
            System.out.println(cararray[i].toString());
        }
    }
}
