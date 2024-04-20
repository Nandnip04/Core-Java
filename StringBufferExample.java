public class StringBufferExample {
    public static void main(String[] args) {

        //capacity()
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity()); //16

        sb.append("hello");
        System.out.println(sb.capacity());

        sb.append("nandni patel");
        System.out.println(sb.capacity());

        //length()
        System.out.println("Length of String :"+sb.length());

        //append()
        StringBuffer sb1=new StringBuffer("nandni");
        System.out.println("append :"+sb1.append(" patel"));

        //charAt()
        System.out.println(sb1.charAt(5));

        //delete()
        StringBuffer sb2=new StringBuffer("this is stringBuffer");
        System.out.println(sb2.delete(5, 10));

        //deleteCharAt()
        System.out.println("index :"+sb2.charAt(6));
        System.out.println(sb2.deleteCharAt(6));

        //equals()
        StringBuffer str1=new StringBuffer("hello");
        StringBuffer str2=new StringBuffer("hello");
        System.out.println(str1.equals(str2));

        //indexOf()
        StringBuffer sb3=new StringBuffer("hello world");
        System.out.println(sb3.indexOf("n"));
        System.out.println(sb3.indexOf("o"));

        //lastIndexOf()
        System.out.println(sb3.lastIndexOf("o"));
        
        //insert()
        System.out.println(sb3.insert(6,"duniya"));

        //replace()
        StringBuffer sb4=new StringBuffer("i am engineer");
        System.out.println(sb4);
        System.out.println(sb4.replace(5, 13, "software Developer"));

        //reverse()
        System.out.println(sb4.reverse());

        //capacity() , ensureCapacity()
        StringBuffer sb5=new StringBuffer("Nandni");
        System.out.println("capacity : "+sb5.capacity());
        sb5.ensureCapacity(20);
        System.out.println("capacity after set ensure capacity : "+sb5.capacity());

        sb5.ensureCapacity(27);
        System.out.println("capacity after set ensure capacity : "+sb5.capacity());

        //setCharAt()
        StringBuffer sb6=new StringBuffer("abcde");
        sb6.setCharAt(4, 'n');
        System.out.println(sb6);


        //setLength()
        StringBuffer sb7=new StringBuffer("pokemon");
        sb7.setLength(5);
        System.out.println(sb7);

        //trimToSize()
        StringBuffer sb8=new StringBuffer();
        sb8.ensureCapacity(100);
        System.out.println(sb8.capacity());
        sb8.append("hello");
        System.out.println(sb8.capacity());
        sb8.trimToSize();
        System.out.println(sb8.capacity());



        
    }
}
