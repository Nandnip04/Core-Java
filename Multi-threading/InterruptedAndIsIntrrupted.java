class Test extends Thread{
    public void run(){
        System.out.println(Thread.interrupted());
        System.out.println(Thread.currentThread().isInterrupted());
        try{
            for(int i=0;i<5;i++){
                System.out.println(Thread.currentThread().getName()+" : "+i);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
public class InterruptedAndIsIntrrupted {
    public static void main(String[] args) {
        Test t1=new Test();
        t1.start();
        t1.interrupt();

    }
}
