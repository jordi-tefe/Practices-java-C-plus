
import javax.swing.JOptionPane;
public class StudentGrade {
    public static void main(String[] args)
	{
		 String result;
		result=JOptionPane.showInputDialog("Input The Grade : ");
                double resu;
                resu=Double.parseDouble(result);
    
	if (resu='A' )
	{
	 JOptionPane.showConfirmDialog(null,"Excellent ","",JOptionPane.PLAIN_MESSAGE);
	}
	else if (resu='B')
	{
	 JOptionPane.showConfirmDialog(null,"Verry Good ","",JOptionPane.PLAIN_MESSAGE);
	}
	else if (resu='C')
	{
	 JOptionPane.showConfirmDialog(null,"Satistafactory ",null,JOptionPane.PLAIN_MESSAGE);
	}
	else if (resu='D')
	{
	 JOptionPane.showConfirmDialog(null," Not Satistafactory ","",JOptionPane.PLAIN_MESSAGE);
	}
	
	else
	{
	 JOptionPane.showConfirmDialog(null,"Invalid Input ","",JOptionPane.PLAIN_MESSAGE);
	}
	}	
}
