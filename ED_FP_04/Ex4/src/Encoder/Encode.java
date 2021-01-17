package Encoder;

import Exceptions.WrongKeyInputException;
import Queue.CircularArrayQueue;

import java.util.Scanner;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Encode {

    CircularArrayQueue<Integer> key = new CircularArrayQueue<>();

    public Encode() {
    }

    public void ask() throws WrongKeyInputException {
        String input;
        String inputkey;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Message :");
        input = sc.nextLine();
        System.out.println("Enter your Key :");
        inputkey = sc.nextLine();
        processData(input, inputkey);
    }

    public void processData(String message, String inputkey) {
        Integer tmp;
        char[] tmp_message = message.toCharArray();

        String[] inarray = inputkey.split(" ");
        for (int x = 0; x < inarray.length; x++) {
            tmp = Integer.parseInt(inarray[x]);
            if (tmp instanceof Integer) {
                key.enqueue(tmp);
            }
        }


        EncodeMessage(tmp_message);
    }

    public void EncodeMessage(char[] message) {
        int keyval;
        int newchar;
        char tmp;
        String result = "";

        for (int i = 0; i < message.length; i++) {
            if (message[i] != ' ') {
                keyval = key.dequeue();
                if (Character.isUpperCase(message[i])) {
                    newchar = (message[i] + keyval - 65) % 26 + 65;
                } else {
                    newchar = (message[i] + keyval - 97) % 26 + 97;
                }
                tmp = (char) newchar;
                result += tmp;
            } else {
                result += " ";
            }

        }
        System.out.println(result);
    }

}

/*
knowledge is power
3 1 7 4 2 5 3 1 7 4 2 5 3 1 7 4
 */