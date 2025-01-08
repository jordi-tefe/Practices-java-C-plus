/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bank;

/**
 *
 * @author USER
 */
 public abstract class Bank{
 int initialDeposit;
 int time;
 double rate;
 double interestRate;
 double withdrawals;
 double netBalance;

 //Constructor
 public Bank(int initialDeposit){
 this.initialDeposit = initialDeposit;
 this.time = 6;
 this.rate = 0.06;
 }

 //Abstract Method
 public abstract void calculate();

}

//Subclass: Register
class Register extends Bank{
 //constructor
 public Register(int initialDeposit){
  super(initialDeposit);
 }

 //Implementation of abstract method
 public void calculate(){
  System.out.println("Your Initial Deposit is: "+initialDeposit);
 }

}

//Subclass: Deposit
class Deposit extends Bank{
 //constructor
 public Deposit(int initialDeposit){
  super(initialDeposit);
 }

 //Implementation of abstract method
 public void calculate(){
  interestRate = (initialDeposit *time * rate);
  System.out.println("Your Interest Rate is: "+ interestRate);
 }

}

//Subclass: Withdrawals
class Withdrawals extends Bank{
 int amount;
 //constructor
 public Withdrawals(int initialDeposit, int amount){
  super(initialDeposit);
  this.amount = amount;
 }

 //Implementation of abstract method
 public void calculate(){
  withdrawals = (initialDeposit - amount);
  System.out.println("Your Withdrawal Amount is: "+ withdrawals);
 }

}

//Subclass: NetBalance
class NetBalance extends Bank{
 int amount;
 //constructor
 public NetBalance(int initialDeposit, int amount){
  super(initialDeposit);
  this.amount = amount;
 }

 //Implementation of abstract method
 public void calculate(){
  netBalance = (initialDeposit + interestRate);
  System.out.println("Your Net Balance is: "+ netBalance);
 }

}
class TesttBank{
    public static void main(String[] args) {
        Register a=new Register(400);
        a.calculate();
        Deposit b=new Deposit(500);
        b.calculate();
        Withdrawals c=new Withdrawals(500, 300);
        c.calculate();
    }
}