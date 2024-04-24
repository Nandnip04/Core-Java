class YoungerAge extends RuntimeException{
    YoungerAge(String msg){
        super(msg);
    }
}
public class MultiThread1{

    public static void main(String []args){
        int age=21;
        if(age<18){
            throw new YoungerAge("you are note eligible for vote.");
        }
        else{
            System.out.println("you are eligible for vote");
        }
    }
}