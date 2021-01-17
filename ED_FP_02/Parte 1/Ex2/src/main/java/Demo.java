
/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Demo {
    public static void main(String[] args) {
        Carro car1 = new Carro("BMW M3 E46");
        Carro car2 = new Carro("Mercedes GL62");
        Carro car3 = new Carro("Ferrari F458");
        Carro car4 = new Carro("Bentley Continental GT");
        Carro car5 = new Carro("Chevrolet Camaro");

        LinkedList<Carro> list1 = new LinkedList();

        System.out.println("");
        list1.addElement(car1);
        list1.addElement(car2);
        list1.addElement(car3);
        //list1.addElement(car4);
        System.out.println("");
    }
}
