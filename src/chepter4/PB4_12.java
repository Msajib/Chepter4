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
public class PB4_12 {

    public PB4_12() {
        System.out.println("Number Input");
        
        int sum=0;
        for(int i=1;i<=20;i++){
        
            if(prime(i))
                System.out.println(i);
               continue;
            
            
        }
        
    }
    public boolean prime(int number){
        for(double j=2;j<=number/2;j++){
            if(number%j==0)
                return false;
        }
        return true;
    }
    
    
    
}
