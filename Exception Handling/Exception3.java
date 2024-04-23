import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="race of finding erros";
        System.out.println("Enter index for character to be displayed :");

        try{
            int index=sc.nextInt();
            System.out.println("character present in str at given index : "+str.charAt(index));
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("please enter index within the range 0-20");
        }
        catch(InputMismatchException ex){
            System.out.println("Please Enter valid int value");
        }
    }
}