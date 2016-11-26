/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chepter4;

import javax.swing.JOptionPane;

/**
 *
 * @author sajib
 */
public class CP2 {

    public CP2() {
        long startT=System.currentTimeMillis();
        int i=10;
        int j=1;
        while(j<i){
        int num1=(int)(Math.random()*20);
        int num2=(int)(Math.random()*15);
        if(num1<num2){
            int temp=num2;
            num1=num2;
            num2=temp;
        }
        int ans=num1+num2;
        String tResult=JOptionPane.showInputDialog(num1+"+"+num2+" ?");
        int result=Integer.parseInt(tResult);
        
        if(ans==result)
                JOptionPane.showMessageDialog(null, "Your ans is Right");
        else
                JOptionPane.showMessageDialog(null, "Your ans is Wrong");
        j++;
        
        }
        long endT=System.currentTimeMillis();
        long time=endT-startT;
        JOptionPane.showMessageDialog(null, time/1000+" Total Time");
        
        
    }
    
    
}
