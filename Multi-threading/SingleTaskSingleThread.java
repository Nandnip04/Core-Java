//single task uging single Thread
public class SingleTaskSingleThread extends Thread{
    public void run(){
        System.out.println("Task 1");
    }
    public static void main(String[] args) {
       SingleTaskSingleThread thread1=new SingleTaskSingleThread();
       thread1.start();
    }
}