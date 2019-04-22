package com.sirius.com.sirius.Thread;

public class ThreadTest02 {
    //实现runnable
    //重写方法

    public static void main(String[] args) {
        Num num = new Num();

        Thread thread1 = new Thread(num);
        Thread thread2 = new Thread(num);

        thread1.start();
        thread2.start();
    }
}

class Num implements  Runnable{


    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"i = " + i);
        }
    }
}