//Performing single task from multiple thread
public class SingleTaskMultipleThread extends Thread{
    public void run(){
        System.out.println("task 1");
    }
    public static void main(String[] args) {
        SingleTaskMultipleThread thread1=new SingleTaskMultipleThread();
        thread1.start();

        SingleTaskMultipleThread thread2=new SingleTaskMultipleThread();
        thread2.start();

    }
}
