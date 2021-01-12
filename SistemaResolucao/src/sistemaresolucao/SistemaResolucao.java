/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaresolucao;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author jeffe
 */
public class SistemaResolucao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Toolkit resolucao = Toolkit.getDefaultToolkit();
        Dimension d = resolucao.getScreenSize();
        System.out.println("Largura " + d.width);
        System.out.println("Altura " + d.height);
        System.out.println("A Resolução dos sistema é " + d.width + " x " + d.height);
    }
    
}
