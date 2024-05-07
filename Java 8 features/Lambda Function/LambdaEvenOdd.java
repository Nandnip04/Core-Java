import java.util.*;
interface ChackEvenOdd{
    public void chack(int a);

    static void demo(){
        System.out.println("this is a Even ,Odd program using lambda Function.....");
    }
}

public class LambdaEvenOdd {
    public static void main(String[] args) {

        ChackEvenOdd.demo();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number for chacking odd or even :");
        int a=sc.nextInt();

        ChackEvenOdd e1=(x)->{
            if(x%2==0){
                System.out.println(x+" is Even number");
            }
            else{
                System.out.println(x+" is Odd number");
            }
        };

        e1.chack(a);
    }
}
