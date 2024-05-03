import java.util.*;
public class SetDemo{
    public static void main(String[] args) {
        
        Set s=new HashSet();

        s.add("A");
        s.add("B");
        s.add("C");
        s.add("E");
        s.add("B"); // dublicates are not allowed
        s.add("F");

        Iterator itr=s.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Size of set :"+s.size());
        System.out.println("is C present in set :"+s.contains("C"));
        
        s.remove("F");
        System.out.println("After removing F set  :"+s);
        System.out.println("is set empty :"+s.isEmpty());
        System.out.println("Set : "+s.getClass().getName());

    }
}