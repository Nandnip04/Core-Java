import java.util.*;
public class VectorDemo{
    public static void main(String[] args) {
        
        Vector v=new Vector();

        System.out.println("Vactor default capacity :"+v.capacity());

        for(int i=1;i<=10;i++){
            v.addElement(i);
        }
        System.out.println(v);

        System.out.println("after adding elements vector capacity :"+v.capacity());

        v.addElement("A");
        System.out.println(v.capacity());

        System.out.println("5 present at index :"+v.indexOf(5));
        
        System.out.println("is vector empty :"+v.isEmpty());

        v.remove(7);
        System.out.println(v);

        //remove all object into vector 
        v.clear();
        System.out.println("is vector empty :"+v.isEmpty());
    }
}