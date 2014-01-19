/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chapter3a;

/**
 *
 * @author admin
 */
public class Chapter3a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.io.IOException {
        // TODO code application logic here
        //Read a character from the keyboard. 
        char ch; 
        System.out.print("Press a key followed by ENTER: ");
       ch = (char) System.in.read(); //get a char or Read a character from the keyboard
        System.out.println("Your key is : " + ch);
    }
    
}
