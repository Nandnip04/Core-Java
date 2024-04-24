import java.util.*;
class Marriage extends RuntimeException{
    Marriage(String str){
        super(str);
    }
}

public class ThrowExample1 {
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number for checking eligibility for marriage...");
    int age=sc.nextInt();

    if(age<22 || age>35){
        throw new Marriage("Your are not eligible for marriage");
    }
    else{
        System.out.println("you are eligible for marriage ");
    }
}
}
