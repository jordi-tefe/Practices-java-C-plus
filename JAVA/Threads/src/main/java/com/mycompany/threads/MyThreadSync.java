/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.threads;

import java.security.SecureRandom;

/**
 *
 * @author USER
 */
public class MyThreadSync implements Runnable {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        MyArray myArr = new MyArray(6);
 Thread mt1 = new Thread(new MyThreadSync(1, myArr));
 Thread mt2 = new Thread(new MyThreadSync(17, myArr));
 mt1.start();
 mt2.start();
    }
    
    MyArray myArr;
 int startValue;
 public MyThreadSync(int value, MyArray arr){
 myArr = arr;
 startValue = value;
 }
 public void run(){
 for(int i = startValue; i < startValue+3; i++)
 myArr.add(i);
 }
}


class MyArray{
 private int[] myArr;
private int position = 0;
 private SecureRandom sr = new SecureRandom();
 public MyArray(int size){ myArr = new int[size]; }
 public void add(int value){
 int index = position;
 try{ Thread.sleep(sr.nextInt(500));}
 catch(InterruptedException e){}
 myArr[index] = value;
 System.out.println(Thread.currentThread().getName()+
" wrote "+ value + " at index " + index);
 position++;
 } }
