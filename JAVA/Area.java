/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RAD3ON
 */
class Area {
    //define instance variable of a class
        int width,height,depth;
        double wh,ht,dp;
        
        int rectVol(int a,int b,int c){
            width=a;
            height=b;
            depth=c;
            return (width * height * depth);
        
        }
        //define parameterized method named rectArea
        int rectArea(int w, int h){
            width=w;
            height=h;
            return (width * height * depth);
        
        }//end of RectArea
     //define a class by the name TrigArea
        double trigArea(double b, double s){
            wh=b;
            ht=s;
            return(wh*ht);
        
        }//end of trigArea()
}//end of class
//define another class to create objects of Area
    class TestArea{
        //main method
        public static void main(String[] args) {
        //declare and create objects
        Area a1=new Area();
        
        
        int rarea;
        double tarea;
        double tvol;
        //call rectARea()
        //at this time it get back to the class of INT RECTAREA(INT W,int H)
        rarea=a1.rectArea(40, 60);
        tvol=a1.rectVol (40,60,80);
        //output area
            System.out.println("Area of Rectangle = "+rarea);
             System.out.println("Volume of Rectangle = "+tvol);
           
        //call trigArea()
            //at this time it get back to the class of double trigArea(double b,double s)
            tarea=a1.trigArea(20.0, 10.5);
            System.out.println("Area of triangle = "+tarea);
        }
    
    
    
    }
