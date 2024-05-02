import java.util.Currency;

public class PriorityMethods extends Thread {
    
    public void run(){
        System.out.println("Child Thread");
        System.out.println("Child thread priority :"+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("child thread new priority:"+Thread.currentThread().getPriority());
        
    }

    public static void main(String[] args) {
        System.out.println("Main thread old priority:"+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("Main Thread new Priority:"+Thread.currentThread().getPriority());

        PriorityMethods p1=new PriorityMethods();
        p1.start();
    }
}
