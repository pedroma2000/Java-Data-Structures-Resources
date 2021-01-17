/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TwoTypePair<String,String > obj = new TwoTypePair("Stuff1", "Stuff2");
        TwoTypePair<String,String> obj2 = new TwoTypePair("Stuff1", "Stuff2");
        System.out.println(obj.equals(obj2));
        
        
        
        
    }
    
}
