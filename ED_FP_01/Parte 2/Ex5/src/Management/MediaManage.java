/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management;

import MediaStructure.media;
import java.util.ArrayList;

/**
 *
 * @author Pedro Machado "pedroma2000"
 * @param <T>
 */
public class MediaManage<T extends media> {
    
    //ArrayList with any type of media
    private ArrayList<T> myList = new ArrayList<>();

    /**
     * Class Default constructor
     */
    public MediaManage() {
    }
    
    /**
     * add T to a list
     * @param med
     */
    public void addToList(T med){
        myList.add(med);
    }
    
    /**
     * method get a specific List item with given position
     * @param position
     * @return
     */
    public  T getFromList(int position){      
        return myList.get(position);           
    }
    
    /**
     * method wich prints the whole media list
     */
    public  void getTheList(){      
        for (T i:myList){
            System.out.println(i.toString());
        }          
    }
}
