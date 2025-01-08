
import javax.swing.JOptionPane;
public class inputGrade {
    public static void main(String[] args)
	{
	 String grade;
		grade=JOptionPane.showInputDialog("Input The Grade : ");
                char gra;
                gra=grade.charAt(0);
                
	if (gra=='A' || gra== 'a')
	{
	 JOptionPane.showConfirmDialog(null,"Excellent ","",JOptionPane.PLAIN_MESSAGE);
	}
	else if (gra=='B'||gra== 'b')
	{
	 JOptionPane.showConfirmDialog(null,"Verry Good ","",JOptionPane.PLAIN_MESSAGE);
	}
	else if (gra=='C'|| gra=='c')
	{
	 JOptionPane.showConfirmDialog(null,"Satistafactory ",null,JOptionPane.PLAIN_MESSAGE);
	}
	else if (gra=='D'|| gra=='d')
	{
	 JOptionPane.showConfirmDialog(null," Not Satistafactory ","",JOptionPane.PLAIN_MESSAGE);
	}
	else if (gra=='F' || gra=='f')
	{
	 JOptionPane.showConfirmDialog(null,"Fail ","",JOptionPane.PLAIN_MESSAGE);
	}
	else
	{
	 JOptionPane.showConfirmDialog(null,"Invalid Input ","",JOptionPane.PLAIN_MESSAGE);
	}
	}	
    
}
