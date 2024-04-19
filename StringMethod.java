public class StringMethod {
    public static void main(String [] args ){

        //length()
        String name="nandni";
        int i=name.length();
        if(i==0){
            System.out.println("name is empty");
        }
        else{
            System.out.println("length of "+name+" is :"+i);
        }

        //isEmpty
        System.out.println(name.isEmpty());


        //trim()
        String name2=" Nandni Patel ";
        System.out.println(name2.trim());
        System.out.println(name2.trim().length());
        

        //equals()    ,  equalsIgnoreCase()
        String a1=" hello ";
        String a2=" Hello ";
        String a3=new String ("hyyy");
        String a4=new String ("hyyy");
        System.out.println(a1.equals(a2));
        System.out.println(a3.equals(a4));
        System.out.println(a1.equalsIgnoreCase(a2));

        //compareTo() , compareToIgnoreCase()
        String b1="A";
        String b2="a";
        System.out.println(b1.compareTo(b2));
        System.out.println(b2.compareTo(b1));
        System.out.println(b2.compareTo(b2));
        System.out.println(b1.compareToIgnoreCase(b2));


        //concat()
        String  c1="Nandni";
        String c2=" Patel";
        System.out.println(c1.concat(c2));

        //join()
        System.out.println(String.join("!!!!!!!!!", c1,c2));


        //subString() , subSequence()
        String d1="this is String method";
        System.out.println(d1.substring(5));
        System.out.println(d1.substring(6,13));
        System.out.println(d1.subSequence(2, 9));

    
        //replace() , replaceFirts(), replaceAll
        String e1="i am software engineer";
        System.out.println(e1.replace("i", "we"));
        System.out.println(e1.replaceFirst("i", "we"));
        System.out.println(e1.replaceAll("i", "we"));
        // System.out.println(e1.replaceAll("is(.)","was"));
        // System.out.println(e1.replaceAll("is(.*)","am"));


        //indexOf() , lastIndexOf(), charAt() ,contains() , startWith(), endsWith()
        String str="Priyanka";
        System.out.println(str.indexOf('y'));
        System.out.println(str.lastIndexOf('a'));
        System.out.println(str.charAt(5));
        System.out.println(str.contains("an"));
        System.out.println(str.startsWith("ri"));
        System.out.println(str.endsWith("ka"));

        //toLowerCase() toUpperCase() valueOf() 
        String str2="hy I am NANDNI";
        System.out.println(str2.toLowerCase());
        System.out.println(str2.toUpperCase());
        System.out.println(String.valueOf(str2));
        

        //toCharArray()
        char c[]=str2.toCharArray();
        System.out.println(c);
        if(c.length==str2.length()){
            System.out.println("equals");
        }
        else{
            System.out.println("Not equals");
        }


        //split()
        String n="my_nanme_is_nandni";
        String nstr[]=n.split("_");
        for(String newStr:nstr){
            System.out.println(newStr);
        }

    }
}
