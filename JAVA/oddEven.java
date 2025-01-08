
import javax.swing.JOptionPane;


// use joptionpane class and write java program to identify either the number inputted by the users are  +ve / -ve
public class oddEven {
    
    public static void main(String[] args)
	{
	 String result;
	result=JOptionPane.showInputDialog("Input The Number : ");
        double resu;
                resu=Double.parseDouble(result);
    
	if (resu>0)
	{
	 JOptionPane.showConfirmDialog(null,"it's a Positive Number","",JOptionPane.PLAIN_MESSAGE);
        
        
        }
        else {
             JOptionPane.showConfirmDialog(null,"it's a Negative  Number","",JOptionPane.PLAIN_MESSAGE);
        
            
        }
        }
        
        
    
}
