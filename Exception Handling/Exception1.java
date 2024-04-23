import java.util.*;
public class Exception1{
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter two numbers for division:");
        int fnum=sc.nextInt();
        int snum=sc.nextInt();

        try{
            int ans=fnum/snum;
            System.out.println("division of "+fnum+" and "+snum+" is : "+ans);
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }

        System.out.println("hello programmer!!!!");
    }
}