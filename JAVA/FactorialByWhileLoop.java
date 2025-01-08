
	import javax.swing.JOptionPane;
	public class FactorialByWhileLoop {
	public static void main(String[] args) {  
        int fact = 1;  
        int i = 1;  
  
         String num;
        num=JOptionPane.showInputDialog("Input the Number ");
        
        int number;
    
        number=Integer.parseInt(num); 
        while( i <= number ){  
            fact = fact * i;   
            i++;  
        }     
        JOptionPane.showConfirmDialog(null,"The Result is "+fact,"",JOptionPane.PLAIN_MESSAGE);    
    }  
}  
