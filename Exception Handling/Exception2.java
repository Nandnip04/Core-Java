import java.util.*;
public class Exception2 {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String str="race of finding erros";
        System.out.println("Enter index for character to be displayed :");

        int index=sc.nextInt();
        try{
            System.out.println("character present in str at given index : "+str.charAt(index));
        }
        catch(StringIndexOutOfBoundsException e){
            // e.printStackTrace();
            System.out.println("please enter index within the range 0-20");
        }


    }
}
