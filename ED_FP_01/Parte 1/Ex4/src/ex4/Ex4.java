/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.Collection;
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
        List<?> c = new ArrayList<String>();        
        printCollection(c);
    }
    
    static void printCollection(Collection<Object> c) {
        for (Object e : c) {
            System.out.println(e);
        }
    }

}
//Ex5 feito no enunciado