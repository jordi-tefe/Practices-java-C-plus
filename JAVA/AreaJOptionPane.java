
import javax.swing.JOptionPane;
public class  AreaJOptionPane {

    
    public static void main(String[] args) {
        String radius;
       radius=JOptionPane.showInputDialog("input the radius");
       
       Double r, Area,per;
       r=Double.valueOf(radius);
       
       
       Area =(Double) (3.14*(r*r));
       per = (Double) (2*3.14*r);
       
       JOptionPane.showConfirmDialog(null, " Area of the circle is : "+Area,"two integers",JOptionPane.PLAIN_MESSAGE);
       JOptionPane.showConfirmDialog(null, " Perimeter of a circle is: "+per,"two integers",JOptionPane.PLAIN_MESSAGE);
       
    }
    
}
