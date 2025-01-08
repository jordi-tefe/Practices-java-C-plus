/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package midt;

/**
 *
 * @author USER
 */
public class MidT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Sum=0;
        int N=1;
        while(N<=10){
            if(Sum>=30){
                break;
            }
            else{
                Sum=Sum+N;
                System.out.println("Integer Value="+N);
                System.out.println("Sum="+Sum);
                 N++;
            }
           
        }
    }
    
}
