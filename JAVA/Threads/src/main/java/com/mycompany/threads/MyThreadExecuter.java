/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author USER
 */
public class MyThreadExecuter {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        System.out.println(" Main start");
 ExecutorService es = Executors.newCachedThreadPool();
 MyThreadExecuter task1 = new MyThreadExecuter("Task #1");
 MyThreadExecuter task2 = new MyThreadExecuter("Task #2");
 MyThreadExecuter task3 = new MyThreadExecuter("Task #3");

 es.execute(task1);
 es.execute(task2);
  es.execute(task3);
 System.out.println(" Main start");
    }
    
    String thrdName;
 public MyThreadExecuter(String name){
 thrdName = name;
 }
 public void run(){
 System.out.println(thrdName + " starting");
 try{
 for(int i = 0; i<5 ; i++){
 System.out.println(thrdName + ", count: " +i);
 Thread.sleep(1000);
 }
 }catch(InterruptedException e){}
 }
}
