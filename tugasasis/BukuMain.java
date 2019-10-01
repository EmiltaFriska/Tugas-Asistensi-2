/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasasis;

/**
 *
 * @author Personal
 */
public class BukuMain {
    public static void main (String [] args){
    BukuClass b1 = new BukuClass ();
    b1.infoBuku();
    
    System.out.println (""); 
    
    BukuClass b2 = new BukuClass ("Ronald", "Statistika", 2000, 3 , 33000);
    b2.infoBuku();

}
}
