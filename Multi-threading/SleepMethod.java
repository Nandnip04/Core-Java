public class SleepMethod extends Thread{
    
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+" :"+i);
            try{

                Thread.sleep(500);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        SleepMethod s1=new SleepMethod();
        s1.start();

        SleepMethod s2=new SleepMethod();
        s2.start();
    }

}