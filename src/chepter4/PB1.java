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
public class PB1 {
    PB1(){
        int a=0,i=1;
        while(i<10){
            a=a+1;
            i++;
        }
        System.out.println(a);
        
        System.out.println("Guess Number 4.2");
        int number=(int)(Math.random()*101);
        int guess=-1;
        while(guess!=number){
            System.out.println("Enter your guess Number");
            guess=inp.nextInt();
            if(guess==number){
                System.out.println(guess+" This Number IS True BCZ total Number Is: "+number);
            }
            else if(guess>number)
                System.out.println("Number Is Too High");
               else
                System.out.println("Number Is Too low");
        }
       
        
    }
    
    
}
