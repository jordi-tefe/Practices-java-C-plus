/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.threads;

/**
 *
 * @author USER
 */
public class MyThreadRunnable implements Runnable{

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Runnable thread1=new MyThreadRunnable();
        Thread mt1=new Thread(thread1,"Jordi");
        mt1.start();
         Runnable thread2=new MyThreadRunnable();
        Thread mt2=new Thread(thread2,"Tefe");
        mt2.start();
    }
//    Thread thrd; //a member variable of type Thread
// public MyThreadRunnable(String name){ //a constructor
// thrd = new Thread(this, name);
// }
    
 public void run(){
 System.out.println(Thread.currentThread().getName() + " starting");
 try{
 for(int i = 0; i<5 ; i++){
 System.out.println(Thread.currentThread().getName() + ", count: " +i);
 Thread.sleep(1000);
 }
 }catch(InterruptedException e){}
 } 
}
