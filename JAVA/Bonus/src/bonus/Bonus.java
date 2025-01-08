/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bonus;

/**
 *
 * @author USER
 */
public class Bonus {

    private String name;
    private double salary;
    private int yrsof_service;
    Bonus(String n,double s,int yrs){
        this.name=n;
        this.salary=s;
        this.yrsof_service=yrs;
    }
    double CalBonus(){
        double B=0;
        if(yrsof_service>=2){
            B=salary*0.4;
        }
        if(yrsof_service>=10){
            B+=100;
        }
        return B;
    }
    
}
class TestB{
 
    public static void main(String[] args) {
        Bonus a=new Bonus("Abebe", 2000, 4);
        a.CalBonus();
        System.out.println("Bonus="+a.CalBonus());
    }

}
