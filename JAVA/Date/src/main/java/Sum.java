/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Sum {
    public static void main(String[] args) {
        int i,Sum=0;
        for(i=10;i>=1;i--){
        while(i!=0){
            if(i%2==0){
                Sum=Sum+i;
                System.out.println("The Even no"+i);
               
            }
            i--;
        }
        }
        System.out.println("Sum->"+Sum);
    }
    
}
