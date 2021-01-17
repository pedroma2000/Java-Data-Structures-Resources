/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class UnorderedPairDemo {

    /**
     * @param args the command line arguments
     */
    // TODO code application logic here
    public static void main(String[] args) {
        UnorderedPair<String> p1 = new UnorderedPair("peanuts", "beer");
        UnorderedPair<String> p2 = new UnorderedPair("beer", "peanuts");
//        if (p1.equals(p2)) {
//            System.out.println(p1.getFirst() + " and " + p1.getSecond() + " is the same as");
//            System.out.println(p2.getFirst() + " and " + p2.getSecond());
//        }
        p1.compare();
        System.out.println("");
    }

}
