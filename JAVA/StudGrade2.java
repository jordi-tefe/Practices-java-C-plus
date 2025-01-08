
import javax.swing.JOptionPane;
public class StudGrade2 {
    public static void main(String[] args)
	{
		 String result;
		result=JOptionPane.showInputDialog("Input The Result : ");
                double resu;
                resu=Double.parseDouble(result);
    
	if (resu>=91 && resu <=100)
	{
	 JOptionPane.showConfirmDialog(null,"The Grade Of The Student is A ","",JOptionPane.PLAIN_MESSAGE);
	}
	else if (resu>=80 && resu <=90)
	{
	 JOptionPane.showConfirmDialog(null,"The Grade Of The Student is B ","",JOptionPane.PLAIN_MESSAGE);
	}
	else if (resu>=50 && resu<80)
	{
	 JOptionPane.showConfirmDialog(null,"The Grade Of The Student is C ",null,JOptionPane.PLAIN_MESSAGE);
	}
	else if (resu>=40 && resu<50)
	{
	 JOptionPane.showConfirmDialog(null,"The Grade Of The Student is D ","",JOptionPane.PLAIN_MESSAGE);
	}
	else if (resu>=20 && resu <40)
	{
	JOptionPane.showConfirmDialog(null,"The Grade Of The Student is F ","",JOptionPane.PLAIN_MESSAGE);
	}
	else
	{
	 JOptionPane.showConfirmDialog(null,"Incomplete ","",JOptionPane.PLAIN_MESSAGE);
	}
	}	
}
