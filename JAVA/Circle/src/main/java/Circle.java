/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author USER
 */
import javax.swing.JOptionPane;
public class Circle {

    public static void main(String[] args) {
        String xString=JOptionPane.showInputDialog("Enter the Value of the X value:");
       double x=Double.parseDouble(xString);
       String yString=JOptionPane.showInputDialog("Enter the Value of the Y value:");
       double y=Double.parseDouble(yString);
       String zString=JOptionPane.showInputDialog("Enter the Value of the Z value:");
       double z=Double.parseDouble(zString);
       double a,b,c,S,K,M;
        a=x+y;
        b=x-y;
        c=z-x;
        K=a/z;
        M=b/c;
        S=K*M;
       
    JOptionPane.showMessageDialog(null,"X value"+x+"\nY value"+y+"\nZ value"+z+"\nS value is=>"+S);
   
        
    }
}

