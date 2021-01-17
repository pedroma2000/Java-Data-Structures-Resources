
/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Demo {
    public static void main(String[] args) {

        int test = 3;
        LinkedStack<String> lstack = new LinkedStack();

        try {

            switch (test) {
                case 1: //add elements
                    lstack.push("Hello");
                    lstack.push("World");
                    lstack.push("of");
                    lstack.push("Data");
                    lstack.push("Structures");
                    System.out.println(lstack.toString());
                    break;
                case 2: //remove
                    lstack.push("Hello");
                    lstack.push("World");
                    lstack.push("of");
                    lstack.push("Data");
                    lstack.push("Structures");
                    lstack.pop();
                    lstack.pop();
                    lstack.pop();
                    System.out.println(lstack.toString());
                    break;
                case 3: //remove with empty list
                    lstack.pop();
                case 4: //peak
                    lstack.push("Hello");
                    lstack.push("World");
                    lstack.push("of");
                    lstack.push("Data");
                    lstack.push("Structures");
                    System.out.println(lstack.peek());
                    break;
                case 5://empty peak
                    System.out.println(lstack.peek());
                default:
                    break;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            ;
        }

    }
}
