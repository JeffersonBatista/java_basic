/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcaojava;

/**
 *
 * @author jeffe
 */
public class FuncaoJava {

    /**
     * @param args the command line arguments
     */
    
    static int soma (int a, int b){/* Static é importante pois um método estático só consegue chamar algo que também seja estático*/
       int s = a + b;
       return s;
       /* Diferente do método, a função retorna um valor*/
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int sm = soma(13,26);
        System.out.println("A soma vale: "+ sm);
    }
    
}
