import java.util.*;
class EvenException extends RuntimeException{
    EvenException(String msg){
        super(msg);
    }
}
public class MultiThread2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number :");
        int num=sc.nextInt();
        if(num%2!=0){
            throw new EvenException("number is odd");
        }
        else{
            System.out.println("number is even");
        }
    }
}
