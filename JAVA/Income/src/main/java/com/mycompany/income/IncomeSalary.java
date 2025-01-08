/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.income;

/**
 *
 * @author USER
 */
import javax.swing.JOptionPane;
public class IncomeSalary {
    
    public static void main(String[] args) {
        double Allowance=4000;
        int A;60006655
        do{
        String Salary=JOptionPane.showInputDialog("Enter the Salary");
        int S=Integer.parseInt(Salary);
        if (S >0 && S <=600){
          double tax = 0;
           double pension = S*0.07; 
           
           double growthSalary = S + Allowance;
           double incomeTax=S*tax; //here too
           double totalDeduction = incomeTax+pension;
           double netPay = growthSalary - totalDeduction;
           JOptionPane.showMessageDialog(null ,"\n 1)income tax = "+incomeTax+"\n 2)pension = "+pension+"\n 3)total deduction = "+totalDeduction+"\n 4)net payment = "+netPay);
       }
       else  if (S >601 && S <=1650){
          double tax =0.1 ;
           double pension = S*0.07;
           double growthSalary = S + Allowance;
           double incomeTax=S*tax; //here too
           double totalDeduction = incomeTax+pension;
           double netPay = growthSalary - totalDeduction;

            JOptionPane.showMessageDialog(null ,"\n 1)income tax = "+incomeTax+"\n 2)pension = "+pension+"\n 3)total deduction = "+totalDeduction+"\n 4)net payment = "+netPay);
       }
        else if (S >1651 && S <=3200){
          double tax =0.15 ;
           double pension = S*0.07;
           double growthSalary = S + Allowance;
           double incomeTax=S*tax; //here too
           double totalDeduction = incomeTax+pension;
           double netPay = growthSalary - totalDeduction;

          JOptionPane.showMessageDialog(null ,"\n 1)income tax = "+incomeTax+"\n 2)pension = "+pension+"\n 3)total deduction = "+totalDeduction+"\n 4)net payment = "+netPay);
       }
         else if (S >3201 && S <=5250){
          double tax =0.2 ;
           double pension = S*0.07;
           double growthSalary = S + Allowance;
           double incomeTax=S*tax; //here too
           double totalDeduction = incomeTax+pension;
           double netPay = growthSalary - totalDeduction;

            JOptionPane.showMessageDialog(null ,"\n 1)income tax = "+incomeTax+"\n 2)pension = "+pension+"\n 3)total deduction = "+totalDeduction+"\n 4)net payment = "+netPay);
       }
        else if (S >5251 && S <=7800){
          double tax =0.25 ;
           double pension = S*0.07;
           double growthSalary = S + Allowance;
           double incomeTax=S*tax; //here too
           double totalDeduction = incomeTax+pension;
           double netPay = growthSalary - totalDeduction;

          JOptionPane.showMessageDialog(null ,"\n 1)income tax = "+incomeTax+"\n 2)pension = "+pension+"\n 3)total deduction = "+totalDeduction+"\n 4)net payment = "+netPay);
       }
        else if (S >7801 && S <=10900){
          double tax =0.3 ;
           double pension = S*0.07;
           double growthSalary = S + Allowance;
           double incomeTax=S*tax; //here too
           double totalDeduction = incomeTax+pension;
           double netPay = growthSalary - totalDeduction;

           JOptionPane.showMessageDialog(null ,"\n 1)income tax = "+incomeTax+"\n 2)pension = "+pension+"\n 3)total deduction = "+totalDeduction+"\n 4)net payment = "+netPay);
          
       }
        else if (S >10900){
          double tax =0.35 ;
           double pension = S*0.07;
           double growthSalary = S + Allowance;
           double incomeTax=S*tax; //here too
           double totalDeduction = incomeTax+pension;
           double netPay = growthSalary - totalDeduction;

           JOptionPane.showMessageDialog(null ,"\n 1)income tax = "+incomeTax+"\n 2)pension = "+pension+"\n 3)total deduction = "+totalDeduction+"\n 4)net payment = "+netPay);
       }
      
        String answer=JOptionPane.showInputDialog("Do You Want To Calculate Another Person Income? To Start 1 & To Quite 0");
         A=Integer.parseInt(answer);
                }
        while(A==1);
    }
}
