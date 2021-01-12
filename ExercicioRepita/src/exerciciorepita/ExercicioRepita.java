/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;
/**
 *
 * @author jeffe
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*JOptionPane.showMessageDialog(null, "Olá Mundo!", "Boas Vindas", JOptionPane.WARNING_MESSAGE);*/
        int n, s=0, t=0, i=0, p=0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>Informe um número:  <br><em>(Valor 0 interrompe)</em></html>"));
            s += n;
            t += 1;
            if (n % 2 == 0){
                p += 1;
            }else {
                i += 1;
            }
        } while(n != 0);
        int m = (s/t);
        JOptionPane.showMessageDialog(null, 
                "<html>----- Resultado Final -----" +
                "<br> A soma é: " + s + 
                "<br> Total Digitado: " + t + 
                "<br> Números Pares: " + p + 
                "<br> Númeors ímpares: " + i + 
                "<br> Média: " + m + "</html>" +
                JOptionPane.WARNING_MESSAGE);             
    } 
}