class Thread1 extends Thread{
    public void run(){
        System.out.println("start method of thread 1 class ");
    }
}
class Thread2 extends Thread{
    public void run(){
        System.out.println("start method of thread 2 class");
    }
}
public class ThreadUsingThreadClass {
    public static void main (String [] args){
        Thread1 th1=new Thread1();
        th1.start();

        Thread2 th2=new Thread2();
        th2.start();
    }
}
