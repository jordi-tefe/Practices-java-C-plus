
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.threads;

/**
 *
 * @author USER
 */

public class MyThread extends Thread {

    /**
     * @param 
     * @param args the command line arguments
     */
  //public MyThread(String name){ super(name); }
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("TestThread1");
        thread1.start();
         MyThread thread2 = new MyThread("TestThread2");
        thread2.start();
    }
  public MyThread(String name) {
    super(name);
}
 public void run(){
 System.out.println(getName() + " starting");
  try{
  for(int i = 0; i<5 ; i++){
  Thread.sleep(1000);
 
  System.out.println(getName() + ", count: " + i);
  } } catch(InterruptedException e){}
   }
}
