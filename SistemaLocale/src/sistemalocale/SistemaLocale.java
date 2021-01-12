/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemalocale;

import java.util.Locale;

/**
 *
 * @author jeffe
 */
public class SistemaLocale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Locale locale = Locale.getDefault();
        System.out.println("O idioma do Sistema está em ");
        System.out.println(locale.getDisplayLanguage());
    }
    
}
