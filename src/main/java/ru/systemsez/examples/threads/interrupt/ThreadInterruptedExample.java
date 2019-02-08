package ru.systemsez.examples.threads.interrupt;

public class ThreadInterruptedExample {

    public static void main(String[]args){
        Thread t = new MyThread();
        t.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.interrupt();
        System.out.println("Main exit");
    }

}
