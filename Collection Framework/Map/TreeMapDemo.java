import java.util.*;

public class TreeMapDemo{
    public static void main(String[] args) {
        Map<String,String> tmap=new TreeMap<>();

        tmap.put("id","05");
        tmap.put("name","nandni");
        tmap.put("branch","CS");
        tmap.put("address","Arud");

        System.out.println("All entries from tree map are :");
        Set<java.util.Map.Entry<String,String>> eset=tmap.entrySet();

        for(java.util.Map.Entry<String, String> e:eset){
            System.out.println(e.getKey()+" : "+e.getValue());
        }

    }
}