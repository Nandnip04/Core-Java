public class YieldMethod extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }

    public static void main(String[] args) {
        YieldMethod th=new YieldMethod();
        th.start();

        Thread.yield();
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
}