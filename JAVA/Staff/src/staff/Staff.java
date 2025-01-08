/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package staff;

import java.security.PublicKey;

/**
 *
 * @author USER
 */
public abstract class Staff {
    String name;
    int age;
    double Salary;
 Staff(String n,int a,double s){
     this.name=n;
     this.age=a;
     this.Salary=s;
     
 }

    abstract double Income();
        
        
    
    public double tax(){
        return Salary-0.8*Salary;
    }
    double Pension(){
     return (Salary*0.07);
    }
    
}//end of abstract
class Acadamicstaff extends Staff{
       private double HAllowance;
   public Acadamicstaff(String n,int a,double s,double Ha){
       super(n, a, s);
     
       this.HAllowance=Ha;
   }
    public double Income(){
        return ((Salary+HAllowance)-(tax()+Pension()));
    }
}//End of Acadamicstaff
class Adminstaff extends Staff{
        Adminstaff(String n,int a,double s){
            super(n, a, s);
            
        
    }
       public double Income(){
        return Salary-((tax()+Pension()));
    }
}

class TestAbstract{
    public static void main(String[] args) {
        Staff s;
        s= new Acadamicstaff("Yealem", 56, 4000, 400);
        System.out.println("Name="+""+s.name+"");
        System.out.println("Income="+s.Income());
        System.out.println("");
        s=new Adminstaff("Yoo", 28, 6000);
        System.out.println("Name="+""+s.name+"");
        System.out.println("Income="+s.Income());
    }
  
}
