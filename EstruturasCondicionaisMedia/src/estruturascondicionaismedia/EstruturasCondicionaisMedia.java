/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturascondicionaismedia;

import java.util.Scanner;

/**
 *
 * @author jeffe
 */
public class EstruturasCondicionaisMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Estrutura Condicional Simples*/
        /*Scanner teclado = new Scanner(System.in);
        System.out.print("Primeira Nota: ");
        float n1 = teclado.nextFloat();
        System.out.print("Segunda Nota: ");
        float n2 = teclado.nextFloat();
        float m = (n1 + n2) / 2;
        System.out.println("Sua média foi " + m + ".");
        if (m>=9) {
            System.out.println("Parabéns!!!");
        }
            /*Estrutura Condicional Composta*/
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a Primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.print("Segunda nota: ");
        float n2 = teclado.nextFloat();
        System.out.print("Terceira nota: ");
        float n3 = teclado.nextFloat();
        float m = (n1 + n2 + n3) / 3;
            System.out.println("Sua média foi: " + m + ".");
        String msg1 = "Parabéns, você foi aprovado!";
        String msg2 = "VOCÊ FOI REPROVADO!";
        if (m >= 6){
            System.out.println(msg1);
        } else {
            System.out.println(msg2);
        }
    }    
}