import java.util.*;

import javax.swing.RowFilter.Entry;


public class HMapDemo{
    public static void main(String[] args) {
        
        Map<Integer,String> hmap=new HashMap<>();
        hmap.put(1,"xyz");
        hmap.put(3,"pqr");
        hmap.put(2,"lmn");
        hmap.put(4,"def");
        hmap.put(5,"rty");
        hmap.put(4,"iop");
        System.out.println("All entries from map are :");
        Set<java.util.Map.Entry<Integer, String>> eset=hmap.entrySet();
        for(java.util.Map.Entry<Integer, String> e:eset){
            System.out.println(e.getKey()+" : "+e.getValue());
        }

        System.out.println("All keys from eset :");
        for(Integer k:hmap.keySet()){
            System.out.println(k);
        }

        System.out.println("Value associated with key 4 :"+hmap.get(4));

        System.out.println("Is key 2 presrnt in hmap :"+hmap.containsKey(2));
        System.out.println("Is value pqr present in hmap :"+hmap.containsValue("pqr"));

        hmap.remove(4);
        hmap.remove(2,"XYZ");

        System.out.println("After removal all entries from hmap are :");
        for(java.util.Map.Entry<Integer,String> e:eset){
            System.out.println(e.getKey()+":"+ e.getValue());
        }

        
    }
}