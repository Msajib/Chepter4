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
public class PB3 {
    PB3(){
        for(int i=0;i<10;i++){
        int num1=(int)(Math.random()*10);
        int num2=(int)(Math.random()*10);
        int operetor=(int)(Math.random()*5);
        
        int ope=0;
        
        if(operetor%5==1){
            ope=num1+num2;
            System.out.println(num1+"+"+num2+"="+"?");
            System.out.println("Enter Your Answer ");
            int ans=inp.nextInt();
            if(ans==ope){
                System.out.println("Your Ans "+ans+" Is Correct");
            }
            else
                System.out.println("Your Ans "+ans+" Is Wrong");
        }
        else if (operetor%5==2){
            ope=num1-num2;
            System.out.println(num1+"-"+num2+"="+"?");
            System.out.println("Enter Your Answer ");
            int ans=inp.nextInt();
            if(ans==ope){
                System.out.println("Your Ans "+ans+" Is Correct");
            }
            else
                System.out.println("Your Ans "+ans+" Is Wrong");
            
        }
        else if (operetor%5==3){
            ope=num1/num2;
            System.out.println(num1+"/"+num2+"="+"?");
            System.out.println("Enter Your Answer ");
            int ans=inp.nextInt();
            if(ans==ope){
                System.out.println("Your Ans "+ans+" Is Correct");
            }
            else
                System.out.println("Your Ans "+ans+" Is Wrong");
            
        }
        else if (operetor%5==4){
            ope=num1*num2;
            System.out.println(num1+"*"+num2+"="+"?");
            System.out.println("Enter Your Answer ");
            int ans=inp.nextInt();
            if(ans==ope){
                System.out.println("Your Ans "+ans+" Is Correct");
            }
            else
                System.out.println("Your Ans "+ans+" Is Wrong");
            
        }
        else if(operetor%5==0){
             if(operetor%5==1){
            ope=num1+num2;
            System.out.println(num1+"+"+num2+"="+"?");
            System.out.println("Enter Your Answer ");
            int ans=inp.nextInt();
            if(ans==ope){
                System.out.println("Your Ans "+ans+" Is Correct");
            }
            else
                System.out.println("Your Ans "+ans+" Is Wrong");
        }
        else if (operetor%5==2){
            ope=num1-num2;
            System.out.println(num1+"-"+num2+"="+"?");
            System.out.println("Enter Your Answer ");
            int ans=inp.nextInt();
            if(ans==ope){
                System.out.println("Your Ans "+ans+" Is Correct");
            }
            else
                System.out.println("Your Ans "+ans+" Is Wrong");
            
        }
        else if (operetor%5==3){
            ope=num1/num2;
            System.out.println(num1+"/"+num2+"="+"?");
            System.out.println("Enter Your Answer ");
            int ans=inp.nextInt();
            if(ans==ope){
                System.out.println("Your Ans "+ans+" Is Correct");
            }
            else
                System.out.println("Your Ans "+ans+" Is Wrong");
            
        }
        else if (operetor%5==4){
            ope=num1*num2;
            System.out.println(num1+"*"+num2+"="+"?");
            System.out.println("Enter Your Answer ");
            int ans=inp.nextInt();
            if(ans==ope){
                System.out.println("Your Ans "+ans+" Is Correct");
            }
            else
                System.out.println("Your Ans "+ans+" Is Wrong");
            
        }
            
        }
        else
            System.out.println("Thanks Too Use");
            
    }
    }
    
}
