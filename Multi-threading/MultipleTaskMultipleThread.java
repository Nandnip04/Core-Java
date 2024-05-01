class MyThread1 extends Thread{
    public void run(){
        System.out.println("task 1 ");
    }
}

class MyThread2 extends Thread{
    public void run(){
        System.out.println("task 2");
    }
}
public class MultipleTaskMultipleThread {
    public static void main(String[] args) {
        
        MyThread1 thread1=new MyThread1();
        thread1.start();

        MyThread2 thread2=new MyThread2();
        thread2.start();
    }
}
