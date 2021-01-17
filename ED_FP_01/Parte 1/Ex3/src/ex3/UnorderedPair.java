/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

/**
 *
 * @author Pedro Machado "pedroma2000"
 * @param <T>
 */
public class UnorderedPair<T extends Comparable> extends Pair<T>{

    /**
     *
     */
    public UnorderedPair() {
        setFirst(null);
        setSecond(null);
    }

    public UnorderedPair(T firstItem, T secondItem) {
        setFirst(firstItem);
        setSecond(secondItem);
    }

    /**
     *
     * @param otherObject
     * @return
     */
    @Override
    public boolean equals(Object otherObject) {
        if (otherObject == null) {
            return false;
        } else if (getClass() != otherObject.getClass()) {
            return false;
        } else {
            UnorderedPair<T> otherPair = (UnorderedPair<T>) otherObject;
            return (getFirst().equals(otherPair.getFirst()) && getSecond().equals(otherPair.getSecond())) || (getFirst().equals(otherPair.getSecond()) && getSecond().equals(otherPair.getFirst()));
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }
     public T getFirstItem(){
         return super.getFirst();
    }
    
    public T getSecondItem(){
        return super.getSecond();
    }
    
    public boolean compare(){
        return super.getFirst().equals(super.getSecond());
    }
}