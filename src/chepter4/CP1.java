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
public class CP1 {

    public CP1() {
        System.out.println("Enter Here:");
        int num1=inp.nextInt();
        int num2=inp.nextInt();
        int num3=inp.nextInt();
        int num4=inp.nextInt();
        int countP=0;
        int countN=0;
        
        
            if(num1<0){
                
            countN +=1;
            }
            else
            {
            countP +=1;
            
            }
            
            if(num2<0){
                
            countN +=1;
            }
            else
            
            countP +=1;
            if(num3<0){
                
            countN +=1;
            }
            else
            
            countP +=1;
            if(num4<0){
                
            countN +=1;
            }
            else
            
            countP +=1;
        System.out.println("The Number Of Positives Number Is "+countP);
        System.out.println("The Number Of Negatives Number Is "+countN);
    }
    
    
}
