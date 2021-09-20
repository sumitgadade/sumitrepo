class NewThread1 implements Runnable{
    Thread t1;

    NewThread1(){
        t1=new Thread(this, "Demo Thread1");
        System.out.println("Child thread created by using implementing runnable Interface ");
    }

    public void run(){
        try{
            for(int i=0;i<=5;i++)
            {
                System.out.println("\tChild thread 1: "+i);
                Thread.sleep(2000);
            }
        }catch(InterruptedException e){
            System.out.println("Child1 interrupted!!");
        }
        System.out.println("Exiting child Thread!!");
    }
}

class NewThread2 extends Thread{

    NewThread2(){
        super("Demo Thread2");
        System.out.println("Child thread created by using extending Thread class: "+this);
    }

    public void run(){
        try{
            for(int i=5;i>=0;i--){
                System.out.println("\t\tChild Thread2 : "+i);
                Thread.sleep(2000);
            }
        }catch(InterruptedException e){
            System.out.println("child2 interrupted!!");
        }
        System.out.println("Exiting child Thread2!!");
    }
}

class ThreadDemo{
    public static void main(String[] args){
        NewThread1 th1=new NewThread1();
        th1.t1.start();

        NewThread2 th2=new NewThread2();
        th2.start();

        try{
            for(int i=5;i>=0;i--){
                System.out.println("Main Thread: "+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Main Thread interrupted!!");
        }
        System.out.println("Main thread exiting!!");
    }
}