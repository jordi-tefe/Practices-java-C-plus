
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RAD3ON
 */
public class gradesample {
    public static void main(String[] args)
	{
		 String result;
		result=JOptionPane.showInputDialog("Input The Result : ");
                double resu;
                resu=Double.parseDouble(result);
    
	if (resu>= 60)
	{
	 JOptionPane.showConfirmDialog(null,"PASSED","",JOptionPane.PLAIN_MESSAGE);
        
        
        }
        
        
	
    
    
    
    
}
}