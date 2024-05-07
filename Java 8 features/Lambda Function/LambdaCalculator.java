import java.util.*;
interface  Calculator{
    public void calc(int a,int b);
}
public class LambdaCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two integer values :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        Calculator c1 = (x,y)->{
            System.out.println("Multiplication of num "+a+" and " +b+" : "+(a*b));
        };

        Calculator c2=(x,y)->{
            System.out.println("Addition of num "+a+" and " +b+" : "+(a+b));
        };

        Calculator c3=(x,y)->{
            System.out.println("Division of num "+a+" and " +b+" : "+(a/b));

        };

        Calculator c4=(x,y)->{
            System.out.println("Substration of num "+a+" and " +b+" : "+(a-b));

        };
        
        c1.calc(a, b);
        c2.calc(a, b);
        c3.calc(a, b);
        c4.calc(a, b);

    }

}