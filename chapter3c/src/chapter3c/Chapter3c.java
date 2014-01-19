/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chapter3c;

/**
 *
 * @author admin
 */
public class Chapter3c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.io.IOException{
        // TODO code application logic here
        char ch, answer = 'K';
        
        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.print("Can you guess it: ");
        
        ch = (char) System.in.read(); //get a char from the user
        
        if(ch == answer) System.out.println("** Right **");
        else{
            System.out.print (".... Sorry, you're letter "+ ch);
            //nested IF
            if(ch < answer) System.out.println(" is too low");
            else System.out.println(" is too high");
        
        }
    }
    
}
