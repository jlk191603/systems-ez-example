package ru.systemsez.examples.threads.interrupt;

class MyThread extends Thread{

    public MyThread() {
        super("MyThread");
    }

    @Override
    public void run() {

        while(true){
            try {

            if(isInterrupted())
                throw new InterruptedException();

                System.out.println(Math.random());

                Thread.sleep(1000);

            } catch (InterruptedException e) {
                break;
            }
        }
        System.out.println("MyThread exit");
    }
}
