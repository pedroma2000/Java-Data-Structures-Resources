import Exceptions.EmptyCollectionException;

import javax.naming.InsufficientResourcesException;
import java.util.Scanner;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Calculator {

    ArrayStack<Integer> stack = new ArrayStack();

    public Calculator() {

    }

    /**
     *
     */
    public void ask() {
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter postfix expression :");
        input = sc.nextLine();
        processInput(input);
    }

    /**
     *
     * @param input
     */
    public void processInput(String input) {
            String[] inarray = input.split(" ");
            for(int x = 0; x < inarray.length; x++){
                try {
                    Integer tmp = Integer.parseInt(inarray[x]);
                    if (tmp instanceof Integer) {
                        stack.push(tmp);
                    }
                }catch(Exception e){
                    calculate(inarray[x]);
                }
            }
        System.out.println("stack: \n" + stack.toString());
    }

    /**
     *
     * @param op
     */
    public void calculate(String op) {
        int numb1 = 0, numb2 = 0, res = 0;
        String operation = op;

        try {
            switch (operation) {
                case "+":
                    numb1 = stack.pop();
                    numb2 = stack.pop();
                    res = numb1 + numb2;
                    stack.push(res);
                    System.out.println("result = " + res);
                    break;
                case "-":
                    numb1 = stack.pop();
                    numb2 = stack.pop();
                    res = numb1 - numb2;
                    stack.push(res);
                    System.out.println("result = " + res);
                    break;
                case "*":
                    numb1 = stack.pop();
                    numb2 = stack.pop();
                    res = numb1 * numb2;
                    stack.push(res);
                    System.out.println("result = " + res);
                    break;
                case "/":
                    numb1 = stack.pop();
                    numb2 = stack.pop();
                    res = numb1 / numb2;
                    stack.push(res);
                    System.out.println("result = " + res);
                    break;
                default:
                    break;
            }
        } catch (EmptyCollectionException e) {
            e.printStackTrace();
        }
    }
}
