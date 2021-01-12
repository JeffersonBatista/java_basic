/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitivostipos;

import java.util.Scanner;

/**
 *
 * @author jeffe
 */
public class PrimitivosTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno:");
        String nome = teclado.nextLine();
        System.out.print("Digite a primeira nota do aluno:");
        float nota1 = teclado.nextFloat();
        System.out.print("Digite a segunda nota do aluno:");
        float nota2 = teclado.nextFloat();
        float media = ((nota1 + nota2)/2);
        System.out.printf("a média do %s é %.2f \n", nome, media);
        
    }
    
}
