/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> tmp = new ArrayList();
        tmp.add("Hello");
        tmp.add("World");
        tmp.add("Bye");
        tmp.add("Earth");

        Collections.sort(tmp, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2
            ) {
                if (o1.length() > o2.length()) {
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                } else {
                    return 0;
                }
            }

        }
        );
    }

}
