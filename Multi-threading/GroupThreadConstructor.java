public class GroupThreadConstructor implements Runnable{

    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        GroupThreadConstructor gth1=new GroupThreadConstructor();

        ThreadGroup tg1=new ThreadGroup("Parent Thread");
        Thread th1=new Thread(tg1,gth1,"start");
        th1.start();

        Thread th2 =new Thread(tg1,gth1,"the");
        th2.start();

        Thread th3=new Thread(tg1,gth1,"Work");
        th3.start();

        System.out.println("Thread group name:"+tg1.getName());
        tg1.list();
    }
}