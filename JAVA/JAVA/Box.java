/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RAD3ON
 */
public class Box {
//define instance variable
double width,height,depth;

}
//define another class to create object of box
class TestBox{
    public static void main(String[] args) {
        //declare and create object of box
        Box  mybox1= new Box();
                Box  mybox2= new Box();
    
    double Vol;
    mybox1.width=10;
    mybox1.height=20;
    mybox1.depth=15;
    
    //compute volume of box
    Vol= (mybox1.depth*mybox1.height*mybox1.width);
            //output
         System.out.println("Volume of Box = "+Vol);
         //assign values to mybox2's instances variable
         mybox2.width=10;
         mybox2.height=20;
         mybox2.depth=15;
         //compute volume 2
         Vol=(mybox2.depth*mybox2.height*mybox2.width);
         System.out.println("Volume 2 =" +Vol);
            
    
    }//end of main()
}//end of class
