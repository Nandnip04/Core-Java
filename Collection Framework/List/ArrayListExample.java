import java.util.*;
public class ArrayListExample{
    public static void main(String[] args) {
        ArrayList a=new ArrayList();

        //add()
        a.add("A");
        a.add(10);
        a.add("A");
        a.add(null);
        System.out.println("Array list :"+a);

        //get()
        System.out.println(a.get(1));

        //remove()
        a.remove(2);
        System.out.println(a);

        a.add(2,"B");
        System.out.println(a);

        a.add("N");
        a.add(5.5);
        a.add("A");
        System.out.println(a);

        //set()
        a.set(3,"C");
        System.out.println(a);

        //indexOf()
        System.out.println(a.indexOf("N"));

        //lastIndexOf()
        System.out.println(a.lastIndexOf("A"));

        System.out.println("List Iterator :"+a.listIterator());
    }
}