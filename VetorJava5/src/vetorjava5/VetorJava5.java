/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetorjava5;

import java.util.Arrays;

/**
 *
 * @author jeffe
 */
public class VetorJava5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num[] = new int[20];
        Arrays.fill(num, 0);
        for(int valor:num){
            System.out.print(valor + " "); 
        }
    }
    
}
