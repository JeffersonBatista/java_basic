/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

/**
 *
 * @author jeffe
 */
public class Prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*for (int i = 1; i < 5; i++){
            if (i==2) continue;
            System.out.println("i =" + i);
        }*/
        /*int x,y;
        double z;
        x = 5;
        y = 2;
        z = x/y;
        System.out.println(z);
    }*/
       /* int v0 = 3;
        int v1 = v0++;
        int v2 = ++v1;
        v1 += v0;
        v2 += --v1;
        System.out.println(v0);
        System.out.println(v1);
        System.out.println(v2);*/
       int total = 0;
int c[] = new int[13];
for (int i = 0; i<c.length; i++) {
	c[i] = i + i;
}
for (int i = 0; i<c.length; i++) {
	total += c[i];
}
System.out.println(total);
    }
}
