public class StringBuilderExample {
    public static void main(String []args){

        StringBuilder sb=new StringBuilder("hello");
        //length()
        System.out.println("length:"+sb.length());

        //capacity()
        System.out.println("capacity:"+sb.capacity());

        //append()
        System.out.println("append:"+sb.append("world"));

        //insert()
        System.out.println("insert:"+sb.insert(7," duniya"));

        //reverse()
        System.out.println("reverse:"+sb.reverse());
        System.out.println(sb.reverse());

        //delete()
        System.out.println("delete:"+sb.delete(8, 13));

        //deleteCharAt()
        System.out.println(sb.deleteCharAt(5));

        //replace()
        System.out.println(sb.replace(5, 14, " duniya"));

        //ensureCapacity()
        StringBuilder sb1=new StringBuilder();
        System.out.println("capacity :"+sb1.capacity());
        System.out.println(sb1.append("hello"));
        System.out.println("capacity:"+sb1.capacity());
        sb1.ensureCapacity(6);
        System.out.println("ensure capacity :"+sb1.capacity());

        //charAt()
        System.out.println("charAt :"+sb1.charAt(3));

        //indexof()
        System.out.println("indexOf :"+sb1.indexOf("o"));

        //lastIndexOf()
        System.out.println("lastIndexOf :"+sb1.lastIndexOf("l"));

        //subString()
        StringBuilder sb2=new StringBuilder("i am software engineer");
        System.out.println("subString :"+sb2.substring(5));

        //subSequence
        System.out.println("subSequence :"+sb2.subSequence(3, 7));

        //toString()
        System.out.println("toString :"+sb2.toString());

    }
}
