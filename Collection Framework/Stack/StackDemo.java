import java.util.*;
public class StackDemo{
    public static void main(String[] args) {
      
        Stack s=new Stack();

        //insert object into stack
        s.push("Nandni");
        s.push(5);
        s.push("hello");
        s.push(2.112);

        //Accessing object one by one 
        Iterator itr=s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //remove  object into stack
        s.pop();
        System.out.println(s);

        //peek()-> return top of the stack 
        System.out.println("top of the stack:"+s.peek());

        //empty()->chack stack is empty or not 
        System.out.println("is stack empty :"+s.empty());

        //search()
        System.out.println("Nandni present at index :"+s.search("Nandni"));
    }
}