/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturarepeticaoenquanto;

/**
 *
 * @author jeffe
 */
public class EstruturaRepeticaoEnquanto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc = 0;
        while (cc < 10){
        cc++;
        if (cc == 2 || cc == 3 || cc == 4){
           continue;/*Na condição citada, o continue joga o programa pra cima*/ 
        }
        if (cc == 8){
            break;/*Na condição citada, o break encerra o looping*/
        }
        System.out.println("cambalhota "+ (cc));
        }
            System.out.println("O contador chegou á " + cc + ", portanto finalizou o loop");
        }
    }

