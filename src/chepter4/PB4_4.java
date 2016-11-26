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
public class PB4_4 {
    PB4_4(){
        System.out.println(" Enter an int value (the program exits if the input is 0): ");
        int data=inp.nextInt();
        int sum=0;
        while(data!=0){
            sum+=data;
            System.out.println(" Enter an int value (the program exits if the input is 0): ");
        data=inp.nextInt();
        }
        System.out.println("The sum is " + sum);
    }
    
}
