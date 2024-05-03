import java.util.*;
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet h=new HashSet();

        h.add("B");
        h.add("C");
        h.add("D");
        h.add("Z");
        h.add(null);
        h.add(10);

        Iterator itr=h.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        } 

        System.out.println("2nd time inserting B :"+h.add("B")); //dublicates are not allowed
        System.out.println("Size of hashset :"+h.size());
        System.out.println("2nd time inserting null :"+h.add(null)); 
    }
}
