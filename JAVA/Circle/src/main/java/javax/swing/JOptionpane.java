/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javax.swing;

/**
 *
 * @author USER
 */
import javax.swing.JOptionpane;
public class JOptionpane {
     public static void main(String[] args) {
        String rString=JOptionpane.showInputDialog("Enter the Value of the Radius:");
       double r=Double.parseDouble(rString);
       double Area=Math.PI*(r*r);
    JOptionpane.showMessageDialog("The Area of the Circle is==>"+Area);
    
        
    }
    
}
