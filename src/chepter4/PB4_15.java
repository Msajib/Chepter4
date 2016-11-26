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
public class PB4_15 {
    PB4_15(){
        int sum=0;
        int option=JOptionPane.YES_OPTION;
        while(option==JOptionPane.YES_OPTION){
        String dataString=JOptionPane.showInputDialog("Enter An Int Value:");
        int data=Integer.parseInt(dataString);
        sum+=data;
        option=JOptionPane.showConfirmDialog(null,"Continue?");
        
    }
    JOptionPane.showMessageDialog(null ," The Sum Is " +sum);
    
}
}
