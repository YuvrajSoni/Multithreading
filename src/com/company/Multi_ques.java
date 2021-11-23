package com.company;

public class Multi_ques extends Thread {
    int a;


    public void run() {
        for (int i =1; i <11 ; i++) {
            if (i==5)
            {
                System.out.println(i);
                try{
                    Thread.sleep(5000);
                }catch (InterruptedException e){
                    System.out.println("Exception Occured here "+e);
                }
            }
            else System.out.println(i);
        }
    }
}
class Test {
    public static void main(String[] args) {
        Multi_ques obj = new Multi_ques();
        obj.start();
    }
}
