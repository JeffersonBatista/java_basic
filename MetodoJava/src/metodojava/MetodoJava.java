/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodojava;

/**
 *
 * @author jeffe
 */
public class MetodoJava {

    /**
     * @param args the command line arguments
     */
    
    static void soma(int a, int b){
        int s = a + b;
        System.out.println("A Soma é: " + s);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        /* O código é iniciado pelo método main e depois a soma */
        System.out.println("O Programa começou!");
        soma(15,33);
    }
    
}
