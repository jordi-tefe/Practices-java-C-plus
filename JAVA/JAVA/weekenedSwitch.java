
import javax.swing.JOptionPane;


public class weekenedSwitch {
    
     public  static void main(String args[])
            
    {
    String days;
//users input letter grade
days=JOptionPane.showInputDialog("Input The Number : ");
char day;
day=days.charAt(0);
//swith statement
    switch (day)
        {
        case '1':	
		System.out.println("Sunday");
		break;
                
	case '2':
                System.out.println("Tuesday");	
                break;
	case '3':
		System.out.println("Wednesday");
		break;
	case '4':
		System.out.println("Thursday");
		break;
	case '5':
		System.out.println("Friday");
		break;
	case '6':
		System.out.println("Saturday");
		break;
	case '7':
		System.out.println("Sunday");
		break;
        default:
                System.out.println("Input Error");
                                }
    
}
    
    
    
    }

