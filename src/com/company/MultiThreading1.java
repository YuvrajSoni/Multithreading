//Create two threads and assign names ‘Scooby’ and ‘Shaggy’ to the two threads. Display both thread names.
package com.company;
public class MultiThreading1 extends Thread{
    public static void main(String[] args) {
        MultiThreading1 obj = new MultiThreading1();
        MultiThreading1 obj2= new MultiThreading1();
        obj.setName("Scooby");
        obj2.setName("Shaagy");
        System.out.println(obj.getName());
        System.out.println(obj2.getName());
    }
}
