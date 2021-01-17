/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;


import Management.MediaManage;
import MediaStructure.music;
import MediaStructure.video;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class DemoEx5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        music m1 = new music("music 1");
        music m2 = new music("music 2");
        music m3 = new music("music 3");
        video v1 = new video("video 1");
        video v2 = new video("video 2");
        video v3 = new video("video 3");
        
        MediaManage<music> mn = new MediaManage<>();
        
        mn.addToList(m1);
        mn.addToList(m2);
        mn.addToList(m3);
        
        //System.out.println(mn.getFromList(0).toString());
        mn.getTheList();
        
        MediaManage<video> mn2 = new MediaManage<>();
        
        mn2.addToList(v1);
        mn2.addToList(v2);
        mn2.addToList(v3);
        
        mn2.getTheList();
        
    }
    
}
