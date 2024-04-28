public class ThreadStart implements Runnable{
    public void run(){
        System.out.println("thread started ....");
    }
    public static void main(String[] args){
        ThreadStart s1=new ThreadStart();
        Thread th=new Thread(s1);
        th.start();
    }
}