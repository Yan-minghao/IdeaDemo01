package com.sirius.com.sirius.Thread.com.sirius.Thread.sefe.safe;

public class WindowsTest2 {

    public static void main(String[] args) {
         Windwos1 w = new Windwos1();

        Thread thread1 = new Thread(w);
        Thread thread2 = new Thread(w);
        Thread thread3 = new Thread(w);

        thread1.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");

        thread1.start();
        thread2.start();
        thread3.start();
    }

}

class Windwos1 implements Runnable {

    int ticket = 100;

    @Override
    public void run() {
        while (true) {
           show();

           if(ticket==0){
               break;
           }
        }
    }

    private synchronized void show() {
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "ticket的票号： = " + ticket);

            ticket--;
        }
    }
}
