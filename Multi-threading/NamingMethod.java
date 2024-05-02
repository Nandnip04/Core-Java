public class NamingMethod {

    //getName(), currentThread(), setName() , isAlive()
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Nandni");
        System.out.println("Current Thread name:"+Thread.currentThread().getName());

    
    }
}
