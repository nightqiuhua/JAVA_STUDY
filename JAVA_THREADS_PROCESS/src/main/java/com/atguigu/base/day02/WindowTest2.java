package com.atguigu.base.day02;

class Window2 extends Thread{
    private static int ticket =100;
    @Override
    public void run(){
        while(true){
            synchronized (Window2.class){
                if(ticket>0){

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName()+"：卖票，票号为：" + ticket);
                    ticket--;

                }else{
                    break;
                }


            }

        }


    }

}

public class WindowTest2 {
    public static void main(String[] args) {
        Window2 w1 = new Window2();
        Window2 w2 = new Window2();
        Window2 w3 = new Window2();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();


    }


}
