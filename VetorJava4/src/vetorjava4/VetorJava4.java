/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetorjava4;

import java.util.Arrays;

/**
 *
 * @author jeffe
 */
public class VetorJava4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vet[] = {3, 5, 7, 4, 6, 2, 9, 5};
        for (int v : vet){
            System.out.println(v + "");
        }
        System.out.println("");
        int p = Arrays.binarySearch(vet, 2);
        System.out.println("Encontrei o valor 5 na posição: " + p);
    }
    
}
