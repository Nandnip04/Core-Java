import java.util.*;
public class Exception4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.println("Enter any String : ");
        String str=sc.nextLine();

        System.out.println("Enter Index for find character : ");

        try{
            int index=sc.nextInt();
            System.out.println("Character :"+str.charAt(index)+", present in str at index :"+index);
        }
        catch(StringIndexOutOfBoundsException|InputMismatchException e){
            if(e instanceof StringIndexOutOfBoundsException){
                System.out.println("Exception :Enter index ,that is belongs to String length ");
            }
            else if( e instanceof InputMismatchException){
               System.out.println("Exception : Enter integer value only ");
            }
        }
        finally{
            System.out.println("I will always be executed ");
        }

    }
}
