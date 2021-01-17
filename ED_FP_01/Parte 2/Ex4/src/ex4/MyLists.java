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
public class MyLists <T>{
    
    private List<T> c = new ArrayList<T>();

    public MyLists() {
    }
    
    public void addToList(T e){
        c.add(e);
    }
    
    public void print(){
        System.out.println("List :\n" + c);
    }
    
    public void SortList(){
        ComparatorStrings comp = new ComparatorStrings();
        

    }
    

}
