/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interface1;

/**
 *
 * @author USER
 */
 interface  Interface1 {

    final double transport=1000;
    abstract double netincome();
    
}

 class Teachingstaff implements Interface1{
    private double salary,allowance;
   public Teachingstaff(double s,double a){
        salary=s;
        allowance=a;
    }
   public double netincome(){
        return (salary*0.35)-1500+(transport+allowance);
    }
}
    class Adminstaff implements Interface1{
        private double salary;
        public Adminstaff(double s){
        salary=s;
    }
       public double netincome(){
        return (salary*0.35)-1500+(transport);
    }
    
    }
class TestInterface{
    public static void main(String[] args) {
        Interface1 i;
        i=new Teachingstaff(5000, 500);
        
        System.out.println("Net Income Admin staff="+i.netincome());
        i=new Adminstaff(6000);
        System.out.println("++++++++++++++++++++");
        System.out.println("Net Income Teachng staff"+i.netincome());
                
    }
}

