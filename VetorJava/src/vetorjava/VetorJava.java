/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetorjava;

/**
 *
 * @author jeffe
 */
public class VetorJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int n[] = new int[5];
        n[0] = 3;
        n[1] = 5;
        n[2] = 9;
        n[3] = 6;
        n[4] = 7;*/
        int n[] = {3, 5, 7, 1, 8, 6, 1, 4, 2, 9};
        int t = n.length-1;/*Um vetor e Java que tem 6 posições vai de 0 á 5*/  
        System.out.println("Total de casas de n é: " + t);
        for ( int c=0; c<=t; c++){
            System.out.println("Na posição " + c + " temos o número: " + n[c]);
        }
        
    }
        /*System.out.println(n[0]);
        System.out.println(n[1]);
        System.out.println(n[2]);
        System.out.println(n[3]);
        System.out.println(n[4]);*/
    }
    

