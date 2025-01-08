
import javax.swing.JOptionPane;
public class oddEven {
	public static void main(String[] args) 
	{
		int i=1, evenSum = 0, oddSum = 0;
		
		 String num;
    num=JOptionPane.showInputDialog("Input The Number ");
	int number;
	number=Integer.parseInt(num);

		while(i <= number)
		{
			if(i % 2 == 0)
			{
			evenSum = evenSum + i; 
			}
			else
			{
			oddSum = oddSum + i;
			}
			i++;
		}
             JOptionPane.showConfirmDialog(null,"The Sum of Even Numbers is "+evenSum,"",JOptionPane.PLAIN_MESSAGE);
             JOptionPane.showConfirmDialog(null,"The Sum of Odd Numbers is "+oddSum,"",JOptionPane.PLAIN_MESSAGE);
         
           
	}
}
