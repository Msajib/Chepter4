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
public class PB2 {

    public PB2() {
        final int NumOfQue=5;
        int correctCount=0;
        int count=0;
        long startTime=System.currentTimeMillis();
        String output="";
        while(count<NumOfQue){
            int num1=(int)(Math.random()*1000);
            int num2=(int)(Math.random()*1000);
            if(num1<num2){
                int temp=num1;
                num1=num2;
                num2=temp;
            
        }
            System.out.println("What Is "+num1+"-"+num2+"?");
            int ans=inp.nextInt();
            if(num1-num2==ans){
                System.out.println("Your Number Is Correct!");
                correctCount++;
            }
            else
                System.out.println("your Ans Is Wrong\n"+num1+"-"+num2+" Should be "+(num1-num2));
        count++;
         output += "\n" + num1 + "-" + num2 + "=" + ans +((num1 - num2 == ans) ? " correct" : " wrong"); 
        }
        long endTime=System.currentTimeMillis();
        long testTime=endTime-startTime;
        System.out.println("Correct cont is "+ correctCount+"\n**Test Time Is** "+testTime/1000+" Secound "+output);
    }
    
    
}
