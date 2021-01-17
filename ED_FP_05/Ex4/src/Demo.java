import Interfaces.UnorderedArrayListADT;
import UnorderedArrayListpkg.UnorderedArrayList;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Demo {
    public static void test(int test) {

        UnorderedArrayListADT<Integer> tmp = new UnorderedArrayList<>();

        switch (test) {
            // Teste para removeFirst quando está empty
            case 1:
                System.out.println("Imprimir null. Resultado: " + tmp.removeFirst());
                break;
            // Teste para removeFirst quando está com 1 elemento
            case 2:
                tmp.addToFront(3);
                System.out.println("Imprimir 3. Resultado: " + tmp.removeFirst());
                break;
            // Teste para removeFirst quando está com 2 elementos
            case 3:
                tmp.addToFront(3);
                tmp.addToFront(2);
                System.out.println("Imprimir 2. Resultado: " + tmp.removeFirst());
                break;
            //Teste para removeFirst quando está com 3 elementos
            case 4:
                tmp.addToFront(1);
                tmp.addToFront(2);
                tmp.addToFront(3);
                System.out.println("Imprimir 3. Resultado: " + tmp.removeFirst());
                break;
            // Teste para removeLast quando está empty
            case 5:
                System.out.println("Imprimir null. Resultado: " + tmp.removeLast());
                break;
            // Teste para removeLast quando está com 1 elemento
            case 6:
                tmp.addToFront(3);
                System.out.println("Imprimir 3. Resultado: " + tmp.removeLast());
                break;
            // Teste para removeLast quando está com 2 elementos
            case 7:
                tmp.addToFront(2);
                tmp.addToFront(3);
                System.out.println("Imprimir 2. Resultado: " + tmp.removeLast());
                break;
            // Teste para removeLast quando está com 3 elementos
            case 8:
                tmp.addToFront(1);
                tmp.addToFront(2);
                tmp.addToFront(3);
                System.out.println("Imprimir 1. Resultado: " + tmp.removeLast());
                break;
            // Teste para remove sem elementos
            case 9:
                System.out.println("Return null. Resultado : " + tmp.remove(1));
                System.out.println(tmp.toString());
                break;
            // Teste para remover 1 elemento
            case 10:
                tmp.addToFront(1);
                System.out.println("Return 1. Resultado : " + tmp.remove(1));
                System.out.println(tmp.toString());
                break;
            // Teste para addAfter
            case 11:
                tmp.addToFront(3);
                tmp.addAfter(2, 3);
                tmp.addAfter(1, 2);
                tmp.addAfter(6, 1);
                tmp.addToRear(7);
                System.out.println("\n" + tmp.toString());
                break;
            default:
                break;
        }

    }

    public static void main(String[] args) {
        test(11);
    }
}