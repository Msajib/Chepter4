/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chepter4;

import static chepter4.Chepter4.inp;

/**
 *
 * @author sajib
 */
public class PB4_8 {

    public PB4_8() {
        System.out.println("Enter First Integer ");
        int n1=inp.nextInt();
        System.out.println("Enter Seound Integer ");
        int n2=inp.nextInt();
        int gcd=1;
        int k=2;
        while(k<=n1&&k<=n2){
            if(n1%k==0&&n2%k==0)
                gcd=k;
            k++;
        }
        System.out.println("The greatest common divisor for " + n1 +" and " + n2 + " is " + gcd); 
    }
    
    
}
