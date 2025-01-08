
import javax.swing.JOptionPane;


public class incomeTax {

   
    public static void main(String[] args) {
       
        double tax,pension,allowance;
        double netpay,growthPay,toDeduction;
        
        String salary;
    salary=JOptionPane.showInputDialog("Input the Salary ");
    double sal;
    sal=Double.parseDouble(salary);
    allowance=4000;
    
    pension= (7*sal)/100;
    JOptionPane.showConfirmDialog(null,"The Pension is "+pension,"",JOptionPane.PLAIN_MESSAGE);
   
    growthPay=sal+allowance;
    
    JOptionPane.showConfirmDialog(null,"The Growthpay is "+growthPay,"",JOptionPane.PLAIN_MESSAGE);

    if(sal>=0&&sal<=600)
	{
		tax=0;
	}
	else if ((sal>600)&&(sal<=1650))
	{
		tax=(sal*0.1)-60;
	}
	else if ((sal>1650)&&(sal<=3200))
	{
		tax=(sal*0.15)-142.5;
	}
	else if ((sal>3200)&&(sal<=5250))
	{
		tax=(sal*0.2)-302.5;
	}
	else if ((sal>5250)&&(sal<=7800))
	{
		tax=(sal*0.25)-565;
	}
	else if ((sal>7800)&&(sal<=10900))
	
	{
		tax=(sal*3)-955;
	}
else {
	tax=(sal*0.35)-1500;
    }
    
    
    JOptionPane.showConfirmDialog(null,"The Income Tax is  "+tax,"",JOptionPane.PLAIN_MESSAGE);
    toDeduction=(tax+pension);	
	JOptionPane.showConfirmDialog(null,"The Total Deduction is  "+toDeduction,"",JOptionPane.PLAIN_MESSAGE);
    netpay=(growthPay-toDeduction);
    JOptionPane.showConfirmDialog(null,"The NetPay is  "+netpay,"",JOptionPane.PLAIN_MESSAGE);


}}
