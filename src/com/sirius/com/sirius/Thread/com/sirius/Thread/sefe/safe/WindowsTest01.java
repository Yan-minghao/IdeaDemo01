package com.sirius.com.sirius.Thread.com.sirius.Thread.sefe.safe;

public class WindowsTest01 {
//三个窗口卖100张票
    public static void main(String[] args) {
        Windows windows1 = new Windows();
        Windows windows2 = new Windows();
        Windows windows3 = new Windows();

        windows1.setName("窗口1");
        windows2.setName("窗口2");
        windows3.setName("窗口3");

        windows1.start();
        windows2.start();
        windows3.start();


    }
}

class Windows extends Thread{
   static int ticket=100;

    public void run(){
        while(true){

            show();

            if(ticket==0){
                break;
            }
        }


    }

    private static  synchronized void show() {
        if (ticket>0){
            System.out.println(Thread.currentThread().getName()+"ticket = " + ticket);
            ticket--;
        }
    }
}