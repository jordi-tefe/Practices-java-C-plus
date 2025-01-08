/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.abstract1;

/**
 *
 * @author USER
 */
public abstract class Staff {

    String name;
    int age;
    double salary;

    public Staff(String n, int a, double s) {
        this.name = n;
        this.age = a;
        this.salary = s;
    }
    
    abstract double income();
    double tax(){
        return salary- salary*0.8;
    }
    double pension(){
        return salary*0.7;
    }
}
class Acadamicstaff extends Staff{
    double Houseallo;

    public Acadamicstaff(double H, String n, int a, double s) {
        super(n, a, s);
        this.Houseallo = H;
    }
    double income(){
        return ((salary+Houseallo)-((tax())+(pension())));
    }
}
class Adminstaff extends Staff{

    Adminstaff( String n, int a, double s){
        super(n, a, s);
    }
    double income(){
       
        return salary-((tax())+(pension()));
    }
}
class Abstract1{
    public static void main(String[] args) {
        Staff s;
        s=new Acadamicstaff(40, "yordanos", 21, 10000);
        System.out.println("Income="+s.income());
        System.out.println("Name="+s.name);
        s=new Adminstaff("Yoo", 24, 5000);
        System.out.println("Income="+s.income());
        System.out.println("Name="+s.name);

    }
}
