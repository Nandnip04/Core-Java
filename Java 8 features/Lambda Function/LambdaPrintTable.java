import java.util.*;

interface Table {
    public  void printTable(int num);
}

public class LambdaPrintTable{
    public static void main(String                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      [] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number for print a table :");
        int num=sc.nextInt();

        Table t1=(n)->{
            System.out.println("Table of "+n+" are :");
            for(int i=1;i<=10;i++){
                System.out.println(i*n);
            }
        };

        t1.printTable(num);
    }
}