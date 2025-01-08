/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RAD3ON
 */
import javax.swing.JOptionPane;

public class Sequential {
    
    public static void main(String[]args){
    //declaration of variables
    String firstNumber,secondNumber;
    firstNumber=JOptionPane.showInputDialog("Input the 1st Number");
    secondNumber=JOptionPane.showInputDialog("Input the 2nd Number");
int num1,num2,sum;
num1=Integer.parseInt(firstNumber);
num2=Integer.parseInt(secondNumber);
//compute Sum
    sum=(num1+num2);
    //output
        //system.out.println("sum="+sum); //for print on Terminal
    JOptionPane.showConfirmDialog(null,"Sum of the two Number is :"+sum,"Two Inetegers",JOptionPane.PLAIN_MESSAGE);
    
    }
    
}
