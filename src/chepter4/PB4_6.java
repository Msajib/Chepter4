/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chepter4;

/**
 *
 * @author sajib
 */
public class PB4_6 {

    public PB4_6() {
        System.out.println("  ****Multiplication Table****");
        for(int j=1;j<=9;j++)
            System.out.print("   "+j);
            System.out.println("\n———————————————————————--");
            for(int i=1;i<=9;i++){
                System.out.println(i+"|");
            for(int j=1;j<=9;j++){
                System.out.print(String.format("%4d", i*j));
            }
                System.out.println(" ");
        }
    }
    
    
}
