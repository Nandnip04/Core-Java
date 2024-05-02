class Medical extends Thread{
    public void run(){
        try{
            System.out.println("Medical starts");
            Thread.sleep(1000);
            System.out.println("medical Complete");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

class OfficerSign extends Thread{
    public void run(){
        try{
            System.out.println("Officer takes the files");
            Thread.sleep(1000);
            System.out.println("officer work completed");
        }
        catch(Exception e){
            e.printStackTrace();;
        }
    }
}
class TestDrive extends Thread{
    public void run(){
        try{
            System.out.println("Test drive start");
            Thread.sleep(1000);
            System.out.println("test drive End");
        }
        catch(Exception e){
            e.printStackTrace();;
        }
    }
}

public class JoinMethod extends Thread {
        public static void main(String[] args) throws InterruptedException {
            
            Medical medical =new Medical();
            medical.start();

            medical.join();

            TestDrive testDrive=new TestDrive();
            testDrive.start();

            testDrive.join();

            OfficerSign officerSign=new OfficerSign();
            officerSign.start();
            
        }
}
