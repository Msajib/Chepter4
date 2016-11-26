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
public class PB4_7 {

    public PB4_7() {
        float sum=0;
        for(float i=0.01f;i<=1.0f;i=i+0.01f){
            sum+=i;
            
        }
        System.out.println("The Sum Is "+sum);
    }
    
    
}
