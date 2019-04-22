package com.sirius.com.sirius.Thread;

/*
 * ①一个遍历连个线程一个为100以内奇数，一个为100以内偶数
 *
 *
 */
public class ThreadExer {
    public static void main(String[] args) {

        //方式一
        /*ThreadNum1 thread1 = new ThreadNum1();
        ThreadNum2 thread2 = new ThreadNum2();
        thread1.start();
        thread2.start();*/

        //创建匿名子类的匿名对象 方式二

        new Thread() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 != 0) {
                        System.out.println("ThreadNum1 = " + i);
                    }
                }
            }
        }.start();


        new Thread() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 0) {
                        System.out.println("ThreadNum2 = " + i);
                    }
                }
            }
        }.start();


    }

}

//奇数
class ThreadNum1 extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println("ThreadNum1 = " + i);
            }
        }
    }
}

//偶数
class ThreadNum2 extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.println("ThreadNum2 = " + i);
            }
        }
    }
}
