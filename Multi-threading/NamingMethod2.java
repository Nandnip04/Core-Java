public class NamingMethod2 extends Thread {
    public void run(){
        System.out.println("run method :"+
        Thread.currentThread().getName());
        System.out.println("thread task");
        System.out.println("run method :"+Thread.currentThread().isAlive());
    }
    public static void main(String[] args) {
        NamingMethod2 th1=new NamingMethod2();
        th1.start();

        System.out.println(Thread.currentThread().getName());
        System.out.println(th1.isAlive());

        NamingMethod2 th2 =new NamingMethod2();
        th2.start();

        System.out.println(Thread.currentThread().isAlive());
    }
}
