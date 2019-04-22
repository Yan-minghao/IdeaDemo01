package com.sirius.com.sirius.Thread;


class ThreadNum extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("i = " + i);
        }
    }

}

public class ThreadTest01 {

/*
    方式一：继承Thread类的方式：
   1.提供一个继承于Thread类的子类
 * 2.重写Thread类的run():将创建的线程要执行的操作，声明在run()中。
 * 3.实例化Thread子类
 * 4.调用子类对象的start():①启动线程 ②调用当前线程的run()
*/
public static void main(String[] args) {
    ThreadNum threadNum = new ThreadNum();
    threadNum.start();


}

}

