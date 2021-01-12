/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetorjava3;

import java.util.Arrays;

/**
 *
 * @author jeffe
 */
public class VetorJava3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double v[] = {3.5, 7.9, 10, 8.5, 9.4, 3.9, 12.5};
        int c = 0;
        Arrays.sort(v);/*Arrays coloca os números em ordem*/
        for(double valor: v){
            System.out.println("O número na posição " + c + " é: " + valor);
            c++;
        }
    }
    
}
