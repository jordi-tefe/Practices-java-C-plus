
import javax.swing.JOptionPane;
public class  circle {
    public static void main(String[]args){
String radius;
radius=JOptionPane.showInputDialog("Input the radius=");
double area,rad,perim;
rad=Double.parseDouble(radius);
    
    area = Math.PI*(rad*rad);
    perim = rad*Math.PI*2;
        
    
JOptionPane.showConfirmDialog(null,"area=,"+area,"",JOptionPane.PLAIN_MESSAGE);
    JOptionPane.showConfirmDialog(null,"per=,"+perim,"",JOptionPane.PLAIN_MESSAGE);
    }
}