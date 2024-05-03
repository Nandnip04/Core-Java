import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        
        LinkedHashSet l=new LinkedHashSet();

        l.add("B");
        l.add("A");
        l.add("C");
        l.add("Z");
        l.add(null);
        l.add(10);
        System.out.println(l);
        System.out.println("Inserting dublicates : "+l.add("C"));
    }
}
